
<%@page
	import="com.Deloitte.servlet.CRUD.EmployeeDAO,com.Deloitte.servlet.CRUD.Employee"%>
<%
	Employee e = (Employee) request.getAttribute("emp");
	if (e == null)
		e = new Employee();
%>
<html>
<head>
</head>
<body>
	<form action="EmployeeCRUD">
		<table align=center width=50% bgcolor=lightblue>
			<tr>
				<th>Employee ID</th>
				<td><input type=text name=empid value=<%=e.getEmpid()%>></td>
			</tr>
			<tr> 
				<th>Employee Name</th>
				<td><input type=text name=name value=<%=e.getName()%>></td>
			</tr>
			<tr>
				<th>Employee Salary</th>
				<td><input type=text name=salary value=<%=e.getSalary()%>></td>
			</tr>
			<tr>
				<th>Date of Joining</th>
				<td><input type=date name=doj value=<%=e.getDoj()%>></td>
			</tr>
			<tr>
				<td><input align=center type=submit value=Add_Employee
					name="sub"></td>
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