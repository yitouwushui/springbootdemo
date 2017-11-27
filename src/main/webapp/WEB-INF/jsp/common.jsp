<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>--%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--<base href="<%=basePath%>">--%>
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<!-- 通用 JS 库 -->
<script src="../../static/js/jquery-1.11.3.min.js"></script>
