<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveServlet" method=post>
	Enter PowerBankName: <input type="text" name="name">
	<br><br> 
	Enter mah:<input type="text" name="mah">
	<br><br> 
	Enter materialType:<input type="text" name="materialType">
	<br><br>
	Enter price:<input type="text" name="price">
	<br><br>
	<input type="submit" value="submit">
	<br>
	<input type="reset" value="reset">
	<br>
</form>

</body>
</html>