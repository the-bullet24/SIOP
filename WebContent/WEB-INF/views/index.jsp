<%@page language="java"	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE HTML>
	
<html>
<head>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<title>login</title>

</head>

<body>

   <!-- Formularios -->
    <div class="contenedor-formularios">
      
        <!-- Contenido de los Formularios -->
        <div class="contenido-tab">
            <!-- Iniciar Sesion -->
            <div id="iniciar-sesion">
                <h1>Acceso al sistema</h1>
          
                
                
                <form action="LoginServlet" method="post">
                    <div class="contenedor-input">
                        
                        <label>Usuario :</label> <br><br>
                        <label>
							<span id="userSpan" class="req"> Ingrese su usuario *</span>
                        </label>
                        <input name="username" type="text" id="userInput" required>
                    </div>

                    <div class="contenedor-input">
                    	<label>Contraseña :</label> <br><br>
                    	<label>
                    		<span id="passwordSpan" class="req">Ingrese su contraseña *</span>
                    	</label>                    
                        <input name="password" type="password" id="passwordInput" required>
                    </div>
                    
                    <input type="submit" class="button button-block" value="Iniciar Sesión">
                </form>
            </div>
     
            
	   <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>