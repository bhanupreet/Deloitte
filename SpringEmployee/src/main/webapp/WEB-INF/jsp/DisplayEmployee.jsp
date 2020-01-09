<%@page
	import="com.deloitte.spring.entity.Employee, com.deloitte.spring.dao.EmployeeDAO"%>
<html>
<%@page isELIgnored = "false" %>
<body>
	<form action="empCRUD">
		<table align=center width=50% bgcolor=lightblue>
			<tr>
				<th>Employee ID</th>
				<td><input type=text name=empid value=${emp.empid } ></td>
			</tr>
			<tr>
				<th>Employee Name</th>
				<td><input type=text name=name value=${emp.name }></td>
			</tr>
			<tr>
				<th>Employee Salary</th>
				<td><input type=text name=salary value=${emp.salary }></td>
			</tr>
			<tr>
				<td><input type=submit value=Add_Employee name="sub"></td>
				<td><input type=submit value=Show_Employee name="sub"></td>
			</tr>
			<tr>
				<td><input type=submit value=Modify_Employee name="sub"></td>
				<td><input type=submit value=Delete_Employee name="sub"></td>
			</tr>
		</table>
	</form>
</body>
</html>