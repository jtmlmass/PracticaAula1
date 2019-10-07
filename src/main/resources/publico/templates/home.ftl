<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hola, ${usuario.nombre}</h1>
<form action="/hacerLogout" method="get"  enctype="application/x-www-form-urlencoded">
    <button type="submit" class="btn btn-primary btn-block"> Log out</button>
</form>

</body>
</html>