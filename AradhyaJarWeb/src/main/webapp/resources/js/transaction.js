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

function updateTransaction(uuid)
	{
	var tablehead=$("#custrans thead");
	tablehead.empty();
		tablehead.append("<tr><th colspan='6'>Dhaneshkumar Solanki</th></tr><tr><th colspan='2'>PickUp</th><th colspan='2'>Delivery</th><th>Payment</th><th rowspan='2'>Action</th></tr><tr><th>Jar</th><th>Bottel</th><th>Jar</th><th>Bottel</th><th>Payment</th></tr>")
	
	var table = $("#custrans tbody");
		table.empty();
	 table.append("<tr>"+
			 "<td style='display:none;'>abc</td>"+
   "<td id='jarpick' contentEditable='true'>0</td>"+
    "<td id='botpick'  contentEditable='true'>0</td>"+
    "<td id='jardel' contentEditable='true'>0</td>"+
    "<td id='botdel' contentEditable='true'>0</td>"+
    "<td  id='pay' contentEditable='true'>0</td>"+
    '<td><button type="button" onclick="newTransaction(\''+uuid+'\')" class="clsbtnop"><i class="fa fa-save"></i></button>'+
    "</tr>");
	$("#cusTrans").modal();
	}

function newTransaction(uuid)	
	{
		console.log(uuid);
		if($("#jarpick").text()==null || $("#jarpick").text()=='' ||
				$("#botpick").text()==null || $("#botpick").text()=='' ||
					$("#jardel").text()==null || $("#jardel").text()=='' ||
					$("#jarpick").text()==null || $("#jarpick").text()=='' ||
					$("#botdel").text()==null || $("#botdel").text()=='' ||
					$("#pay").text()==null || $("#pay").text()=='')
				{
				alert("Empty values");
				}
			else
				{ 
				if(($("#jarpick").text() || $("#jarpick").text())==0 &&
				($("#botpick").text() || $("#botpick").text())==0 &&
					($("#jardel").text() || $("#jardel").text())==0 &&
						($("#botdel").text() || $("#botdel").text())==0 &&
					($("#pay").text() || $("#pay").text())==0)
						{
					alert("All Values are 0");
						}
				else
					{
					$.ajax({
						  type: "GET",
						  url: contextPath+"/cus/newTrans",
						  cache: false,
						  data:{
							  "uuid":uuid,
							  "jarpick":$("#jarpick").text(),
							  "botpick":$("#botpick").text(),
							  "jardel":$("#jardel").text(),
							  "botdel":$("#botdel").text(),
							  "amount":$("#pay").text()
						  },
						  success: function(data)
						  {
						    console.log(data);
						    
						  }
						});
					}
				}
	}


function loadtablewithdata(areauuid)
	{
		console.log(areauuid);
		
		var table = $("#custlisttable tbody");
		
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
			                    
			                    "<td>" + b.address + "</td>" +
			                    "<td>" + b.mobile1 + "<br>"+b.mobile2+"</td>" +
			                    "<td>" + b.jar+"</td>" +
			                    "<td>" + b.bot+"</td>" +
			                    "<td>" + b.amount+"</td>" +
			                    
			                    '<td><button type="button" onclick="updateTransaction(\''+b.cusuuid+'\')" class="clsbtnop"><i class="fa fa-edit"></i></button></td>' +
			                    "</tr>");
			                i++;
			                console.log((b.custtdate));
			            });
		        	   }
	
		            
		        }
		    });
		
		
	
	}

function loadEmptyTable()
	{
	var table = $("#custlisttable tbody");
	table.empty();
 table.append("<tr><td colspan='9'>Not Records Available</td></tr>");
	}
