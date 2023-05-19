package com.example.springbootimp.controller;

import com.example.springbootimp.models.Student;
import com.example.springbootimp.service.LoginService;
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
@RequestMapping("/login.do")
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final LoginService service;

    @GetMapping
    public void get(HttpServletRequest request,
                    HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                request, response);

    }

    @PostMapping
    public void login(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean isValidUser = false;
        try {
            isValidUser = service.validateUser(name, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (isValidUser) {
            Student student;
            try {
                student = service.getStudent(name);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            request.setAttribute("student", student);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(
                    request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Credentials!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(
                    request, response);
        }
    }


}
