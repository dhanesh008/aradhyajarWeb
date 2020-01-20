$(document).ready( function () {
   

    $.ajax({
        type: "GET",
    	url: contextPath + "/list/getareaList",
        dataType: "json",
        success: function (data) {
        	
        	
            $.each(data,function(i,obj)
            {
            
             var div_data="<option value="+obj.areaId+">"+obj.areaName+"</option>";
            
             $(div_data).appendTo('#arealist'); 
            });  
            }
      });
    



    
} );