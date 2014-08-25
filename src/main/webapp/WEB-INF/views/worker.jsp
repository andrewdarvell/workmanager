<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.title" /></title>
</head>
<body>
<form:form method="post" action="add" commandName="worker">

    <table>
        <tr>
            <td><form:label path="firstName">
                <spring:message code="label.firstName" />
            </form:label></td>
            <td><form:input path="firstName" /></td>
        </tr>
        <tr>
            <td><form:label path="lastName">
                <spring:message code="label.lastName" />
            </form:label></td>
            <td><form:input path="lastName" /></td>
        </tr>
        <tr>
            <td><form:label path="ages">
                <spring:message code="label.ages" />
            </form:label></td>
            <td><form:input path="ages" /></td>
        </tr>
        <tr>
            <td><form:label path="position">
                <spring:message code="label.position" />
            </form:label></td>
            <td><form:input path="position" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="<spring:message code="label.addworker"/>" /></td>
        </tr>
    </table>
</form:form>


<h3><spring:message code="label.workers" /></h3>
<c:if test="${!empty workerList}">
    <table class="data">
        <tr>
            <th><spring:message code="label.firstName" /></th>
            <th><spring:message code="label.lastName" /></th>
            <th><spring:message code="label.position" /></th>
            <th><spring:message code="label.ages" /></th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${workerList}" var="worker">
            <tr>
                <td>${worker.lastName}</td>
                <td>${worker.firstName}</td>
                <td>${worker.position}</td>
                <td>${worker.ages}</td>
                <td><a href="delete/${worker.id}"><spring:message code="label.delete" /></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
