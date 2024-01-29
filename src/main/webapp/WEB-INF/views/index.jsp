<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home</title>
</head>
<body>

    Welcome to Akkieans.

    <form action="addAlien" method="post">
        Enter your id:
            <input type="number" name="aid" disabled> <br>
        Enter your name:
            <input type="text" name="aname"> <br>
        <input type="submit" value="submit">
    </form>
    <a href="getAliens">getAliens</a><br>

    <h4>get one alien</h4>
    <form action="getAlien" method="get">
        Enter your id:
            <input type="number" name="aid"> <br>
        <input type="submit" value="submit">
    </form>

</body>
</html>