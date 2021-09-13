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
    <!-- import jquery -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <!-- check password confirmation -->
    <script>
        $(() => {
            $('#password, #password_confirmation').on('keyup', function () {
                if ($('#password').val() == "" && $('#password_confirmation').val() == "") {
                    $('#submit').prop('disabled', true);
                    $('#message').hide();
                } else if ($('#password').val() == $('#password_confirmation').val()) {
                    $('#submit').prop('disabled', false);
                    $('#message').show().html('Password Match').css('color', 'green');
                } else {
                    $('#submit').prop('disabled', true);
                    $('#message').show().html('Password do not match').css('color', 'red');
                }
            });
        });
    </script>
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
            <form:input type="password" path="password" name="password"  id="password" placeholder="Hasło" />
        </div>
        <div class="form-group">
            <input  type="password" name="password2"  id="password_confirmation" placeholder="Powtórz hasło" />
            <p id="message"></p>
        </div>

        <div class="form-group form-group--buttons">
            <button class="btn" type="submit" id="submit" onsubmit="checkPassword()">Załóż konto</button>
        </div>



    </form:form>

</section>

<%@ include file="../include/footer.jsp" %>

<script src="<c:url value="../resources/js/app.js"/>"></script>
</body>
</html>