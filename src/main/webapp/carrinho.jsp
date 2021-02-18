<?xml version="1.0" encoding="UTF-8" ?>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page"
      xmlns:c="http://java.sun.com/jsp/jstl/core"
      xmlns:u="urn:jsptagdir:/WEB-INF/tags/mylib/"
      xmlns:data="http://acme.com/functions">
<head>
    <title>Loja Web</title>
    <meta charset="ISO-8859-1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
</head>
<body>
<h2>Carrinho de compras</h2>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Usu&aacute;rio</th>
        <th scope="col">Quantidade</th>
        <th scope="col">Valor</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">${usuario}</th>
        <td>${qtd}</td>
        <td>${valor}</td>
    </tr>
    </tbody>
</table>
</body>
</html>
