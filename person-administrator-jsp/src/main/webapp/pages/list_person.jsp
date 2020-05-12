<%@ page import="hu.alkfejl.controller.StartController" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>

<html>
<head>
    <jsp:include page="common/common-header.jsp"/>
    <title>Survey competition</title>
</head>
<body>
<jsp:include page="common/menu.jsp"/>
<jsp:include page="/SurveyController"/>
<div class="container">
    <table class="table">
        <thead class="thead-dark">
        <tr>
            <th scope="col">Name</th>
            <th scope="col">From</th>
            <th scope="col">To</th>
            <th scope="col">Time Limit</th>
            <th scope="col">Start Limit</th>
            <th scope="col">ID</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${requestScope.surveyList}">
            <tr>
                <td>${item.name}</td>
                <td>${item.from}</td>
                <td>${item.to}</td>
                <td>${item.maxTime}</td>
                <td>${item.limit}</td>
                <td>${item.id}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <form action="../StartController" method="post">
    <input required name="id" type="text" class="form-control" id="id"
           placeholder="Type survey id here!"/>
        <button id="submit" type="submit" class="btn btn-primary">Start survey</button>
    </form>

</div>

</body>
</html>

