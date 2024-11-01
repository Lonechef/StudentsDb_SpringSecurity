//package com.saumya.SpringSecur.controller;
//
//import com.saumya.SpringSecur.model.Student;
//import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//public class StudentController {
//    List<Student> students = new ArrayList<>(List.of(
//            new Student(1,"Saumya","Java"),
//            new Student(2,"Parikh","WebDev"),
//            new Student(3,"Lonechef","Golang")
//    ));
//    @GetMapping("token")
//    public CsrfToken getCsrfTOken(HttpServletRequest request){
//        //So basically we have a class called has CsrfToken inbuuilt and we can get our CsrfToken from HTTPServletRequest in that basically we need to pass it as attribute
//        //The format should be similar also this request passes an object so we need to do Typecasting in it so for that again converting basck to CsrfTokeb
//        return (CsrfToken) request.getAttribute("_csrf");
//    }
//    @GetMapping("students")
//    public List<Student> getStudents(){
//        return students;
//    }
//    @PostMapping("students")
//    public Student addStudent(@RequestBody Student student){
//        students.add(student);
//        return student;
//    }
//
//
//}
