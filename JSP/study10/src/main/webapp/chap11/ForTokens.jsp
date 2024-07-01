<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오후 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

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
    <%
        // 스클립틀릿으로 변수 선언
        String rgb1 = "Red,Green,Blue,Black";
    %>
    <c:set var="rgb2" value="Red,Green,Blue,Black"></c:set>

    <h3>forTokens 사용하기</h3>
    <div>
<%--        forTokens는 java에서 split + for문이 합쳐진 형태 --%>
<%--        스크립틀릿으로 선언한 변수를 표현식으로 사용 --%>
        <c:forTokens items="<%= rgb1 %>" delims="," var="color1">
            <span class="me-4" style="color:${ color1 };">${ color1 }</span> <br/>
        </c:forTokens>
    </div>
    <br>
    <div>
<%--        JSTL의 set으로 page 영역에 선언한 변수를 EL 언어로 사용 --%>
        <c:forTokens items="${rgb2}" delims="," var="color2">
            <span class="me-4" style="color:${ color2 };">${ color2 }</span> <br/>
        </c:forTokens>
    </div>
</div>
</body>
</html>
