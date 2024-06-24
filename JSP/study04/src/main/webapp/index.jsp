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
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>

    <div class="container mt-5">
        <h2 class="mb-3">chap 5 데이터베이스</h2>
        <ul class="list-group">
            <li class="list-group-item">
                <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="connectionTest.jsp">DB 접속 테스트</a>
            </li>
            <li class="list-group-item">
                <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="./chat05/Insert.jsp">insert 사용</a>
            </li>
            <li class="list-group-item">
                <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="./chat05/Select.jsp">select 사용</a>
            </li>
        </ul>
    </div>

</body>
</html>