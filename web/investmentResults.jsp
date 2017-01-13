<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/11/17
  Time: 3:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Results Of Your Investment</title>
</head>
<body>
<h2>Hello <%=request.getAttribute("firName")%> <%=request.getAttribute("lasName")%> you invested <%=request.getAttribute("initialAmount")%> and wanted <%=request.getAttribute("investReturn")%> back. That's a <%=request.getAttribute("eval")%></h2>

</body>
</html>
