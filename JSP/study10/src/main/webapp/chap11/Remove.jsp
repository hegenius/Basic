<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%-- JSTL core 을 사용하기 위해서 추가 --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- jstl 의 set을 사용하여 각 영역에 변수 및 데이터 추가 --%>
<%-- scope 안쓰면 기본적으로 page 들어감 --%>
<c:set var="scopeVar" value="Page Value" />
<c:set var="scopeVar" value="Request Value" scope="request" />
<c:set var="scopeVar" value="Session Value" scope="session" />
<c:set var="scopeVar" value="Application Value" scope="application" />

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<body>

<div class="container mt-5">
    <h4>출력하기</h4>
    <ul class="list-group">
<%--        EL 언어 사용하여 각 영여에 저장된 변수의 값 출력 --%>
<%--        영역 표시가 없으면 지정한 변수명을 가지고 있는 가장 낮은 영역의 변수를 출력 --%>
        <li class="list-group-item">scopeVar : ${ scopeVar }</li>
        <li class="list-group-item">requestScope.scopeVar : ${ requestScope.scopeVar }</li>
        <li class="list-group-item">sessionScope.scopeVar : ${ sessionScope.scopeVar }</li>
        <li class="list-group-item">applicationScope.scopeVar : ${ applicationScope.scopeVar }</li>
    </ul>

    <br>
    <h4>session 영역에서 삭제하기</h4>
<%--    JSTL remove를 사용하여 지정한 영역의 변수 삭제 --%>
    <c:remove var="scopeVar" scope="session" />
    <ul class="list-group">
        <li class="list-group-item">scopeVar : ${ scopeVar }</li>
        <li class="list-group-item">requestScope.scopeVar : ${ requestScope.scopeVar }</li>
        <li class="list-group-item">sessionScope.scopeVar : ${ sessionScope.scopeVar }</li>
        <li class="list-group-item">applicationScope.scopeVar : ${ applicationScope.scopeVar }</li>
    </ul>

    <br>
    <h4>scope 지정 없이 삭제하기</h4>
<%--    jstl의 set은 scope를 지정하지 않으면 page 영역에 저장, remove는 scope를 지정하지 않으면 모든 영역의 변수를 삭제 --%>
    <c:remove var="scopeVar" />
    <ul class="list-group">
        <li class="list-group-item">scopeVar : ${ scopeVar }</li>
        <li class="list-group-item">requestScope.scopeVar : ${ requestScope.scopeVar }</li>
        <li class="list-group-item">sessionScope.scopeVar : ${ sessionScope.scopeVar }</li>
        <li class="list-group-item">applicationScope.scopeVar : ${ applicationScope.scopeVar }</li>
    </ul>
</div>
</body>
</html>
