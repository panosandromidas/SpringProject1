<%-- 
    Document   : startpage
    Created on : Feb 12, 2020, 8:10:48 PM
    Author     : panos
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
        <form method="POST" action="/submitform">
            <input type="text" name="text">put a name
            <input type="radio" name="radio">radio
            <input type="checkbox" name="checkbox">check me
            <input type="submit">
        </form>
        
    </body>
</html>
