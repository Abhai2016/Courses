<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 9/15/2020
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:useBean id="Student" class="com.abhai.mvc.models.Student" scope="request"/>
<%--    <jsp:useBean id="Student" class="com.abhai.mvc.models.Student" scope="session"/>--%>
<%--    <jsp:useBean id="Student" class="com.abhai.mvc.models.Student" scope="application"/>--%>
    <h3><jsp:getProperty name="Student" property="name"/></h3>
    <h3>${Student.age}</h3> <%-- We can get an access to the attributes via Expression Language --%>
    <%-- And we can get it from each scope by requestScope|sessionScope|applicationScope.Student --%>
    <%-- We can work with collection via Expression Language --%>
    <%-- And we can ignore Expression Langueage and print as usual text by import isELIgnored="true" in <%@ page%> or
    jsp-config in web.xml and we even can turn off all java code in jsp by jsp-config in web.xml as well --%>
</body>
</html>
