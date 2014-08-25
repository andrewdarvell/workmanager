
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<c:if test="${!empty actionList}">
    <table class="data">
        <tr>
            <th><spring:message code="action.id" /></th>
            <th><spring:message code="action.name" /></th>
            <th><spring:message code="action.worker" /></th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${actionList}" var="action">
            <tr>
                <td>${action.id}</td>
                <td>${action.name}</td>
                <td>
                    <!--c:forEach items="${action.}" var="action"-->

                    <!--/c:forEach-->
                </td>
                <td><a href="delete/${worker.id}"><spring:message code="label.delete" /></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
