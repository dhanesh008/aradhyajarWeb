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
         <a href="${pageContext.request.contextPath}/panel/customer" ><i class="clsicon fa fa-user-plus"></i>Customer</a>
         <a href="${pageContext.request.contextPath}/panel/area" class="active" ><i class="clsicon fa fa-globe-asia"></i> New Area</a>
      
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



</body>
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <span class="close">&times;</span>
    <p>Some text in the Modal..</p>
  </div>

</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/area.js"></script>
<script>
var contextPath="${pageContext.request.contextPath}";
</script>
</html>

