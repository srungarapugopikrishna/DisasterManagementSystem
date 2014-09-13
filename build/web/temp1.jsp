<%-- 
    Document   : temp1
    Created on : Sep 13, 2014, 10:24:25 AM
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
       <h1 align="center"> Create Disaster </h1>

        <form id="Disasterinfo" name="diaster" method="post" action="disaster">
            <div align="center">
                <table width="564" border="0" align="center" cellpadding="5" cellspacing="5">
                    <tr>
                        <td width="163"><div align="right">Disaster name :</div></td>
                        <td width="391"><div align="left">
                                <input type="text" name="name" id="textfield">
                            </div></td>
                    </tr>
                    <tr>
                        <td><div align="right">Location :</div></td>
                        <td><div align="left">

                                <input type="location_name" name="location_name" id="textfield2">
                            </div></td>
                    </tr>
                    <tr>
                        <td><div align="right">Totalotal Death </div></td>
                        <td><div align="left">
                                <input type="text" name="total_death" id="textfield">
                            </div></td>
                    </tr>
                    <tr>
                        <td><div align="right">Property lost :</div></td>
                        <td><div align="left">

                                <input type="text" name="Property" id="textfield">
                            </div></td>
                    </tr> <tr>
                        <td><div align="right">Disaster Type</div></td>
                        <td><div align="left">
                                <input type="text" name="Diaster_type" id="text">
                            </div></td>
                    </tr>
                    <tr>
                        <td colspan="2"><div align="center">
                                <input type="submit" name="submit" id="submit" value="Submit">
                            </div>
                            <div align="left"></div></td>
                    </tr>
                </table>
</form>
    </body>
</html>
