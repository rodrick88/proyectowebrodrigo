<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SALIDA</title>
</head>
<body>
${patologia.nombre}<br>
${patologia.causa}<br>
${patologia.tratamiento}<br>
SINTOMAS
${patologia.lista_sintomas[0].descripcion}<br>


</body>
</html>