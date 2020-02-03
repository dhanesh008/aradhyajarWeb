<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homestyle.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
    
   <script src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/DataTables/datatables.min.css"/>
 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/DataTables/datatables.min.js"></script>
</head>
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  padding-top: 100px; /* Location of the box */
  left: 0;
  top: 0;
  width: 35%; /* Full width */
  height: 25%; /* Full height */
  overflow: auto; /* Enable scroll if needed */

}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;
}

/* The Close Button */
.close {
  color: #aaaaaa;
  float: right;
  font-size: 28px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: #000;
  text-decoration: none;
  cursor: pointer;
}
</style>
<body>

<div class="topnav">
  <span class="title">Aaradhya Aqua Admin</span>
  
</div>  
<div class="clsForm">
      <div class="vertical-menu">
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-home"></i>  Home</a>
         <a href="${pageContext.request.contextPath}/panel/transaction"  ><i class="clsicon fa fa-tags"></i> Transaction</a>
          <a href="${pageContext.request.contextPath}/panel/daybook"><i class="clsicon fa fa-book-open"></i> Daybook</a> 
          <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i>  Print Bill</a>
          <a href="${pageContext.request.contextPath}/panel/report" class="active"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
         <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area"  ><i class="clsicon fa fa-globe-asia"></i> Area</a>
          <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
        
      
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-tags"></i><span>Print Delivery Report  <span>
      </div>
        <div class="clsModal-content">
        		 
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	 <div class="clsform-group" style="width:45%;">
          <select class="form-control" id="arealist">
          <option value="">Select Area</option>
          </select>
     				 </div>
     				 
        		  </div>
        		  
        </div>
         	
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="areatable" width="99%">
  <thead class="clsTable">
 <tr>
    <th rowspan="2">Sr No.</th>
    <th rowspan="2"> Name</th>
    <th rowspan="2">Address</th>
    
    <th colspan="3">Pending</th>
    <th colspan="2">PickUp</th>
    <th colspan="2">Delivery</th>
      <th rowspan="2">Payment</th>
  
  </tr>
   <tr>
    
    <th >Jar</th>
    <th >Battol</th>
    <th >Pay</th>
     <th >Jar</th>
    <th >Battol</th>
    <th >Jar</th>
    <th >Battol</th>
   
  </tr>
  </thead>
  <tbody>
 	<tr>
 	<td>1</td>
 	<td>Dhaneshkumar Solanki</td>
 	<td>loadha building<br>7770088800<br>8745985698</td>
 	<td>5</td>
 	<td>3</td>
 	<td>80</td>
 	<td></td>
 	<td></td>
 		<td></td>
 	<td></td>
 	<td></td>
 	</tr>
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>



</body>
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <p>Some text in the Modal..</p>
  </div>

</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/transaction.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

