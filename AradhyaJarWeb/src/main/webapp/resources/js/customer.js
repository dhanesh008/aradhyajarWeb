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
                    
                    '<td><button type="button" onclick="openPopUp(\''+myJSON+'\')" class="clsbtnop"><i class="fa fa-edit"></i></button></td>' +
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
				alert("Empty Fields");
			}
		else
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
					 alert(data.msg);
				  }
			});
				  
			
	}
}

function formateDate(today)
{
	return today;
	}

function openPopUp(name)
{
	 var obj=JSON.parse(name);
	console.log(obj);
	}
