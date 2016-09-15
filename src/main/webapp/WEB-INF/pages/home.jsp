<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Home Page</title>
</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Spring MVC / Hibernate project</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-left">
					<li><a href="#">Home</a></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="dropdown-wrapper">
		<select class="">
			<option>Select Department</option>
			<c:forEach var="department" items="${departments}">
			<!-- TODO: Add JS code for sending request -->
				<option value="${department.departmentId}">${department.departmentName}</option>
			</c:forEach>
		</select> 
		<select class="">
			<option>Select Faculty</option>
		</select> 
		<select class="">
			<option>Select Course</option>
		</select> <select class="">
			<option>Select Department</option>
		</select> 
		<input type="text" name="search" placeholder="Search For Student">
	</div>

	<div class="btn-group">

		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown">Select Department
			<span class="caret"></span>
		</button>

		<ul class="dropdown-menu" role="menu">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
			<li><a href="#">Something else here</a></li>

			<li class="divider"></li>
			<li><a href="#">Separated link</a></li>
		</ul>
	</div>
	
	<div class="btn-group">
		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown">Select Faculty
			<span class="caret"></span>
		</button>

		<ul class="dropdown-menu" role="menu">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
			<li><a href="#">Something else here</a></li>

			<li class="divider"></li>
			<li><a href="#">Separated link</a></li>
		</ul>
	</div>
	
		<div class="btn-group">
		<button type="button" class="btn btn-default dropdown-toggle"
			data-toggle="dropdown">Select Course
			<span class="caret"></span>
		</button>

		<ul class="dropdown-menu" role="menu">
			<li><a href="#">Action</a></li>
			<li><a href="#">Another action</a></li>
			<li><a href="#">Something else here</a></li>

			<li class="divider"></li>
			<li><a href="#">Separated link</a></li>
		</ul>
	</div>
	
	<div class="container">
		<div class="row">
	        <div class="span12">
	            <form id="custom-search-form" class="form-search form-horizontal pull-right">
	                <div class="input-append span12">
	                    <input type="text" class="search-query" placeholder="Search">
	                    <button type="submit" class="btn"><i class="icon-search"></i></button>
	                </div>
	            </form>
	        </div>
		</div>
	</div>

	<div class="content-table-wrapper"></div>

	<div class="footer"></div>
</body>
</html>