<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 6. 26.
  Time: 오전 10:43
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
    <h2 class="text-center">액션 태그로 폼값 한 번에 받기</h2>
    <form method="post" action="UseBeanAction.jsp">
        <div class="my-3">
            <label for="user-id" class="form-label">이름</label>
            <input type="text" class="form-control" id="user-id" name="userId" placeholder="이름을 입력하세요">
        </div>
        <div class="my-3">
            <label for="user-age" class="form-label">나이</label>
            <input type="text" class="form-control" id="user-age" name="userAge" placeholder="나이를 입력하세요">
        </div>
        <div class="my-3 d-grid gap-2">
            <button type="submit" class="btn btn-primary">전송</button>
        </div>
    </form>
</div>

</body>
</html>
