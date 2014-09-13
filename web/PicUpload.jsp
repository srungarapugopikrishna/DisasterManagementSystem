<%-- 
    Document   : PicUpload
    Created on : Sep 14, 2014, 1:27:07 AM
    Author     : gopi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="upload" method="post" enctype="multipart/form-data">
            
            <input type="file" name="file" /><br>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
