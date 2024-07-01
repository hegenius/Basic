<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%-- JSTL core 사용하기 위해 추가 --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- JSTL set을 사용하여 변수 선언 --%>
<c:set var="number" value="100" />
<c:set var="string" value="JSP" />

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

    <h4>JSTL의 if 태그로 짝수/홀수 판단하기</h4>
<%--   jstl의 if문 사용, 조건식의 결과가 true이면 시작태그와 끝 태그 사이에 입력된 내용을 출력 --%>
<%--    조건식의 결과를 var 속성으로 지정한 변수명에 저장 --%>
    <c:if test="${ number mod 2 eq 0}" var="result">
        ${ number }는 짝수입니다. <br/>
    </c:if>
    result : ${result} <br/><br/><br/>
    <h4>문자열 비교와 else 구문 흉내내기</h4>
<%--    jstl의 if 사용, 결과를 result2에 저장 --%>
    <c:if test="${ string eq 'Java' }" var="result2">
        문자열은 Java입니다. <br/>
    </c:if>
<%--    바로 위의 if문의 결과를 받아와서 not 연산자로 결과를 변경한 후 사용 --%>
<%--    2개의 if문을 사용하여 if ~ else문을 구현함 --%>
    <c:if test="${ not result2 }">
        'Java'가 아닙니다. <br/>
    </c:if>
    <br/><br/>
    <h4>조건식 주의사항</h4>
<%--    조건식에 ${}를 사용하지 않고 직접 값을 입력, 무조건 false로 출력 --%>
    <c:if test="100" var="result3">
        EL이 아닌 정수를 지정하면 false
    </c:if>
    result3 : ${ result3 } <br/><br/>
<%--   jstl의 if문 사용 시 정수를 el 언어로 표현 시 오류 발생 --%>
<%--   jstl의 if문 사용 시 test 속성에 조건식을 사용하지 않고 정수만 입력 시 오류 발생 --%>
<%--    <c:if test="${test = 100}" var="result3">--%>
<%--        EL이 아닌 정수를 지정하면 false--%>
<%--    </c:if>--%>

    <br/><br/>
    <h4>if문 사용 시 연산식 없이 변수만 사용</h4>

    <h4>대소문자 구분없이 사용 시 (EL언어 아님)</h4>
    <c:if test="tRuE" var="result4">
        대소문자 구분 없이 "tRuE"인 경우 true <br/>
    </c:if>
    result4 : ${ result4 } <br/><br/>

    <h4>if 문 사용 시 EL언어를 사용하고 양쪽에 공백이 있을 경우</h4>
    <c:if test="${ true }" var="result5">
        EL 양쪽에 빈 공백이 있는 경우 false <br/>
    </c:if>
    result5 : ${ result5 } <br/>
    <br/><br/>
    <h4>if 문 사용 시 EL언어를 사용하고 공백없이 true만 출력시</h4>
    <c:if test="${true}" var="result6">
        EL 양쪽에 빈 공백이 없는 경우 true <br/>
    </c:if>
    result6 : ${result6} <br/>
</div>
</body>
</html>
