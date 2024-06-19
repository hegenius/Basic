<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<body>
<%--    <h1><%= "Hello World!" %>--%>
<%--    </h1>--%>
<%--    <br/>--%>
<%--    <a href="hello-servlet">Hello Servlet</a>--%>

    <div class="container mt-5">
        <h2>chap 2</h2>
        <ul class="list-group">
            <li class="list-group-item"><a href="Calculator.jsp" target="_blank">getParameter 사용하기 1</a></li>
            <li class="list-group-item"><a href="login.jsp" target="_blank">getParameter 사용하기 2</a></li>
            <li class="list-group-item"><a href="ResponseMain.jsp" target="_blank">Response 객체</a></li>
            <li class="list-group-item"><a href="OutMain.jsp" target="_blank">Out 객체</a></li>
            <li class="list-group-item"><a href="ApplicationMain.jsp" target="_blank">application 객체</a></li>
            <li class="list-group-item"><a href="Error500.jsp" target="_blank">Exception 객체</a></li>
        </ul>

        <hr>

        <h2>chap 3</h2>
        <ul class="list-group">
            <li class="list-group-item"><a href="PageContextMain.jsp" target="_blank">page 영역</a></li>
        </ul>
    </div>
</body>
</html>