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
        <a href="${pageContext.request.contextPath}/panel/home" ><i class="clsicon fa fa-home"></i>  Home</a>
        <a href="${pageContext.request.contextPath}/panel/transaction"><i class="clsicon fa fa-tags"></i> Transaction</a>
        <a href="${pageContext.request.contextPath}/panel/daybook" class="active"><i class="clsicon fa fa-book-open"></i> Daybook</a>
         <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i> Print Bill</a>
         <a href="${pageContext.request.contextPath}/panel/report"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
        <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
        <a href="${pageContext.request.contextPath}/panel/customer"><i class="clsicon fa fa-user-plus"></i>Customer</a>
        <a href="${pageContext.request.contextPath}/panel/area" ><i class="clsicon fa fa-globe-asia"></i>Area</a>
         <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header" style="margin-top: 2px">
        <i class="clsicon fa fa-home"></i><span>Day Count<span>
      </div>
        <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey; ">
        		  	 	<table style="float:center;" id="pending" width="99%">
  <thead class="clsTable">
  <tr>
   
    <th colspan="2">Delivery</th>
    <th colspan="2">Pickup</th>
     <th colspan="2">Payment</th>
  </tr>
   <tr>
    <th>Jar</th>
    <th>Bottel</th>
     <th>Jar</th>
    <th>Bottel</th>
     <th>Cash</th>
    <th>Credit</th>
  </tr>
  </thead>
  <tbody>
<tr>
    <td>20</td>
    <td>30</td>
     <td>30</td>
    <td>20</td>
     <td>2000</td>
    <td>3000</td>
  </tr>
  </tbody>
</table> 
        		  </div>
        		  
        </div>
         	<div class="clsmodal-header"  style="margin-top: 2px;">
        <i class="clsicon fa fa-globe-asia"></i><span>Day Transaction List <span>
      </div>
     <div class="clsModal-content"">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="daytrantable" width="99%">
  <thead class="clsTable">
  <tr>
    <th rowspan="2">Sr No.</th>
    
    <th rowspan="2">Customer Name</th>
    <th rowspan="2">Address</th>
      
        <th rowspan="2">Type</th>
    <th colspan="2">PickUp</th>
    <th colspan="2">Delivery</th>
    <th>Payment</th>
    <th rowspan="2">Action</th>
    
  </tr>
  <tr>
   
    <th >Jar</th>
    <th>Bottel</th>
    <th >Jar</th>
    <th>Bottel</th>
    <th>Payment</th>
    
  </tr>
  </thead>
  <tbody>
  
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>



</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/daybook.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";



</script>
</html>

