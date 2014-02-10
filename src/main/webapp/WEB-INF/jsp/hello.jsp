<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>Hello View</title>
  </head>
  <body>
    <h1><c:out value="${message}"></c:out></h1>
    <ul>
      <li><a href="<c:url value="/hello"/>" title="User Page">User Page</a></li>
      <li><a href="<c:url value="/hello/admin"/>" title="Admin Page">Admin Page</a></li>
      <li><a href="<c:url value="/logout"/>" title="Logout">Logout</a></li>
    </ul>
  </body>
</html>
