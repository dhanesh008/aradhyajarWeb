
$(window).on('load', function() {
	loadtablewithdata();
});
function loadtablewithdata()
{
	
	
	var table = $("#ordertable tbody");
	 
    $.ajax({
    	url: contextPath + "/order/getopenorderList",
        method: "GET",
       
        success: function (data) {
        	console.log(data);
            table.empty();
            var i=1;
            $.each(data, function (a, b) {
            	
                table.append("<tr><td>"+i+"</td>" +
                		"<td>"+b.customerName+"</td>" +
                		"<td>"+b.address+"</td>"+
   "<td>"+b.orderDate+"</td>" +
   		"<td>"+b.mobileNo1+"<br>"+b.mobileNo2+"</td>" +
   		"<td>"+b.jarNo+" X "+b.jarRate+"</td>" +
   		"<td>"+b.botNo+" X "+b.botRate+"</td>" +
    "<td>"+b.total+"</td>" +
    "<td>"+b.orderDeposite+"</td>" +
    "<td>"+b.pending+"</td>" +
        "<td><button type='button' onclick='transactionModel()' class='clsbtnop'><i class='fa fa-edit'></i></button></td></tr>");
                i++;
            });
            
 
            
        }
    });
	
    
	}

function addnewCustomer()
	{
			
		if(
				$("#cusname").val()=='' ||  $("#cusname").val()==null ||
				$("#add1").val()=='' ||  $("#add1").val()==null ||
				$("#mob1").val()=='' ||  $("#mob1").val()==null ||
				$("#mob2").val()=='' ||  $("#mob2").val()==null ||
				$("#date").val()=='' ||  $("#date").val()==null ||
				$("#time").val()=='' ||  $("#time").val()==null ||
				$("#deposite").val()=='' ||  $("#deposite").val()==null ||
				$("#jar").val()=='' ||  $("#jar").val()==null ||
				$("#jarrate").val()=='' ||  $("#jarrate").val()==null ||
				$("#bot").val()=='' ||  $("#bot").val()==null ||
				$("#botrate").val()=='' ||  $("#botrate").val()==null ||
				$("#ordedetails").val()=='' ||  $("#ordedetails").val()==null)
			{
				alert("Empty Fields");
			}
		else
			{
				if($("#mob1").val().length==10 && $("#mob2").val().length==10)
						{
					$.ajax({
						  type: "GET",
						  url: contextPath+"/order/savenewOrder",
						  cache: false,
						  data:{
							  "cusname":$("#cusname").val(),
							  "address":$("#add1").val(),
							  "mobile1":$("#mob1").val(),
							  "mobile2":$("#mob2").val(),
							  "date":$("#date").val(),
							  "time":$("#time").val(),
							  "depoiste":$("#deposite").val(),
							 
							  "jar":$("#jar").val(),
							  "jarrate":$("#jarrate").val(),
							  "bot":$("#bot").val(),
							  "botrate":$("#botrate").val(),
							  "orderDetails":$("#ordedetails").val()
						  },
						  success: function(data)
						  {
							  console.log(data);
						  }});
						}
				else
					{
					alert("Invalid Mobile No");
					}
			}
	
	}

function transactionModel()
	{
		
	}
