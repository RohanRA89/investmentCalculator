<%--
  Created by IntelliJ IDEA.
  User: rohanayub
  Date: 1/11/17
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Investment Calculator</title>
  </head>
  <body>
  <h1>Welcome to the Investment Calculator</h1>
  <form method="post" action="/investmentsResults">
    <table>
      <tr><td>First Name:</td><td><input type="text" name="firstName"></td></tr>
      <tr><td>Last Name:</td><td><input type="text" name="lastName"></td></tr>
      <tr><td>Investment Amount:</td><td><input type="text" name="investAmount"></td></tr>
      <tr><td>Investment Return:</td><td><input type="text" name="investReturn"></td></tr>
    </table>

    <p>
      <input type="submit">
    </p>

  </form>

  </body>
</html>
