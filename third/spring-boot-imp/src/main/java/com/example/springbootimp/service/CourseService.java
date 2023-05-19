package com.example.springbootimp.service;

import com.example.springbootimp.LoginDao.CourseDao;
import com.example.springbootimp.models.Course;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CourseService {

    private CourseDao courseDao;

    {
        try {
            courseDao = new CourseDao();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Course getCourse(int courseId) throws SQLException {
        ResultSet resultSet = courseDao.getCourseData(courseId);
        resultSet.next();
        return new Course(resultSet.getInt(1),resultSet.getString(2),null);
    }

    public double getAvg(int courseId) throws SQLException {
        ResultSet resultSet = courseDao.getData(courseId);
        double sum=0,avg,size=0;
        while(resultSet.next()){
            sum+=resultSet.getInt(1);
            size++;
        }
        avg = sum/size;
        return avg;
    }
    public double getMin(int courseId) throws SQLException {
        ResultSet resultSet = courseDao.getData(courseId);
        double min=1000000000;
        while(resultSet.next()){
            min=Math.min(min,resultSet.getInt(1));

        }
        return min;
    }
    public double getMax(int courseId) throws SQLException {
        ResultSet resultSet = courseDao.getData(courseId);
        double max = 0;
        while(resultSet.next()){
            max=Math.max(max,resultSet.getInt(1));

        }
        return max;
    }

    public double getMedian(int courseId) throws SQLException {
        ResultSet resultSet = courseDao.getData(courseId);
        double sum=0,median;
        int size=0;
        ArrayList<Double> numbers = new ArrayList<>();
        while(resultSet.next()){
            sum+=resultSet.getInt(1);
            size++;
            numbers.add(resultSet.getDouble(1));
        }
        Collections.sort(numbers);

        if (size % 2 == 0)
            median = (numbers.get(size/2)  + numbers.get(size/2 - 1))/2;
        else
            median =  numbers.get(size/2);

        return median;


    }

}
