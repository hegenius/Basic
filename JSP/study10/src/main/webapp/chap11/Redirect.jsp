<%--
  Created by IntelliJ IDEA.
  User: it
  Date: 24. 7. 1.
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%-- 리다이렉트 시 전달할 데이터, --%>
<c:set var="requestVar" value="MustHave" scope="reguest" />
<c:redirect url="./inc/OtherPage.jsp">
    <c:param name="user_param1" value="KBO" />
    <c:param name="user_param2" value="롯데자이언츠" />
</c:redirect>
