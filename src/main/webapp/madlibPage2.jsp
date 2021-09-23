<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MadLib #2</title>
</head>
<body>
	<h1>MadLib Words</h1>
	<form action="getWords2Servlet" method="post">
	<p>Enter a noun:</p>
	<input type="text" name="userNoun" size="10">
	<p>Enter an adjective:</p>
	<input type="text" name="userAdj" size="10">
	<p>Enter a verb ending in -ing:</p>
	<input type="text" name="userVerb" size="10">
	<p>Enter a proper noun:</p>
	<input type="text" name="userProperNoun" size="10">
	<p>Enter a place:</p>
	<input type="text" name="userPlace" size="10">
	<input type="submit" value="Submit Words"/>
	</form>
</body>
</html>