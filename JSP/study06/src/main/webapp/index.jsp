<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
    <h2>chat06</h2>
  <ul class="list-group">
      <li class="list-group-item">
          <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="./chat06/SessionMain.jsp" class="btn btn-link">세션 사용하기</a>
      </li>
      <li class="list-group-item">
          <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="./chat06/LoginForm.jsp" class="btn btn-link">세션으로 로그인 하기</a>
      </li>
      <li class="list-group-item">
          <a target="_blank" title="새창열림" rel="noopener noreferrerhref" href="./chat06/LoginForm2.jsp" class="btn btn-link">세션으로 로그인 하기2</a>
      </li>
  </ul>
</div>
</body>
</html>