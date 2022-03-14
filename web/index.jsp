<%-- 
    Document   : index
    Created on : 5/09/2021, 12:51:35 PM
    Author     : diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/Inicio.css">
    </head>
    
     <body>
      

  </div>

 

    
</body>

<div class="login-page">
  <div class="form">
    <form class="register-form">
      <input type="text" placeholder="name"/>
      <input type="password" placeholder="password"/>
      <input type="text" placeholder="email address"/>
      <button>create</button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
    </form>
      <form class="login-form" action="Iniciar" method="post" >
      <input type="text" placeholder="Usuario" name='usuario'/>
      <input type="password" placeholder="Contraseña" name="pass"/>
      <button>login</button>
      <p class="message">Not  tienes cuenta? <a href="Registro.jsp">Crear cuenta</a></p>
      <center>
         
      </center>
    </form>
  </div>
</div>
         
          
        
    </body>
</html>
