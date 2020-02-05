$(window).on('load', function() 
		{
	loadEmptyTable();
    $.ajax({
        type: "GET",
    	url: contextPath + "/list/getareaList",
        dataType: "json",
        success: function (data) {
        	
        	
            $.each(data,function(i,obj)
            {
            
             var div_data="<option value="+obj.areaUuid+">"+obj.areaName+"</option>";
            
             $(div_data).appendTo('#arealist'); 
            });  
            }
      });
    
    
    $('#arealist').change(function()
    			{
    		
    			if($(this).val()=='' || $(this).val()==null)
    					{
    						loadEmptyTable();
    					}
    			else
    				{
    					console.log($(this).val());
    					loadtablewithdata($(this).val());
    				}
    				
    			});
    
    
        
} );


function loadtablewithdata(areauuid)
	{
	$("#printreport").show();
	var table = $("#printtable tbody");
	
	 $.ajax({
	    	url: contextPath + "/list/custlist",
	        method: "GET",
	       data:{
	    	   "areauuid":areauuid
	       },
	        success: function (data) 
	        {
	        	table.empty();
	        	console.log(data);
	           if(data.length==0)
	        	   	{
	        	   loadEmptyTable();
	        	   	}
	           else
	        	   {
		            var i=1;
		            $.each(data, function (a, b) {
		            
		            	
		                table.append("<tr><td>"+i+"</td>" +
		                    "<td>"+b.cusname+"</td>"+
		                    
		                    "<td>" + b.address +
		                    "<br>" + b.mobile1 + "<br>"+b.mobile2+"</td>" +
		                    "<td>" + b.jar+"</td>" +
		                    "<td>" + b.bot+"</td>" +
		                    "<td>" + b.amount+"</td>" +
		                    
		                    '<td></td>' +
		                    '<td></td>' +
		                    '<td></td>' +
		                    '<td></td>' +
		                    '<td></td>' +
		                    "</tr>");
		                i++;
		            });
	        	   }

	            
	        }
	    });
	}

function loadEmptyTable()
{
	$("#printreport").hide();
var table = $("#printtable tbody");
table.empty();
table.append("<tr><td colspan='11'>Not Records Available</td></tr>");
}

function printdata()
{
	   const doc = new jsPDF();
	   doc.setFontSize(12);
	   doc.setFontStyle('bold');
	   doc.text(80,10,'Area Wise Report');
	  
	    doc.autoTable({html: '#printtable'});
	   doc.output('dataurlnewwindow');
	   // window.open(doc.save('table.pdf'), '_blank');
}



