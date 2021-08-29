<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%--
  Created by IntelliJ IDEA.
  User: krzysiekryniu
  Date: 29.08.2021
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Document</title>
    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
</head>
<body>

<%@ include file="include/headermain.jsp" %>

<%@ include file="include/stats.jsp" %>

<%@ include file="include/steps.jsp" %>

<%@ include file="include/aboutus.jsp" %>

<%@ include file="include/listofinstitutions.jsp" %>

<%@ include file="include/footer.jsp" %>

<script src="<c:url value="resources/js/app.js"/>"></script>

</body>
</html>
