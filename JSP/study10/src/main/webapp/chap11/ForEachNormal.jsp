<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 11:23
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
    <h4>일반 for문 형태의 forEach 태그</h4>
    <div>
        <p>
            <%--      JSTL의 forEach 로 반복문 사용 --%>
            <c:forEach begin="0" end="10" step="1" var="i">
                <span class="me-4">i의 값 : ${i}</span>
            </c:forEach>
        </p>

        <br>

        <p>
            <%
                for (int i = 0; i <= 10; i++) {
                    out.print("<span class='me-4'>i의 값 : " + i + "</span>");
                }
            %>
        </p>

        <br>

        <p>
            <%
                for (int i = 0; i <= 10; i++) {
            %>
            <span class="me-4">i의 값 : <%=i%></span>
            <%
                }
            %>
        </p>
    </div>

    <br><hr><br>

    <h4>varStatus 속성 살펴보기</h4>
    <table class="table table-bordered table-hover table-striped">
        <tbody>
<%--        varStatus로 forEach의 상태 확인 --%>
        <c:forEach begin="3" end="5" var="i" varStatus="loop">
            <tr>
                <td>count : ${ loop.count }</td>
                <td>index : ${ loop.index }</td> <%-- 초기값 설정 --%>
                <td>current : ${ loop.current }</td> <%-- 초기값 설정 --%>
                <td>i : ${i}</td>
                <td>first : ${ loop.first }</td>
                <td>last : ${ loop.last }</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br><hr><br>

    <h4>1에서 100까지 정수 중 홀수의 합</h4>
    <div>
        <c:forEach begin="1" end="100" var="j">
            <c:if test="${ j mod 2 ne 0}">
                <c:set var="sum" value="${ sum + j }" />
            </c:if>
        </c:forEach>
        <p>1 ~ 100 사이의 정수 중 홀수의 합은? ${ sum }</p>
    </div>
</div>
</body>
</html>
