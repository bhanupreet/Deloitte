<%@ page session="true" import="com.deloitte.servlet.UsersDAO"%>
<%
	String username = request.getParameter("uid");
	String password = request.getParameter("pwd");
	session.setAttribute("username", username);
	out.println("<h1><center>");
	UsersDAO dao = new UsersDAO();
	if (dao.validateUser(username, password)) {
		//	out.println("Welcome to Hyderabad");
%>
<jsp:forward page="services.html"/>
<%
	} else {
%>
<%="invalid username or password"%>
<jsp:include page="login.html"/>
<%
	}
%>
