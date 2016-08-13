<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h1>Spring MVC Hello World Annotation Example</h1>

	<h2>${msg}</h2>
	<c:forEach var="course" items="${courses}">
		<h3>${course.courseTitle}</h3>
	</c:forEach>
</body>
</html>