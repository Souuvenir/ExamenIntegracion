<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formularion</title>
</head>
<body>

    <h2>Login: </h2>

    <form action="Validator" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>

		<br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>

		<br>
        <input id="buttonSubmit" type="submit" value="Iniciar sesion">
    </form>
</body>
</html>
