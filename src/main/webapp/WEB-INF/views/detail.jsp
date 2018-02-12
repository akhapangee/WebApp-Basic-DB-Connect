<%if (request.getMethod().equalsIgnoreCase("post")) {%>
<div style="background: green; color: #fff">
    <h1>Name: <%out.println(request.getParameter("firstName") + " " + request.getParameter("lastName")); %></h1>
</div>
<a href="index.jsp">Back</a>
<%} else {
        out.println("Hero bhako ho?");
//        response.sendRedirect("index.jsp");
    }%>