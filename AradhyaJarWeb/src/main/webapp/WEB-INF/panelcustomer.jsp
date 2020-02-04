<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homestyle.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
    
   <script src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/DataTables/datatables.min.css"/>
   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/js/lib/css/alertify.css" /> 
 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/DataTables/datatables.min.js"></script>
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
         <a href="${pageContext.request.contextPath}/panel/daybook"><i class="clsicon fa fa-book-open"></i> Daybook</a>
          <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i>  Print Bill</a>
          <a href="${pageContext.request.contextPath}/panel/report"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
         <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" class="active"><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area" ><i class="clsicon fa fa-globe-asia"></i> Area</a>
          <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
      
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-globe-asia"></i><span>Area <span>
      </div>
        <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  
        		   <div class="clsform-group" style="width:25%;">
		<label for=""><b>Select Area</b></label>
        
          <select class="form-control" id="arealist">
          <option value="">Select Area</option>
          </select>
       
      </div>
      <div class="clsform-group" style="width:35%;">
      <label for="uname"><b>Customer Name</b></label>
       	<input id="cusname" type="text" placeholder="Customer Name">
     					 </div>
     					 <div class="clsform-group" style="width:35%;">
      <label ><b>Address</b></label>
        <input type="text" id="add1" name=""placeholder="Address"  >
      </div>
      <div class="clsform-group"  style="width:18%;">
        <label><b>Mobile 1</b></label>
        <input type="number" id="mob1" placeholder="Mobile"  >
      </div>
      <div class="clsform-group" style="width:18%;">
        <label><b>Mobile 2</b></label>
        <input type="number" id="mob2" placeholder="Mobile" >
      </div>
         <div class="clsform-group" style="width:18%;">
        <label><b>Address 2</b></label>
        <input type="text" id="add2" placeholder="Address"  >
      </div>
      
      <div class="clsform-group" style="width:18%;">
        <label><b>Deposit(in Rs)</b></label>
        <input type="number" id="deposite"  placeholder="Deposit"  >
      </div>
        		  
        		  	 <div class="clsform-group" style="width:18%;">
     					   <label for="uname"><b>&nbsp;</b></label>
      							  <button type="submit" onclick="addnewCustomer()" class="clsbtn">Add</button>
     					 </div>
        		  </div>
        		  
        </div>
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="areatable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Customer Name</th>
    <th>Area Name</th>
    <th>Address</th>
    <th>Mobile</th>
    <th>Deposite</th>
    <th>Status</th>
    <th>Option</th>
  </tr>
  </thead>
  <tbody>
  
  
  </tbody>
</table> 
        		  
        </div>

   
  </div>
</div>






</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/customer.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}"; 


</script>


</html>

