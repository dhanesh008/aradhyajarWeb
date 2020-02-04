<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/homestyle.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fontawesome/css/all.css">
    
   <script src="${pageContext.request.contextPath}/resources/js/lib/jquery.min.js"></script>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/DataTables/datatables.min.css"/>
 
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/DataTables/datatables.min.js"></script>
<!-- jQuery Modal -->
<script src="${pageContext.request.contextPath}/resources/js/lib/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

</head>

<body>

<div class="topnav">
  <span class="title">Aaradhya Aqua Admin</span>
  
</div>  
<div class="clsForm">
      <div class="vertical-menu">
        <a href="${pageContext.request.contextPath}/panel/home"><i class="clsicon fa fa-home"></i>  Home</a>
         <a href="${pageContext.request.contextPath}/panel/transaction" class="active" ><i class="clsicon fa fa-tags"></i> Transaction</a>
          <a href="${pageContext.request.contextPath}/panel/daybook"><i class="clsicon fa fa-book-open"></i> Daybook</a> 
          <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i>  Print Bill</a>
          <a href="${pageContext.request.contextPath}/panel/report"><i class="clsicon fa fa-chart-line"></i>Area Wise Report</a>
         <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area"  ><i class="clsicon fa fa-globe-asia"></i> New Area</a>
          <a href="${pageContext.request.contextPath}/logout" ><i class="clsicon fa fa-lock"></i>Logout</a>
        
      
      </div> 
  <div class="clsFromContent">
   		
   
   	<div class="clsmodal-header">
        <i class="clsicon fa fa-tags"></i><span>Transaction  <span>
      </div>
        <div class="clsModal-content">
        		 
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	 <div class="clsform-group" style="width:45%;">
          <select class="form-control" id="arealist">
          <option value="">Select Area</option>
          </select>
     				 </div>
     				  <div class="clsform-group" style="width:45%;">
         <input id="areaname" type="text" placeholder="Search Customer">
      </div>
     				 
     				 
        		  </div>
        		  
        </div>
         	
     <div class="clsModal-content">
        		  <div class="clsModal" style="border: 2px solid grey;">
        		  	<table style="float:center;" id="custlisttable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Customer</th>
    <th>Address</th>
    <th>Mobile</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Amount</th>
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
 <div id="cusTrans" class="modal">
  <p>Order Transaction</p>
  <table style="float:center;" id="custrans" width="99%">
  <thead class="clsTable">
  	
  </thead>
  <tbody>
  
  </tbody>
 
</table> 

</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/transaction.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

