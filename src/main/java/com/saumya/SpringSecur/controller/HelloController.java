package com.saumya.SpringSecur.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @GetMapping("/hello")
        public String greet(HttpServletRequest request){
            return "Hello this is Saumya Parikh.. " + request.getSession().getId();
        }
        @GetMapping("/about")
            public String about(HttpServletRequest request){
                return "Saumya.." + request.getSession().getId();
            }

}
