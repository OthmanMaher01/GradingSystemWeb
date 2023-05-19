package servlets.login;

import servlets.models.Course;
import servlets.models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LoginDao {
    String url ="jdbc:mysql://localhost:3306/university";
    String uName = "root";
    String uPassword = "admin";
    Connection connection;
    Statement statement ;
    public LoginDao() throws SQLException {
        connection = DriverManager.getConnection(url,uName,uPassword);
        statement = connection.createStatement();
    }

    public Boolean isExist(String email,String password) throws SQLException {
        String query = "select * from Student";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){

            String dEmail = resultSet.getString(2);
            String dPassword = resultSet.getString(3);

            if (dEmail.equals(email)&&dPassword.equals(password)){
                return true;
            }
        }
        return false;
    }
    public Student getStudent(String email) throws SQLException {
        List<Course> courses = new ArrayList<>();
        String courseQuery = "select course.Course_ID,course.Course_Name,studentcourserelation.Mark from (\n" +
                "(studentcourserelation inner join student on student.Student_ID = studentcourserelation.Student_ID)\n" +
                "inner join course on course.Course_ID=studentcourserelation.Course_ID\n" +
                ") where student.Student_Email=\""+email+"\";";
        ResultSet courseSet = statement.executeQuery(courseQuery);
        while(courseSet.next()) {
            courses.add(new Course(courseSet.getInt(1),courseSet.getString(2),courseSet.getInt(3)));
        }
        String studentQuery = "select Student_ID,Student_Email,Student_Name,Major from student where student.Student_Email=\""+email+"\";";
        ResultSet studentSet = statement.executeQuery(studentQuery);
        studentSet.next();
        return new Student(studentSet.getInt(1),studentSet.getString(2),studentSet.getString(3),studentSet.getString(4),courses);

    }


}
