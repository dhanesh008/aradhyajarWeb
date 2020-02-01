
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
    '<td><button type="button" onclick="transactionModel(\''+b.orderUuid+'\')" class="clsbtnop"><i class="fa fa-save"></i></button>'+
    '<button type="button" onclick="detailsModel(\''+b.orderUuid+'\')" class="clsbtnop"><i class="fa fa-info"></i></button></td>' +
    "</tr>");
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

function transactionModel(uuid)
	{
	var tablehead=$("#ordertransaction thead");
	tablehead.empty();
		tablehead.append("<tr><th colspan='6'>Dhaneshkumar Solanki</th></tr><tr><th colspan='2'>Delivery</th><th colspan='2'>PickUp</th><th>Payment</th><th rowspan='2'>Action</th></tr><tr><th>Jar</th><th>Bottel</th><th>Jar</th><th>Bottel</th><th>Payment</th></tr>")
	var table = $("#ordertransaction tbody");
		table.empty();
	 table.append("<tr>"+
			 "<td style='display:none;'>"+uuid+"</td>"+
   "<td id='jarpick' contentEditable='true'>0</td>"+
    "<td id='botpick'  contentEditable='true'>0</td>"+
    "<td id='jardel' contentEditable='true'>0</td>"+
    "<td id='botdel' contentEditable='true'>0</td>"+
    "<td  id='pay' contentEditable='true'>0</td>"+
    '<td><button type="button" onclick="updateorder(\''+uuid+'\')" class="clsbtnop"><i class="fa fa-save"></i></button>'+
    "</tr>")
	   
	$("#orderTrans").modal();
	}


function updateorder(uuid)
	{
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
					  url: contextPath+"/order/trans",
					  cache: false,
					  data:{
						  "orderuuid":uuid,
						  "jarpick":$("#jarpick").text(),
						  "botpick":$("#botpick").text(),
						  "jardel":$("#jardel").text(),
						  "botdel":$("#botdel").text(),
						  "payment":$("#pay").text()
					  },
					  success: function(data)
					  {
					    if(data.result==0)
					    	{
					    	
					    	$("#orderTrans").hide();
					    	}
					    else
					    	{
					    	//new PopUp Add
					    	alert(data.msg);
					    	}
					    loadtablewithdata();
					  }
					});
				}
			}
			
		
	}

function detailsModel(uuid)
{
	var table = $("#orderdetails tbody");
	table.empty();
	$.ajax({
    	url: contextPath + "/order/orderlog",
        method: "GET",
       data:{
    	   "uuid":uuid
       },
        success: function (data) {
        	console.log(data);

            var i=1;
            $.each(data, function (a, b) {
            	
            	var myJSON = JSON.stringify(b); 
                table.append("<tr><td>"+i+"</td>" +
                		"<td>" + b.tdate + "</td>" +
                    "<td>"+b.jarPickup+"</td>"+
                    "<td>" + b.botPickup + "</td>" +
                    "<td>" + b.jarDelivered + "</td>" +
                    "<td>" + b.botDelivered + "</td>" +
                    "<td>" + b.payment + "</td>" +
                    
                    "</tr>");
                i++;
            });
            
 
            
        }
    });
	$("#orderdetails").modal();
	console.log(uuid);
	}

