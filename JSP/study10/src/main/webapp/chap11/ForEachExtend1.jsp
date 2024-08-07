<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 11:33
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
        String[] rgba = {"Red", "Green", "Blue", "Black"};
    %>

    <h4>향상된 for문 형태의 forEach 태그</h4>
<%--   items 속성에 <%=%> 형태의 표현식을 사용한 이유는 ${} 형태의 EL언어는 스크립틀릿에서 저장한 변수를 읽을 수 없음 --%>
    <c:forEach items="<%= rgba %>" var="c">
        <span class="me-3" style="color:${ c };">${ c }</span>
    </c:forEach>

    <br><hr><br>

    <h4>varStatus 속성 살펴보기</h4>
    <table class="table table-bordered table-hover table-striped">
        <tbody>
        <c:forEach items="<%= rgba %>" var="c" varStatus="loop">
            <tr>
                <td>count : ${ loop.count }</td>
                <td>index : ${ loop.index }</td> <%-- 초기값 설정 --%>
                <td>current : ${ loop.current }</td> <%-- 초기값 설정 --%>
                <td>c : ${c}</td>
                <td>first : ${ loop.first }</td>
                <td>last : ${ loop.last }</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
