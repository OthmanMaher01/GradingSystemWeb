package com.example.springbootimp.controller;

import com.example.springbootimp.models.Course;
import com.example.springbootimp.models.Student;
import com.example.springbootimp.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
@Slf4j
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public void get (HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/course.jsp").forward(
                httpServletRequest, httpServletResponse);

    }

    @PostMapping
    public void getCourse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String id = httpServletRequest.getParameter("courseId");

        try {
            Course course = courseService.getCourse(Integer.parseInt(id));
            String avg = String.valueOf(courseService.getAvg(course.getId()));
            String min = String.valueOf(courseService.getMin(course.getId()));
            String max = String.valueOf(courseService.getMax(course.getId()));
            String median = String.valueOf(courseService.getMedian(course.getId()));
            httpServletRequest.setAttribute("course", course);
            httpServletRequest.setAttribute("avg", avg);
            httpServletRequest.setAttribute("max", max);
            httpServletRequest.setAttribute("min", min);
            httpServletRequest.setAttribute("median", median);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        httpServletRequest.getRequestDispatcher("/WEB-INF/views/course.jsp").forward(
                httpServletRequest, httpServletResponse);

    }


}
