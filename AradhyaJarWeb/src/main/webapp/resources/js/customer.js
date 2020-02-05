$(window).on('load', function() 
		{
	
	loadtablewithdata();
	
 
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
        
} );

function loadtablewithdata()
{
	
	var table = $("#areatable tbody");
	 
    $.ajax({
    	url: contextPath + "/list/getcustList",
        method: "GET",
       
        success: function (data) {
        	console.log(data);
            table.empty();
            var i=1;
            $.each(data, function (a, b) {
            	var myJSON = JSON.stringify(b);
            	
                table.append("<tr><td>"+i+"</td>" +
                    "<td>"+b.custName+"</td>"+
                    "<td>" + b.areaName + "</td>" +
                    "<td>" + b.custAddress1 + "</td>" +
                    "<td>" + b.mobileNo1 + "<br>"+b.mobileNo2+"</td>" +
                    "<td>" + b.deposite+"</td>" +
                    "<td>" + b.status+"</td>" +
                    
                    '<td><button type="button" onclick="openPopUp(\''+b.custUuid+'\',\''+b.custName+'\',\''+b.custAddress1+'\',\''+b.mobileNo1+'\',\''+b.mobileNo2+'\')" class="clsbtnop"><i class="fa fa-edit"></i></button></td>' +
                    "</tr>");
                i++;
                console.log((b.custtdate));
            });
            
        }
    });
    
    
	}

function addnewCustomer()
	{
		if($("#arealist").val()==null || $("#arealist").val()=='' ||
				$("#cusname").val()==null || $("#cusname").val()=='' ||  $("#add1").val()==null || $("#add1").val()=='' || 
				$("#add2").val()==null || $("#add2").val()=='' || $("#mob1").val()==null || $("#mob1").val()=='' || 
				$("#mob2").val()==null || $("#mob2").val()=='' || $("#deposite").val()==null || $("#deposite").val()==''
				)
			{
				alertify.error('All fields are empty');
			}
		else
			{
			console.log($("#mob2").val().length)
				console.log($("#mob1").val().length)
					if(	$("#mob2").val().length==10 && 	$("#mob1").val().length==10)
						{
						$.ajax({
							  type: "POST",
							  url: contextPath+"/add/newCustomer",
							  cache: false,
							  data:{
								  "areaname":$("#arealist option:selected").text(),
								  "areaUuid":$("#arealist").val(),
								  "cusname":$("#cusname").val(),
								  "address1":$("#add1").val(),
								  "address2":$("#add2").val(),
								  "mobile1":$("#mob1").val(),
								  "mobile2":$("#mob2").val(),
								  "deposite":$("#deposite").val(),
								  
							  },
							  success: function(data)
							  {
								  if(data.result==0)
									  {
									  alertify.success(data.msg);
									  loadtablewithdata();
									  $(":input").val('');
									  }
								  else
									  {
									  alertify.error(data.msg);
									  }
								 
							  }
							  
						});
						}
					else
						{
							alertify.error('Invalid Mobile No');	
						}
			
		
				  
			
	}
}

function formateDate(today)
{
	return today;
	}

function openPopUp(uuid,name,cadd,cmo1,cmo2)
{
	var table = $("#custdetails tbody");
	   table.empty();
	   table.append("<tr>"+
            "<td id='newcname' contentEditable='true'>"+name+"</td>"+
            "<td id='newcadd' contentEditable='true'>"+cadd+"</td>" +
            "<td id='newmob1' contentEditable='true'>"+cmo1+"</td>" +
            "<td id='newmob2' contentEditable='true'>"+cmo2+"</td>" +
            '<td><button rel="modal:close" type="button" onclick="update(\''+uuid+'\')" class="clsbtnop"><i class="fa fa-save"></i></button></td>'+

            "</tr>");
	$("#editcustomer").modal();
	}

function update(uuid)
	{
	if($("#newcname").text()==null || $("#newcname").text()=='' ||
			$("#newcadd").text()==null || $("#newcadd").text()=='' || $("#newmob1").text()==null || $("#newmob1").text()=='' || $("#newmob2").text()==null || $("#newmob2").text()=='')
	{
			alertify.error("Please Enter All Details");
	}
else
	{
	
	if(	$("#newmob1").text().length==10 && 	$("#newmob2").text().length==10)
		{
		$.ajax({
			  type: "POST",
			  url: contextPath+"/edit/customer",
			  cache: false,
			  data:{
				  "cusuuid":uuid,
				  "cusname":$("#newcname").text(),
				  "cusadd":$("#newcadd").text(),
				  "cusmob1":$("#newmob1").text(),
				  "cusmob2":$("#newmob2").text()
			  },
			  success: function(data)
			  {
			    if(data.result==1)
			    	{
			    		alertify.error(data.msg);
			    	}
			    else
			    	{
			    	
			    		closePopup();
			    		loadtablewithdata();
			    		alertify.success(data.msg);
			    	$(":input").val('');
			    	
			    	}
			    
			  }
			});
		}
	else
		{
			alertify.error('Invalid Mobile No');	
		}
	
	
	

	}
	}
function closePopup()
{
	$.modal.close();

}
