<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

  <head>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
   <script src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js"></script>
</head>
<body>

<div class="topnav">
<div class="topnav-title">
    <div class="title">Aaradhya Aqua</div>
  </div>
  
  <div class="topnav-right">
    <a  href="${pageContext.request.contextPath}/index" >Home</a>
    <a class="active">Login</a>
  </div>
</div>  
<div class="page">
  <div class="clslogin">
    
      <div class="imgcontainer">
          <h1>Admin Login</h1>
      </div>

      <div class="container">
       
        
        <input id="unameId" type="text" placeholder="Enter Username" name="uname">
		
		
		
       
        <input id="unamePassword" type="password" placeholder="Enter Password" name="psw" required>
	<p>	
	 <span id="error" class="error"></span>
</p>

         <button type="submit" onclick="myForgotFunction()" class="clsbtnlogin">Forgot Password</button>
		 <button type="submit" onclick="myLoginFunction()"  class="clsbtnlogin">Login</button>

       
      </div>
      
    
  </div>
</div>
<div>
  <div class="clsfooter">
  <p>Copyright @ www.aradhyaaqua.com</p>
  </div>
</div>


</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/login.js"></script>
<script type="text/javascript">
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

