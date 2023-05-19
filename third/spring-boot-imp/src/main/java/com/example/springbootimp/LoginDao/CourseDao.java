package com.example.springbootimp.LoginDao;

import java.sql.*;

public class CourseDao {
    String url ="jdbc:mysql://localhost:3306/university";
    String uName = "root";
    String uPassword = "admin";
    Connection connection;
    Statement statement ;

    public CourseDao () throws SQLException {

        connection = DriverManager.getConnection(url,uName,uPassword);
        statement = connection.createStatement();
    }


    public ResultSet getData(int courseId) throws SQLException {
        String marksQuery = "select studentcourserelation.Mark from studentcourserelation where Course_ID=" + courseId + ";";
        ResultSet resultSet = statement.executeQuery(marksQuery);
        return resultSet;
    }
    public ResultSet getCourseData(int courseId) throws SQLException {
        String query = "select * from course where Course_ID=\""+courseId+"\";";
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }
}
