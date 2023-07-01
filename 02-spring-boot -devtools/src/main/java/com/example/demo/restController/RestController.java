package com.example.demo.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${Coach.name}")
    private String CoachName;
    @Value("${Team.name}")
    private String TeamName;
    @Value("${Coach.place}")
    private String CoachPlace;

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello";
    }
    @GetMapping("/AppValues")
    public String DisplayAppValues(){
        return CoachName+" "+TeamName+" "+CoachPlace;
    }

}
