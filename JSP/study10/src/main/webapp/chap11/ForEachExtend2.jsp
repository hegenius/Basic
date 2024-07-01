
<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오전 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>

<%@ page import="bitc.fullstack405.study10.Person" %>


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
    <h4>List 컬렉션 사용하기</h4>
    <%
        // 스크립틀릿의 변수로 선언, page 영역에 저장한 것이 아님
        LinkedList<Person> lists = new LinkedList<Person>();
        lists.add(new Person("이민석", 22));
        lists.add(new Person("윤동희", 23));
        lists.add(new Person("정보근", 24));
    %>
    <c:set var="lists" value="<%= lists %>"/>
    <c:forEach items="${ lists }" var="list">
        <li>
            이름 : ${ list.name }, 나이 : ${ list.age }
        </li>
    </c:forEach>

    <br><br>

    <h4>Map 컬렉션 사용하기</h4>
    <%
        Map<String,Person> maps = new HashMap<String,Person>();
        maps.put("1st", new Person("이민석", 22));
        maps.put("2nd", new Person("윤동희", 23));
        maps.put("3rd", new Person("정보근", 24));
    %>
    <c:set var="maps" value="<%= maps %>" />
    <c:forEach items="${ maps }" var="map">
<%--        map 방식이기 때문에 item.key 입력 시 key 값이 출력, item.value 입력 시 value 값이 출력 --%>
<%--        item.value로 출력된 값이 Person 클래스 타입의 객체이기 때문에 해당 객체의 필드값을 출력하기 위해서 item.value.name, item.value.age를 사용함 --%>
        <li>key => ${ map.key } <br/>
            value => 이름 : ${ map.value.name }, 나이 : ${ map.value.age }
        </li>
    </c:forEach>
</div>
</body>
</html>
