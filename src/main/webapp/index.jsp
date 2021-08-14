<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="mma" uri="/WEB-INF/murach.tld" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>

<h1>Join our email list</h1>

<p>To join our email list, enter your name and email address below.</p>

<p><mma:ifEmptyMark color="blue" field="" /> marks required fields</p>

<form action="emailList" method="post">
    <input type="hidden" name="action" value="add">

    <label class="pad_top">Email</label>
    <input type="email" name="email" value="${user.email}"><mma:ifEmptyMark color="blue" field="${user.email}"/><br>

    <label class="pad_top">FirstName:</label>
    <input type="text" name="firstName" value="${user.firstName}"><mma:ifEmptyMark color="blue" field="${user.firstName}"/><br>

    <label class="pad_top">Last Name:</label>

    <%--legacy code--%>
    <%--
    <input type="text" name="lastName" value="<%= user.getLastName() %>">
    <mma:ifEmptyMark color="red" field="<%=user.getLastName() %>"/><br>
    --%>
    <input type="text" name="lastName" value="${user.lastName}"><mma:ifEmptyMark color="blue" field="${user.lastName}"/><br>

    <label>&nbsp;</label>
    <input type="submit" value="Join Now" class="margin_left">
</form>

<p>The current date is <mma:currentDate /> </p>

<p>The current time is <mma:currentTime /> </p>

<mma:ifWeekday>
    <p>Live support available at 1-800-555-2222</p>
</mma:ifWeekday>


</body>
</html>