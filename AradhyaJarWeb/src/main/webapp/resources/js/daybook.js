$(window).on('load', function() {
	loadtablewithdata();
});

function loadtablewithdata()
	{
	var table = $("#daytrantable tbody");
	 
    $.ajax({
    	url: contextPath + "/day/tranlist",
        method: "GET",
       
        success: function (data) 
        {
        	if(data.length==0)
        		{
        			loadEmptyTable
        		}
        	else
        		{
        	console.log(data);
            table.empty();
            var i=1;
            $.each(data, function (a, b) {
            	
            	var myJSON = JSON.stringify(b); 
                table.append("<tr><td>"+i+"</td>" +
                		"<td>"+b.transactionCustName+"</td>"+
                		"<td>"+b.transactionAreaName+"</td>"+
                		"<td>CASH</td>"+
                		"<td>"+b.transactionjarPick+"</td>"+
                		"<td>"+b.transactionBotPick+"</td>"+
                		
                		"<td>"+b.transactionjarDel+"</td>"+
                		"<td>"+b.transactionBotDel+"</td>"+
                		"<td>"+b.transactionAmount+"</td>"+
                		//transactionAmount
                  
                     '<td><button type="button" onclick="openPopup()" class="clsbtnop"><i class="fa fa-info"></i></button></td>' +
                    "</tr>");
                i++;
            });
            
        		}
            
        }
    });
	}

function loadEmptyTable()
{
	
var table = $("#daytrantable tbody");
table.empty();
table.append("<tr><td colspan='11'>Not Records Available</td></tr>");
}
