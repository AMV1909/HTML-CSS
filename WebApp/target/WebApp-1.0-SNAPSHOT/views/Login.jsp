<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="../css/Login.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/> 
</head>

<%
String Error = "";
if(request.getParameter("Finded") != null){
    Error = "Usuario y/o Contraseña incorrectos";
}
%>

<body>
    <div class="wrapper">
        <div class="div-form">
            <h1>LOGIN</h1>
            <form method="Post" action="/WebApp/EmployeeServlet">
                <div class="text_field">
                    <input type="text" name="User" required><label>Usuario</label>
                    <span></span>
                </div>
                <div class="text_field">
                    <input type="password" name="Password" required><label>Contraseña</label>
                    <span></span>
                </div>
                <p class="response"><%=Error %></p>
                <input type="submit" name="Login" value="Ingresar">
            </form>
        </div>
    </div>
</body>
</html>