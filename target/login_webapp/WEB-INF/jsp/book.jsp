<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Books</title>
</head>
<body>

<%--<%--%>
<%--    List<Book> books = (List<Book>) request.getSession().getAttribute("books");--%>

<%--    for (Book book : books) {--%>
<%--%>--%>

<%--<%=book.getTitle()%>--%>

<%--<br>--%>

<%--<%--%>
<%--    }--%>
<%--%>--%>
    <core:forEach items="${books}" var="book">
        <core:if test="${book.year >= 2000}">
            ${book.title} <br>
            ${book.year} <br>
        </core:if>
    </core:forEach>
</body>
</html>
