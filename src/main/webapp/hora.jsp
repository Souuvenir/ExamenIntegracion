<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formulario</title>
</head>
<body>

    <h2>Login: </h2>

    <form action=Hora method="post">
        <select id="mascota" name="mascota" required>
            <option value="mascota1">PEPE</option>
            <option value="mascota2">GANDALF</option>
            <!-- Agrega más opciones según sea necesario -->
        </select><br>

        <br>
        <label for="rutDueno">Rut dueño:</label>
        <input type="password" id="rutDueno" name="rutDueno" required><br>

        <br>
        <label for="dia">Día (1-31):</label>
        <input type="number" id="dia" name="dia" min="1" max="31" required><br>

        <br>
        <label for="mes">Mes (1-12):</label>
        <input type="number" id="mes" name="mes" min="1" max="12" required><br>

        <br>
        <label for="anio">Año (mayor o igual a 2025):</label>
        <input type="number" id="anio" name="anio" min="2025" required><br>

        <br>
        <label for="hora">Hora (9-18):</label>
        <input type="number" id="hora" name="hora" min="9" max="18" required><br>

        <br>
        <label for="minutos">Minutos (1-60):</label>
        <input type="number" id="minutos" name="minutos" min="1" max="60" required><br>

        <br>
        <input id="buttonSubmit" type="submit" value="Registrar hora">
    </form>
</body>
</html>