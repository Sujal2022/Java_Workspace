<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="insert.jsp" >
	
	<p>
    <label for="fname">First Name:</label>
    <input type="text" id="fname" name="fname" required="required">
    </p>
    
    <p>
    <label for="lname">Last Name:</label>
    <input type="text" id="lname" name="lname" required="required">
     </p>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required="required">
     <p>
    <label for="mobile">Mobile:</label>
    <input type="text" id="mobile" name="mobile" required="required">
     </p>
     
     <p>
    <label for="gender">Gender:</label>
    <input type="radio" name = "gender" value="Male">Male 
	<input type="radio" name = "gender" value="FeMale">FeMale 
     </p>
     
      <p>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required="required">
     </p>
    
     <p>
    <input type="submit" value="Submit">
    <input type="reset"  value="Reset">
     </p>
</form>
	
</body>
</html>