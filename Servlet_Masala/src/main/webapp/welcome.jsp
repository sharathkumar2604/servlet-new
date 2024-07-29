<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><a href=save.jsp>click here to save</a> 

<br>
<form action="ReadServlet" method="get">
<button type="submit">click here to show saved data</button>

</form>
<br><br>
<!-- <a href=readAll.jsp>click here for readAll</a> &nbsp; &nbsp;
 -->
<a href=readByQty.jsp>click here for readByQty</a><br><br>
<a href=readById.jsp>click here for readById</a> &nbsp; &nbsp;
<a href=readByPrice.jsp>click here for readByPrice</a> &nbsp; &nbsp;
<a href=updatePriceByBrandAndId.jsp>click here for updatePriceByBrandAndId</a><br><br>
<a href=deleteByPriceBrandAndId.jsp>click here for deleteByPriceBrandAndId</a><br><br>
</body>
</html>