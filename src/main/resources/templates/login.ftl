
<!DOCTYPE html>
<html>
<head>
    <title>${titulo}</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="well">
<h1>Login</h1>
    </div>
<form action="/login/" method="post"  enctype="application/x-www-form-urlencoded">
    Username: <input name="matricula" type="number"/><br/>
    Password: <input name="nombre" type="password"/><br/>
    <button name="Enviar" type="submit">Enviar</button>
</form>
</body>
</html>