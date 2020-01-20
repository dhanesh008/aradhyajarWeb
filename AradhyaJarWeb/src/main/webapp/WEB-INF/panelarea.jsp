<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homestyle.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
    
   <script src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/DataTables/datatables.min.css"/>
 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/DataTables/datatables.min.js"></script>
</head>
<body>

<div class="topnav">
  <span class="title">Aaradhya Aqua Admin</span>
  
</div>  
<div class="clsForm">
      <div class="vertical-menu">
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-home"></i>  Home</a>
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-money-bill-alt"></i>  Transaction</a>
       <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-receipt"></i>  Bill</a>
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-book-open"></i> Day report</a>
        <a href="./stock.html"><i class="clsicon fa fa-cart-plus"></i>   Stock</a>
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-box"></i>  New Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>  New Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area" class="active"><i class="clsicon fa fa-globe-asia"></i> New Area</a>
       <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-chart-line"></i>   Report</a>
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-globe-asia"></i><span>Area <span>
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
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="areatable" width="153%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Area Name</th>
    <th>Jar rate</th>
    <th>Bottel Rate</th>
    <th>Status</th>
    <th>Options</th>
  </tr>
  </thead>
  <tbody>
  
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>
<div>
  <div class="clsfooter">
  
  </div>
</div>


</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/area.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

