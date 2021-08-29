<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section class="help">
    <h2>Komu pomagamy?</h2>

    <!-- SLIDE 1 -->
    <div class="help--slides active" data-id="1">
        <p>W naszej bazie znajdziesz listę zweryfikowanych Fundacji, z którymi współpracujemy.
            Możesz sprawdzić czym się zajmują.</p>

        <ul class="help--slides-items">
            <c:forEach items="${findAllInstitutions}" var="institution" varStatus="institutionIndex">
                <c:set var="i" value="${institutionIndex.index}"/>
                <c:if test="${i%2==0}">
                    <li>
                    <div class="col">
                        <div class="title">${institution.name}</div>
                        <div class="subtitle">Cel i misja: ${institution.description}</div>
                    </div>
                </c:if>
                <c:if test="${i%2!=0}">
                    <div class="col">
                        <div class="title">${institution.name}</div>
                        <div class="subtitle">Cel i misja: ${institution.description}</div>
                    </div>
                    </li>
                </c:if>
            </c:forEach>
        </ul>

    </div>

</section>