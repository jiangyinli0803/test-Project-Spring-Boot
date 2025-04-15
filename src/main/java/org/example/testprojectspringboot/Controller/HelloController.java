package org.example.testprojectspringboot.Controller;

import org.example.testprojectspringboot.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hallo Welt!";
    }


    @GetMapping("/second")
    public String sayHello2() {
        return "Hello World";
    }

    @PostMapping
    public String printValue(Student value) {
        return "Hello " + value.firstName() + " " + value.lastName() ;
    }

}
