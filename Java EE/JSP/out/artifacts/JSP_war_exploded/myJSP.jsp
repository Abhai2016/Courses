<%@ page import="java.util.Date" %>
<%@ page import="com.abhai.jsp.JSPHelper" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 9/13/3030
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%! int i = 5;%>
    <%! private void doJob() {
        System.out.println("Hello world from JSP's method(declaration with < % !");
    }
    %>
    <h3><%= "Hello World from JSP's(expression - < % ! )"%></h3>
    <h3><%= "I = " + (i + 3) %></h3>
    <h3><%= new Date() %></h3>
    <h3><%= "Called a method from the JSPHelper class which return : " + JSPHelper.minus(i, 3) %></h3>
    <% if (Math.random() > 0.5) { %>
        <h3>Hello World from condition in JSP</h3>
    <% } %>
    <h2>Hello World from myJSP with Live Edit</h2>
    <h3><%= "There is request parameter like in Servlet as well: request.getMethod() = " + request.getMethod() %></h3>
    <h3><%= "And we have an access to the seession as well, attributesNames = " + session.getAttributeNames() %></h3>
    <h3><%= "And there is response as well : response.getStatus() = " + response.getStatus() %></h3>
    <jsp:include page="WEB-INF/nestedJSP.jsp"/>
    <%--<jsp:forward page="index.jsp"/> like response.sendRedirect("url...") --%>

    <%-- Beans - classes with private fields and geteers and setters for them which we can use here in JSP --%>
    <jsp:useBean id="person" class="com.abhai.jsp.Person" scope="session"/>
    <%-- Creates only once with name - Mike so even if we will change the value Mike will keep until session ends because of scope = session
    <jsp:useBean id="person" class="com.abhai.jsp.Person" scope="session">
        <jsp:setProperty name="person" property="name" value="Mike"/>
    </jsp:useBean>
    --%>

    <%--
    <jsp:setProperty name="person" property="name" value="Abhai"/>
    <h3><jsp:getProperty name="person" property="name"/></h3>
    <%! int age = 18; %>
    <jsp:setProperty name="person" property="age" value="<%= age %>"/>
    <h3><jsp:getProperty name="person" property="age"/></h3>
    --%>

    <jsp:setProperty name="person" property="*"/>
    <h3><jsp:getProperty name="person" property="name"/></h3>
    <h3><jsp:getProperty name="person" property="age"/></h3>

    <%-- We can't see the WEB-INF files from the browser so we keep there files which we include in our main pages or files which don't have to be accessed from the browser --%>

    <%-- Lifecycle JSP --%>
    <%! public void jspInit() {
        System.out.println("initialize jsp");
    }
    %>

    <%! public void jspDestroy() {
        System.out.println("destroy jsp");
    }
    %>
</body>
</html>
