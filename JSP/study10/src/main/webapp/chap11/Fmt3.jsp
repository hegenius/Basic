<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오후 4:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

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
    <h4>로케일 설정</h4>
    <c:set var="today" value="<%= new java.util.Date() %>" />

    <p>한글로 설정 : <fmt:setLocale value="ko_kr" /> <br>
    <fmt:formatNumber value="10000" type="currency" /> <br>
    <fmt:formatDate value="${ today }" />
    </p>

    <p>일어로 설정 : <fmt:setLocale value="ja_JP" /><br>
    <fmt:formatNumber value="10000" type="currency" /><br>
    <fmt:formatDate value="${ today }" />
    </p>
    <p>영어로 설정 : <fmt:setLocale value="en_US" /><br>
    <fmt:formatNumber value="10000" type="currency" /><br>
    <fmt:formatDate value="${ today }" />
    </p>
</div>
</body>
</html>
