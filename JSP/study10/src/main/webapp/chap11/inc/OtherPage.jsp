<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오후 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
    <h4>OtherPage.jsp</h4>
    <ul class="list-group">
<%--        jstl의 impoprt는 액션태그의 <jsp:include>와 같은 기능을 하므로 import 한 페이지로 이동후 출력한 결과만 가져와서 화면에 출력 --%>
        <li class="list-group-item">저장된 값 : ${ requestScope.requestVar }</li>
        <li class="list-group-item">매개변수 1 : ${ param.user_param1 }</li>
        <li class="list-group-item">매개변수 2 : ${ param.user_param2 }</li>
    </ul>
</div>
</body>
</html>
