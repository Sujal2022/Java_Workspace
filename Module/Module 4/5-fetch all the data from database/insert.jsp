<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="m" class="com.model.FetchModel"/>
<jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 			int staus = Dao.savedata(m);
			
			
			
			
			if(staus>0)
			{
				
				out.println("Sucess");
	        
			}
			else
			{
				
				out.println("Fail");
				
			}
				
	

%>



</body>
</html>