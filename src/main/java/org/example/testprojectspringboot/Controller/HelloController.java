package org.example.testprojectspringboot.Controller;

import org.example.testprojectspringboot.Model.Student;
import org.springframework.web.bind.annotation.*;

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
    public String printValue(@RequestBody Student value) {
        return "Hello " + value.firstName() + " " + value.lastName() ;
    }

    @GetMapping("/{name}")
    public String greeting(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
