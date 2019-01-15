<%-- 
    Document   : processForm
    Created on : Jul 20, 2018, 11:31:20 AM
    Author     : Cezar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        <br><br>
        
        Username: ${param.username}
        
        <br><br>
        
        User firstname: ${param.firstname}
         <br><br>
        
         User surname: ${param.lastname}
          <br><br>
         User email: ${param.email}
         
          <br><br>
          User birthday: ${param.birthday}
          
          
            <br><br>
         User email: ${param.password}
         
    </body>
</html>
