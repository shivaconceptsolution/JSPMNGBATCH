<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
<form action="RegSer" method="post">
<table>
<tr><td>Emailid</td><td><input type="email" name="txtemail" required /></td></tr>
<tr><td>Password</td><td><input type="password" name="txtpass" required /></td></tr>
<tr><td>Mobileno</td><td><input type="number" name="txtmobile" required /></td></tr>
<tr><td>Fullname</td><td><input type="text" name="txtfullname" required /></td></tr>
<tr><td colspan="2"><input type="submit" name="btnsubmit" value="Register" /> </td></tr>

</table>

</form>
<%
if(request.getParameter("msg")!=null)
{
	out.print(request.getParameter("msg"));
}




%>
</body>
</html>