<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
			String firstName = request.getParameter("fname");
			String lastName = request.getParameter("lname");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			String gender = request.getParameter("gender");
			String password = request.getParameter("password");
			
			
			out.println("First Name: " + firstName);
	        out.println("Last Name: " + lastName);
	        out.println("Email: " + email);
	        out.println("Mobile: " + mobile);
	        out.println("Gender: " + gender);
	        out.println("Password: " + password);
				
	

%>



</body>
</html>