<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:center">
<!-- 
<frm:form method="post" action="addplayer" modelAttribute="plr">
	<frm:input path="pid"/>
	<br />	
	<frm:input path="plrname"/>
	<br />
	<frm:input path="gametype" />
	<br />
	<frm:input path="country" />
	<br />
	<input type="submit" value="Add Player" />	
</frm:form>
 -->

<form name="f1" method="post" action="addplayer">
	<input type="text" name="txtPname"  placeholder="Player Name" />
	<br />
	<select name="ddlgame">
		<option value="-1">Select Game</option>
		<option value="Tennis">Tennis</option>
		<option value="Cricket">Cricket</option>
		<option value="Football">Football</option>
	</select>
	<br />
	<input type="text" name="txtCountry"  placeholder="Country Name" />
	<br />
	<input type="submit" value="Add Player" />	
</form>
 
<h2 style="text-align:center">${info}</h2>
</div>
</body>
</html>