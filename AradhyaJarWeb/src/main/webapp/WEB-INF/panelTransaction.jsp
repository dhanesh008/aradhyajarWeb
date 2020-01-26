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
         <a href="${pageContext.request.contextPath}/panel/transaction" class="active" ><i class="clsicon fa fa-tags"></i> Transaction</a>
          <a href="${pageContext.request.contextPath}/panel/daybook"><i class="clsicon fa fa-book-open"></i> Daybook</a> <a href="${pageContext.request.contextPath}/panel/print"><i class="clsicon fa fa-box"></i> Print</a>
         <a href="${pageContext.request.contextPath}/panel/order"><i class="clsicon fa fa-box"></i> Order</a>
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area"  ><i class="clsicon fa fa-globe-asia"></i> New Area</a>
        
      
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
        		  	<table style="float:center;" id="areatable" width="99%">
  <thead class="clsTable">
  <tr>
    <th>Sr No.</th>
    <th>Customer</th>
    <th>Area</th>
    <th>Address</th>
    <th>Mobile</th>
    <th>Jar</th>
    <th>Bottel</th>
    <th>Amount</th>
     <th>Option</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td>1</td>
    <td>Dhaneshkumar Solanki</td>
    <td>Shri ram wadi</td>
    <td>Loadha hospital</td>
    <td>7770088860<br>8793612671</td>
    <td>5</td>
    <td>3</td>
    <td>250</td>
     <td><button type='button' class='clsbtnop'><i class='fa fa-edit'></i></button></td>
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

