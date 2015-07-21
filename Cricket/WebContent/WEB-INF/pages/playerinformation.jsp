<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="/Cricket/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="/Cricket/resources/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/Cricket/resources/bootstrap/css/carousel.css" rel="stylesheet"/>
<script type="text/javascript" src="/Cricket/resources/jquery/jquery.min.js"></script>
<script type="text/javascript" src="/Cricket/resources/bootstrap/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" src="/Cricket/resources/js/canvasjs.min.js"></script>  -->
<script type="text/javascript" src="http://canvasjs.com/assets/script/canvasjs.min.js"></script>

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/bootstrap.css">

<link rel="stylesheet" href="/Cricket/resources/bootstrap/css/navbar.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script src="/Cricket/resources/js/navbar.js"></script>



 <style type="text/css">
        .fixed-panel {
              height: 150px;
              overflow-y: scroll;
        }
  </style>
</head>
<body>

<div class="container">

 <nav class="navbar navbar-inverse" style="background:#2856dd;">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
	      			<a class="navbar-brand1" href="/"><img alt="" src="/Cricket/resources/images/masthead-logo.jpg" height="35" width="40" align="bottom"></a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					 <li><a class="navbar-brand" href="/Cricket/"><p style="color:#ffffff">Home</p></a></li>
					 <li><a class="navbar-brand" href="/Cricket/dashboard"><p style="color:#ffffff">DashBoard</p></a></li>
                     <li><a class="navbar-brand" href="/Cricket/addPlayer"><p style="color:#ffffff">Add Players</p></a> </li>
                     <li><a class="navbar-brand" href="/Cricket/addCommittee"><p style="color:#ffffff">Committee</p></a></li>
					 <li><a class="navbar-brand" href="#"><p style="color:#ffffff">FeedBack</p></a></li>
				</ul>
			
			
				

			</div><!-- /.navbar-collapse -->
		</div><!-- /.container-fluid -->
	</nav>
</div>


<div class="container">
<div class="col-md-6">
<div class="row">
    
      <img src="${playerinfodet.imageurl}" alt="..." height="450" width="570">
  
  </div>
  </div>
 
 <div class="col-md-6">
 <div class="panel panel-default">
  <div class="panel-heading">NAME</div>
  <div class="panel-body">
   
   First Name:${playerinfodet.fname}
    <br>
   Last Name:${playerinfodet.lname}
    <br> DOB:${playerinfodet.dob}<br> Type:${playerinfodet.type} <br> State:${playerinfodet.state} <br> Year of Join:${playerinfodet.year_of_joining} <br> Height:${playerinfodet.height} <br> Status:${playerinfodet.status}
 </div>
</div>
 <div class="panel panel-default">
  <div class="panel-heading">Description</div>
  <div class="panel-body fixed-panel">
    Description:${playerinfodet.description}
  </div>
</div>
 
 </div>

</div>
<div class="container">
<div class="row">
<table>
<tr>
        <td style="padding:0 15px 0 15px">Matches</td>
        <td style="padding:0 15px 0 15px">Runs</td>
        <td style="padding:0 15px 0 15px">WIckets</td>
        <td style="padding:0 15px 0 15px">Economy</td>
        <td style="padding:0 15px 0 15px">Average</td>
	 <td style="padding:0 15px 0 15px">SR</td>
    </tr>
    <tr>
        <td style="padding:0 15px 0 15px">${playerstatsinfodet.no_mathches}</td>
        <td style="padding:0 15px 0 15px">${playerstatsinfodet.no_runs}</td>
        <td style="padding:0 15px 0 15px">${playerstatsinfodet.no_wickets}</td>
        <td style="padding:0 15px 0 15px">${playerstatsinfodet.ecomnomy}</td>
        <td style="padding:0 15px 0 15px">${playerstatsinfodet.average}</td>
	 <td style="padding:0 15px 0 15px">${playerstatsinfodet.strikerate}</td>
    </tr>

</table>
	<a class="btn btn-primary pull-right" href="/Cricket/updateStats?id=${playerstatsinfodet.id}">Update</a>
</div>
</div>




</body>
</html>