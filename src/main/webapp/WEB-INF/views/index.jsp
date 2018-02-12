<%-- 
    Document   : index
    Created on : Jan 7, 2018, 8:07:41 PM
    Author     : Akhilesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>METHOD GET SECTION START</h1>
        <form method="get">
            <div>
                <label>First Name</label>
                <input type="text" name ="firstname" value="" required="required" />
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name ="lastname" value="" required="required"/>
            </div>
            <button type="submit" name="submit">Save</button>
        </form>
        <%if (request.getParameter("submit") != null) {%>
        <div style="background: green; color: #fff">
            <h1>Name: <%out.println(request.getParameter("firstname") + " " + request.getParameter("lastname")); %></h1>
        </div>
        <%}%>
        <h1>METHOD GET SECTION CLOSE</h1>
        <!----------------------NEXT SECTION-------------------->
        <h1>METHOD POST SECTION START</h1>
        <form method="POST" action="detail.jsp">
            <div>
                <label>First Name</label>
                <input type="text" name ="firstName" value="" required="required" />
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name ="lastName" value="" required="required"/>
            </div>
            <button type="submit" name="Submit">Save</button>
        </form>
        
        <h1>METHOD POST SECTION CLOSE</h1>
    </body>
</html>
