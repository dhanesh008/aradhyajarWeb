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
        <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
        <a href="${pageContext.request.contextPath}/panel/customer"><i class="clsicon fa fa-user-plus"></i>Customer</a>
        <a href="${pageContext.request.contextPath}/panel/area" ><i class="clsicon fa fa-globe-asia"></i>Area</a>
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header" style="margin-top: 2px; width:30%">
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
         	<div class="clsmodal-header"  style="margin-top: 2px; width:30%">
        <i class="clsicon fa fa-globe-asia"></i><span>Day Transaction List <span>
      </div>
     <div class="clsModal-content"">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="ordertable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    
    <th>Customer Name</th>
    <th>Address</th>
      <th>Mobile</th>
        <th>Type</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Payment</th>
    
  </tr>
  </thead>
  <tbody>
  <tr>
   <td>1.</td>
    <td>Dhaneshkumar Solanki</td>
    <td>Shri ram wadi,ghoti,tal Igatpuri</td> 
    <td>7770088860<br>8793612671</td>
    <td>Delivery</td>
      <td>40</td>
    <td>50</td>
    <td>1000</td>
  
  </tr>
   <tr>
   <td>2.</td>
    <td>Roshni </td>
    <td>Shri ram wadi,ghoti,tal Igatpuri</td> 
    <td>7770088860<br>8793612671</td>
    <td>Pickup</td>
      <td>4</td>
    <td>0</td>
    <td>1000</td>
  
  </tr>
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>



</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/area.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

