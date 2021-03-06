<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ include file="header.jsp" %>

<h2>${title}</h2>

<table>
    <tr>
        <th><spring:message code="name"></spring:message></th>
        <td>${contact.name}</td>
    </tr>
    <tr>
        <th><spring:message code="number"></spring:message></th>
        <td>${contact.number}</td>
    </tr>
</table>

<%@ include file="footer.jsp" %>