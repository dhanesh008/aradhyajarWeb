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
        <a href="${pageContext.request.contextPath}/panel/home" class="active"><i class="clsicon fa fa-home"></i>  Home</a>
        <a href="${pageContext.request.contextPath}/panel/transaction"><i class="clsicon fa fa-tags"></i> Transaction</a>
        <a href="${pageContext.request.contextPath}/panel/daybook"><i class="clsicon fa fa-book-open"></i> Daybook</a>
         <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i>  Print Bill</a>
             <a href="${pageContext.request.contextPath}/panel/report"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
        <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
        <a href="${pageContext.request.contextPath}/panel/customer"><i class="clsicon fa fa-user-plus"></i>Customer</a>
        <a href="${pageContext.request.contextPath}/panel/area" ><i class="clsicon fa fa-globe-asia"></i>Area</a>
         <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-home"></i><span>Total Pending Count <span>
      </div>
        <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	 	<table style="float:center;" id="pending" width="99%">
  <thead class="clsTable">
  <tr>
   
    <th>List</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Cash</th>
    <th>Credit</th>
     <th>Total</th>
    
  </tr>
  </thead>
  <tbody>
  <tr>
   
    <td>Day Delivery Count</td>
    <td>10</td>
    <td>20</td>
    <td>3000</td>
   <td>3000</td>
   <td>6000</td>
  </tr>
   <tr>
   
    <td>Day PickUp Count</td>
    <td>10</td>
    <td>20</td>
    <td>3000</td>
   <td>3000</td>
   <td>6000</td>
  </tr>
   <tr>
   
    <td>Total Peding Count</td>
    <td>10</td>
    <td>20</td>
    <td>3000</td>
   <td>3000</td>
   <td>6000</td>
  </tr>
  </tbody>
</table> 
        		  </div>
        		  
        </div>
         	<div class="clsmodal-header"  style="margin-top: 2px; width:50%>
        <i class="clsicon fa fa-globe-asia"></i><span>UpComing Order List <span>
      </div>
     <div class="clsModal-content"">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="ordertable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    
    <th>Order Name</th>
     <th>Order Date time</th>
    <th>Address</th>
      <th>Mobile</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Advance</th>
    <th>Total</th>
  </tr>
  </thead>
  <tbody>
   <td>1.</td>
    <td>Dhaneshkumar Solanki</td>
     <td>21/2/2020  12:30</td>
    <td>Shri ram wadi,ghoti,tal Igatpuri</td> 
    <td>7770088860<br>8793612671</td>
    <td>40</td>
    <td>50</td>
    <td>1000</td>
    <td>2000</td>
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

