<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<c:if test="${!empty actionObj}">
    <form:form method="post" action="add" commandName="action">
        <c:set var="actName" value="${actionObj.actionName}"/>
        <tr>
            </td>
            <td><form:input path="actionName" value="${actName}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="<spring:message code="action.write"/>" />
            </td>
        </tr>
    </form:form>
</c:if>>
</body>
</html>
