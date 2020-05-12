<%@ page import="hu.alkfejl.controller.AnswerController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <jsp:include page="common/common-header.jsp"/>
    <title>Started survey</title>
</head>
<body>
<jsp:include page="common/menu.jsp"/>
<jsp:include page="/StartController"/>

<div class="container">
    <table class="table">

        <thead class="thead-dark">
        <tr>
            <th scope="col">Question</th>
            <th scope="col">Your answer</th>
            <th scope="col">Answer</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${requestScope.questionList}">
            <tr>
                <td>${item.name}</td>
                <td>
                    <style>
                    .hide { position:absolute; top:-1px; left:-1px; width:1px; height:1px; }
                    </style>

                    <iframe name="hiddenFrame" class="hide"></iframe>
                    <form action="../AnswerController" method="post" target="hiddenFrame">
                        <div class="form-group">
                            <input required name = "answer" type="text" class="form-control" id="answer"
                                   placeholder="Type your answer here!"/>
                        </div>
                        <button id="submit" type="submit" class="btn btn-primary">Submit</button>
                    </form>
                <td id = "myDIV" style="display: none">${item.sAnswer}</td>

            </tr>
        </c:forEach>
        </tbody>

    </table>
    <button onclick="myFunction()" class="btn btn-primary">Show answers</button>



</div>
<script>
    function myFunction() {
        var x = document.getElementById("myDIV");
        if (x.style.display === "none") {
            x.style.display = "block";
        } else {
            x.style.display = "none";
        }
    }
</script>

</body>
</html>
