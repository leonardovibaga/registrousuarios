<%-- 
    Document   : index
    Created on : 9/04/2019, 05:46:22 PM
    Author     : sotosanchez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuarios</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="row">
            <div class="col-md-12 text-center">
                <h1>Registro de usuarios</h1><br><br>
                <form action="ServletAplicacion" method="POST">
                    <div class="col-md-12 text-center">
                        <label>Numero de identificación de la persona</label>                        
                    </div><br><br>
                    <div class="col-md-4"></div>
                    <div class="col-md-4"> 
                        <input type="text" name="identificacion" class="form-control"/>                   
                    </div>
                    <div class="col-md-4"></div><br><br><br>
                    <div class="col-md-12 text-center">
                        <label>Nombre de la persona</label>                        
                    </div><br><br>
                    <div class="col-md-4"></div>
                    <div class="col-md-4"> 
                        <input type="text" name="nombre" class="form-control"/>                   
                    </div>
                    <div class="col-md-4"></div><br><br><br>
                    <div class="col-md-12 text-center">
                        <input type="submit" value="Guardar Persona" class="btn btn-success"/>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
