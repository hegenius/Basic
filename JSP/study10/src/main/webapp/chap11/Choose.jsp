<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="number" value="100" />

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
    <h4>choose 태그로 홀짝 판단하기</h4>
    <c:choose>
        <c:when test="${ number mod 2 eq 0 }">
            <p>${ number }는 짝수입니다.</p>
        </c:when>
        <c:otherwise>
            <p>${ number }는 홀수입니다.</p>
        </c:otherwise>
    </c:choose>
    <br><br>

    <h4>국,영,수 점수를 입력하면 평균을 내어 학점 출력</h4>
    <form>
        <p>국어 : <input type="text" name="kor"/> </p>
        <p>영어 : <input type="text" name="eng"/> </p>
        <p>수학 : <input type="text" name="math"/> </p>
        <input type="submit" value="학점 구하기">
    </form>

<%--    EL 언어를 사용하여 파라미터값이 있는지 확인 --%>
<%--    EL 언어에서 empth 연산자는 지정한 데이터가 비었으면 true, 데이터가 있으면 false --%>
    <c:if test="${ not (empty param.kor or empty param.eng or empty param.math) }">
<%--        set을 사용하여 변수 저장 --%>
        <c:set var="avg" value="${ (param.kor + param.eng + param.math) / 3}" />
        <p>평균 점수는 ${avg }으로</p>
        <c:choose>
            <c:when test="${ avg >= 90 }">A 학점</c:when>
            <c:when test="${ avg >= 80 }">B 학점</c:when>
            <c:when test="${ avg ge 70 }">C 학점</c:when>
            <c:when test="${ avg ge 60 }">D 학점</c:when>
            <c:otherwise>F 학점</c:otherwise>
        </c:choose>
        입니다.
    </c:if>
</div>


</body>
</html>
