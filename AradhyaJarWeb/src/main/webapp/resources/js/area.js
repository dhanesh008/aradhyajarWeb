

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
            	
            	var myJSON = JSON.stringify(b); 
                table.append("<tr><td>"+i+"</td>" +
                    "<td>"+b.areaName+"</td>"+
                    "<td>" + b.areaJarRate + "</td>" +
                    "<td>" + b.areaBotRate + "</td>" +
                  
                     '<td><button type="button" onclick="openPopup(\''+b.areaUuid+'\',\''+b.areaJarRate+'\',\''+b.areaBotRate+'\',\''+b.areaName+'\')" class="clsbtnop"><i class="fa fa-edit"></i></button></td>' +
                    "</tr>");
                i++;
            });
            
 
            
        }
    });
	
    
	}

	function openPopup(uuid,jr,br,an)
	{
		console.log(uuid);
		var table = $("#jartable tbody");
		   table.empty();
		   table.append("<tr>"+
                   "<td >"+an+"</td>"+
                   "<td id='newjr' contentEditable='true'></td>" +
                   "<td id='newbr' contentEditable='true'></td>" +
                   '<td><button type="button" onclick="update(\''+$("#newjr").text()+'\',\''+$("#newbr").text()+'\',\''+uuid+'\')" class="clsbtnop"><i class="fa fa-save"></i></button></td>'+
      
                   "</tr>");
		$("#modalEdit").modal();
		
	}
	function closePopup()
	{
		$("#modalEdit").modal('hide');
	}
