<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysiekryniu
  Date: 12.09.2021
  Time: 00:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="../resources/css/style.css"/>"/>
</head>
<body>
<%@ include file="../include/headerregisterform.jsp" %>

<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form method="post" modelAttribute="user">
        <div class="form-group">
            <form:input path="email" name="email"  placeholder="Email"/>
        </div>
        <div class="form-group">
            <form:input type="password" path="password" name="password" placeholder="Hasło" />
        </div>
        <div class="form-group">
            <input type="password" name="password2" placeholder="Powtórz hasło" />
        </div>

        <div class="form-group form-group--buttons">
<%--            <a href="login.html" class="btn btn--without-border">Zaloguj się</a>--%>
            <button class="btn" type="submit">Załóż konto</button>
        </div>
    </form:form>

</section>

<%@ include file="../include/footer.jsp" %>

<script src="<c:url value="../resources/js/app.js"/>"></script>
</body>
</html>