<%@page
	import="com.deloitte.models.Courses, com.deloitte.models.CoursesDAO"%>
<%
	Courses e = (Courses) request.getAttribute("course");
	if (e == null)
		e = new Courses();
%>
<html>
<head>
</head>
<body>
	<style>
table input[type="submit"] {
	display: block;
	margin: 0 auto;
    border-collapse: collapse;
}
input[type="text"] {
	display: block;
	margin: 0 auto;
    border-collapse: collapse;
}
td {
    vertical-align: top;
    padding: 2px;
}
</style>
	<form action="CoursesCRUD">
		<table align=center width=50% bgcolor=lightgray>
			<tr>
				<th>Course ID</th>
				<td><input type=text name=course_id value=<%=e.getCourse_id()%>></td>
			</tr>
			<tr>
				<th>Course Name</th>
				<td><input type=text name=course_name
					value=<%=e.getCourse_name()%>></td>
			</tr>
			<tr>
				<th>Course Duration</th>
				<td><input type=text name=course_duration
					value=<%=e.getCourse_duration()%>></td>
			</tr>
			<tr>
				<th>Course Fees</th>
				<td><input type=text name=course_fee
					value=<%=e.getCourse_fee()%>></td>
			</tr>
			<tr>
				<td><input type=submit value=Add_Courses name="sub"></td>
				<td><input type=submit value=Show_Courses name="sub"></td>
			</tr>
			<tr>
				<td><input type=submit value=Modify_Courses name="sub"></td>
				<td><input type=submit value=Delete_Courses name="sub"></td>
			</tr>
		</table>
	</form>
</body>
</html>
</html>