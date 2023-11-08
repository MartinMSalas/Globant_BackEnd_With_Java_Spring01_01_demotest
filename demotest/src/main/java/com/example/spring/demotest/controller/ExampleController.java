package com.example.spring.demotest.controller;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExampleController {
    @GetMapping("/")
    public ResponseEntity<String> home() {

        return new ResponseEntity<>("Vamos Equipo 22", HttpStatus.OK);
    }

}