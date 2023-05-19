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
        <div class="wrapper">
            <div class="left">
                <img src="../../assets/student.svg" width="150">
                <h4>${student.getName()}</h4>
            </div>
            <div class="right">
                <div class="info">
                    <h3>Information</h3>
                    <div class="info_data">
                        <div class="data">
                            <h4>Email</h4>
                            <p>${student.getEmail()}</p>
                        </div>
                        <div class="data">
                            <h4>Major</h4>
                            <p>${student.getMajor()}</p>
                        </div>
                    </div>
                </div>

                <div class="courses" id="style-2">
                    <h3 style="margin-bottom: 40px">Courses</h3>
                    <div class="projects_data">
                        <%
                            Student student = (Student) request.getAttribute("student");
                            for (Course course:student.getCourses()
                            ) {%>
                        <div class="data">
        <div class="course-name" >
        <form method="POST" action="/course">
            <input name="courseId" value="<%=course.getId()%>" hidden>
            <button type="submit" style="color: #353c4e;
            margin-bottom: -5px;
            font-weight: bold;
            border: none;
            font-size: 16px;
            background: none;
            cursor: pointer;
">   <%=course.getName()%></button>
        </form>
        </div>
                            <p>
                                <%=course.getMark()%>
                            </p>
                        </div>
                        <%  } %>
                </div>
            </div>
        </div>
    </div>
</div>
    </div>
</body>
</html>
<style scoped>
    <%@include file="../../style/welcomestyle.css"%>

</style>
