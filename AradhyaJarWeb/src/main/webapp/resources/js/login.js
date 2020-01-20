function myLoginFunction()
{


	
	$("#error").hide();
	if($("#unameId").val()==null || $("#unameId").val()=='' || $("#unamePassword").val()==null || $("#unamePassword").val()=='' )
		{
		$("#error").show();
		document.getElementById("error").innerHTML ="Please Enter Email Id and Password !";
		}
	else
		{
		$("#error").hide();
			if(ValidateEmail($("#unameId").val())==true)
					{
						$.ajax({
							  type: "POST",
							  url: contextPath+"/loginProcess?userid="+$("#unameId").val()+"&userpassword="+$("#unamePassword").val(),
							  cache: false,
							  success: function(data){
							    if(data.result==1)
							    	{
							        window.location="/panel/home";
							    	}
							    else
							    	{
							    	//new PopUp Add
							    	alert(data.msg);
							    	}
							  
							  }
							});
					}
			else
				{
				$("#error").show();
				document.getElementById("error").innerHTML ="Please Enter Valid Email Id !";
				}
		}
	
	
	}

function myForgotFunction()
{
	
	}

function ValidateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail))
  {
    return (true);
  }
 else
	 {
    return (false);
	 }
 
}