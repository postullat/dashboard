<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="btn-group">
        <button type="button" class="btn btn-default dropdown-toggle"
                data-toggle="dropdown">Select Department
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" role="menu">
            <c:forEach var="department" items="${departments}">
                <li><a href="#">${department.departmentName}</a></li>
            </c:forEach>
        </ul>
    </div>
    <div class="btn-group">
        <button type="button" class="btn btn-default dropdown-toggle"
                data-toggle="dropdown">Select Faculty
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" role="menu">
            <c:forEach var="faculty" items="${faculties}">
                <li><a href="#">${faculty.firstName} ${faculty.lastName}</a></li>
            </c:forEach>
        </ul>
    </div>

    <div class="btn-group">
        <button type="button" class="btn btn-default dropdown-toggle"
                data-toggle="dropdown">Select Course
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" role="menu">
            <c:forEach var="course" items="${courses}">
                <li><a href="#">${course.courseTitle}</a></li>
            </c:forEach>
        </ul>
    </div>
</div>

<div class="content-table-wrapper"></div>

<div class="footer"></div>
</body>
</html>