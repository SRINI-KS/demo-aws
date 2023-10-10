package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @GetMapping
    public  Object hello(){
        Map<String,String> object =new HashMap<>();
        object.put("name","srini");
        object.put("email","sriniks887@gmail.com");
        return object;
    }
}
