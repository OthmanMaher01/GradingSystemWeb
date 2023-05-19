<%@ page import="servlets.models.Course" %>
<%@ page import="servlets.models.Student" %>
<html>
<head>
    <title>Yahoo!!</title>
</head>
<body>
<div class="grading-header">

    <div>
        <h2 style="color:#353c4e;">Grading System</h2>
    </div>

    <div>
        <form action="/login.do" method="GET">
            <button type="submit" style="background: none;border: none;">
                <div style="display: flex;flex-direction: column;align-items: center;cursor:pointer;">
                    <img src="../../assets/logout.svg" width="30">
                    <span style="color: #353c4e;">Logout</span>
                </div>
            </button>
        </form>
    </div>
</div>
<div class="main">

    <div class="information">
            <div class="courses">
                <div class="wrapper" style=flex-direction:column;">
                    <div class="courses-header">

                        <%
                            Course course = (Course) request.getAttribute("course");
                            String avg = (String) request.getAttribute("avg");
                            String min =(String) request.getAttribute("min");
                            String max = (String) request.getAttribute("max");
                            String median = (String) request.getAttribute("median");
                        %><h3>
                     <%=course.getName()%>
                    </h3></div>
                    <div class="course-information">
                        <div>
                            AVG
                            <span><%=avg%></span>
                        </div>
                        <div >
                            MED
                            <span><%=median%></span>
                        </div>
                        <div >
                            MAX
                            <span><%=max%></span>
                        </div>
                        <div >
                            MIN
                            <span><%=min%></span>
                        </div>

                    </div>
                    </div>
    </div>

</div>
</div>



</body>
</html>
<style scoped>
    <%@include file="../../style/coursestyle.css"%>

</style>
