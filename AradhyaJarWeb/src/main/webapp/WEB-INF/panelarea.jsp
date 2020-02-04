<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homestyle.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
    
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/lib/css/alertify.css" /> 
<!-- jQuery Modal -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<!--ALertify  -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/alertify.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/lib/alertify.min.js"></script>

</head>

<body>

<div class="topnav">
  <span class="title">Aaradhya Aqua Admin</span>
  
</div>  
<div class="clsForm">
      <div class="vertical-menu">
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-home"></i>  Home</a>
         <a href="${pageContext.request.contextPath}/panel/transaction"><i class="clsicon fa fa-tags"></i> Transaction</a>
          <a href="${pageContext.request.contextPath}/panel/daybook" ><i class="clsicon fa fa-book-open"></i> Daybook</a>
           <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i>  Print Bill</a>
           <a href="${pageContext.request.contextPath}/panel/report"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
         <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area" class="active" ><i class="clsicon fa fa-globe-asia"></i>Area</a>
          <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
      
      </div> 
  <div class="clsFromContent">
   		
  
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-globe-asia"></i><span>Add New Area <span>
      </div>
        <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	 <div class="clsform-group" style="width:35%;">
      							  <label for="uname"><b>Area Name</b></label>
       								 <input id="areaname" type="text" placeholder="Area">
     					 </div>
     					 <div class="clsform-group" style="width:15%;">
      							  <label for="uname"><b>Jar Rate</b></label>
       								 <input id="ajarrate" type="number" placeholder="Area">
     					 </div>
     					 	 <div class="clsform-group" style="width:15%;">
      							  <label for="uname"><b>Bottel Rate</b></label>
       								 <input id="abotrate" type="number" placeholder="Area">
     					 </div>
     					 <div class="clsform-group" style="width:15%;">
     					   <label for="uname"><b>&nbsp;</b></label>
      							  <button type="submit" onclick="addnewArea()" class="clsbtn">Add</button>
     					 </div>
        		  </div>
        		  
        </div>
         	<div class="clsmodal-header">
        <i class="clsicon fa fa-globe-asia"></i><span>List Of Area <span>
      </div>
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="areatable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Area Name</th>
    <th>Jar rate</th>
    <th>Bottel Rate</th>
   
    <th>Options</th>
  </tr>
  </thead>
  <tbody>
  
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>



</body>

<div id="modalEdit" class="modal">
  <p>Edit Area Details</p>
  <table style="float:center;" id="jartable" width="99%">
  <thead class="clsTable">
  <tr>
    
    <th>Area Name</th>
    <th>Jar rate</th>
    <th>Bottel Rate</th>
       <th>Action</th>
  </tr>
  </thead>
  <tbody>
  
  </tbody>
 
</table> 

</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/area.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

