<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오후 3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%-- JSTL의 core 태그를 사용하기 위해서 추가 --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%-- JSTL의 formatting 태그를 사용하기 위해서 추가 --%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>

<!DOCTYPE html>
<html lang="en_KR">
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
    <%--  jstl의 set으로 변수 선언, 자바에서 제공하는 Date 클래스 타입의 객체를 저장 --%>
    <c:set var="today" value="<%= new java.util.Date() %>" />

    <h4>날짜 포맷</h4>
<%--  type을 date로 사용하여 날짜 정보만 출력 --%>
    <p>full : <fmt:formatDate value="${ today }" type="date" dateStyle="full" /> </p>
    <p>short : <fmt:formatDate value="${ today }" type="date" dateStyle="short" /> </p>
    <p>long : <fmt:formatDate value="${ today }" type="date" dateStyle="long" /> </p>
    <p>default : <fmt:formatDate value="${ today }" type="date" dateStyle="default" /> </p>

    <br><hr><br>
    <h4>시간 포맷</h4>
<%--  type을 time으로 사용하여 시간 정보만 출력 --%>
    <p>full : <fmt:formatDate value="${ today }" type="time" dateStyle="full" /> </p>
    <p>short : <fmt:formatDate value="${ today }" type="time" dateStyle="short" /> </p>
    <p>long : <fmt:formatDate value="${ today }" type="time" dateStyle="long" /> </p>
    <p>default : <fmt:formatDate value="${ today }" type="time" dateStyle="default" /> </p>

    <br><hr><br>
    <h4>날짜.시간 표시</h4>
<%--  type을 both로 사용하여 날짜 및 시간 정보를 모두 출력, 날짜, 시간 모두 출력하기 때문에 dateStyle, timeStyle을 모두 설정 --%>
    <p><fmt:formatDate value="${ today }" type="both" dateStyle="full" timeStyle="full" /></p>
<%--  type을 both로 사용하여 날짜 및 시간 정보를 모두 출력, pattern 속성을 사용하여 사용자가 원하는 패턴을 사용 --%>
    <p><fmt:formatDate value="${ today }"  type="both" pattern="yyyy-MM-dd hh:mm:ss" /></p>

    <br><hr><br>

    <h4>타임존 설정</h4>
<%--  시간 정보를 원하는 값으로 설정 --%>
    <fmt:timeZone value="GMT">
        <p><fmt:formatDate value="${ today }" type="both" dateStyle="full" timeStyle="full" /></p>
    </fmt:timeZone>
    <fmt:timeZone value="America/Chicago">
        <p><fmt:formatDate value="${ today }" type="both" dateStyle="full" timeStyle="full" /></p>
    </fmt:timeZone>
</div>
</body>
</html>
