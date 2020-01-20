$(window).on('load', function() {
	
	loadtablewithdata();
	
});
function addnewArea()
{
	console.log($("#areaname").val());
	console.log($("#ajarrate").val());
	console.log($("#abotrate").val());
	if($("#areaname").val()==null || $("#areaname").val()=='' || $("#ajarrate").val()=='' || $("#abotrate").val()==null || $("#abotrate").val()=='')
		{
			alert("Empty fields");
		}
	else
		{
			if(isNaN($("#ajarrate").val())  && isNaN($("#abotrate").val()) )
				{
				alert("iNVALID rATE fields");
				}
			else
				{
				$.ajax({
					  type: "POST",
					  url: contextPath+"/add/newarea",
					  cache: false,
					  data:{
						  "areaname":$("#areaname").val(),
						  "jarRate":$("#ajarrate").val(),
						  "botrate":$("#abotrate").val()
					  },
					  success: function(data)
					  {
					    if(data.result==1)
					    	{
					    	alert(data.msg);
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
function loadtablewithdata()
{
	
	
	var table = $("#areatable tbody");
	 
    $.ajax({
    	url: contextPath + "/list/getareaList",
        method: "GET",
       
        success: function (data) {
        	console.log(data);
            table.empty();
            var i=1;
            $.each(data, function (a, b) {
                table.append("<tr><td>"+i+"</td>" +
                    "<td>"+b.areaName+"</td>"+
                    "<td>" + b.areaJarRate + "</td>" +
                    "<td>" + b.areaBotRate + "</td>" +
                    "<td>" + b.areaStatus + "</td>" +
                    " <td><button type='button' class='clsbtnop'><i class='fa fa-edit'></i></button><button type='button' class='clsbtnop'><i class='fa fa-trash'></i></button></td>" +
                    "</tr>");
                i++;
            });
 
            $('#areatable').DataTable(
             	    {
                 	 
         searching:false,
         destory:false,
         "lengthChange": false,
         "pageLength": 5,
         "autoWidth": true
                 	    });	
        }
    });
	
    
	}

	
