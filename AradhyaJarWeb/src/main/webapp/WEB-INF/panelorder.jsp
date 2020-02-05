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
         <a href="${pageContext.request.contextPath}/panel/order" class="active"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area" ><i class="clsicon fa fa-globe-asia"></i> Area</a>
          <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
      
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-box"></i><span>Add New Order <span>
      </div>
        <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  
        		  
      <div class="clsform-group" style="width:35%;">
      <label for="uname"><b>Customer Name</b></label>
       	<input id="cusname" type="text" placeholder="Customer Name">
     					 </div>
     					 <div class="clsform-group" style="width:35%;">
      <label ><b>Address</b></label>
        <input type="text" id="add1" name=""placeholder="Address"  required>
      </div>
      <div class="clsform-group"  style="width:20%;">
        <label><b>Mobile 1</b></label>
        <input type="text" id="mob1" placeholder="Mobile"  required>
      </div>
      <div class="clsform-group" style="width:20%;">
        <label><b>Mobile 2</b></label>
        <input type="text" id="mob2" placeholder="Mobile">
      </div>
         <div class="clsform-group"  style="width:15%;">
        <label><b>Date</b></label>
        <input type="text" id="date" placeholder="Mobile"  required>
      </div>
      <div class="clsform-group" style="width:15%;">
        <label><b>Time</b></label>
        <input type="text" id="time" placeholder="Mobile">
      </div>
           <div class="clsform-group" style="width:20%;">
        <label><b>Deposit(in Rs)</b></label>
        <input type="text" id="deposite"  placeholder="Deposit" required autofocus>
      </div>
         
          <div class="clsform-group" style="width:8%;">
        <label><b>Jar</b></label>
        <input type="text" id="jar"  placeholder="Jar" required autofocus> 
      </div>
     
       <div class="clsform-group" style="width:9%;">
        <label><b>Jar Rate</b></label>
        <input type="text" id="jarrate"  placeholder="Jar" required autofocus> 
      </div>
       <div class="clsform-group" style="width:10%;">
        <label><b>Bottel</b></label>
        <input type="text" id="bot"  placeholder="Bottel" required autofocus> 
      </div>
      
      <div class="clsform-group" style="width:10%;">
        <label><b>Bottel Rate</b></label>
        <input type="text" id="botrate"  placeholder="Bottel" required autofocus> 
      </div>
       <div class="clsform-group" style="width:30%;">
      <label ><b>Order Details</b></label>
        <input type="text" id="ordedetails" name=""placeholder="Address"  required>
      </div>
      
    
        		  
        		  	 <div class="clsform-group" style="width:18%;">
     					   <label for="uname"><b>&nbsp;</b></label>
      							  <button type="submit" onclick="addnewCustomer()" class="clsbtn">Add</button>
     					 </div>
        		  </div>
        		  
        </div>
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="ordertable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Customer Name</th>
    <th>Address</th>
    <th>Date</th>
    <th>Mobile</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Total</th>
     <th>Advance</th>
      <th>Pending</th>
            <th>View</th>
  </tr>
  </thead>
  <tbody>
  	
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>

 <div id="orderTrans" class="modal">
  <p>Order Transaction</p>
  <table style="float:center;" id="ordertransaction" width="99%">
  <thead class="clsTable">
  
  </thead>
  <tbody>
  
  </tbody>
 
</table> 

</div>
<div id="orderdetails" class="modal" style="max-width: 558px;">
  <p>Order details</p>
  <table style="float:center; " id="orderdetails">
  <thead class="clsTable">
  <tr>
     <th rowspan="2">srno</th>
      <th rowspan="2">Trnsaction Date</th>
  <th colspan="2">PickUp</th>
  <th colspan="2">Delivery</th>
   <th rowspan="2">Payment</th>
   
  
  </tr>
    <tr>
  
  <th>Jar</th>
  <th>Bottel</th>
  <th>Jar</th>
  <th>Bottel</th>
 
  </tr>
  </thead>
  <tbody>
  
  </tbody>
 
</table> 

<button type="submit" onclick="printBill" style="width:25%; float:right" class="clsbtn">Print Bill</button>

</div>



</body>

<script>
var contextPath="${pageContext.request.contextPath}";

</script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/order.js"></script>
</html>

