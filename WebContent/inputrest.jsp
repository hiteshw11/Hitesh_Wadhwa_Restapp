<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter data to be inserted</title>
</head>
<body>
<form action="/Insertrest" method="POST">
<p>Enter the model id</p>
<input type="number" name="Model_ID">
<br><br>
<p>Enter the Fuel_1_no</p>
<br><br>
<input  type="number" name="Fuel_1_no">
<br><br>
<p>Enter the Fuel_2_no</p>
<br><br>
<input type="number" name="Fuel_2_no">
<br><br>
<p>Enter the City_MPG_FT1</p>
<br><br>
<input type="number" name="City_MPG_FT1">
<br><br>
<input type="number" name="City_MPG_FT2">
<br><br>
<p>Enter the Highway_MPG_FT1</p>
<input type="number" name="Highway_MPG_FT1">
<br><br>
<p>Enter the Highway_MPG_FT2</p>
<input type="number" name="Highway_MPG_FT2">
<br><br>
<input type="submit" name="submit">
</form>

</body>
</html>