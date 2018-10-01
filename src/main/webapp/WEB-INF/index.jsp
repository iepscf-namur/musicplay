<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${title}"/></title>
    <link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
    <div class="jumbotron">
        <h1 class="display-4">Servlet Version : <c:out value="${servletInfo}"/></h1>
        <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
        <hr class="my-4">
        <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
        <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
    </div>

    <script src="webjars/jquery/3.3.1/jquery.min.js"></script>
    <script src="webjars/popper.js/1.14.3/popper.min.js"></script>
    <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>
