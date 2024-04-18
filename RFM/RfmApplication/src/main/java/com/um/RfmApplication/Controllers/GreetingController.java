package com.um.RfmApplication.Controllers;

import com.um.RfmApplication.Model.GreetingModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/greeting")
    public GreetingModel greetingModel(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingModel(1, "Hello, " + name + "!");
    }
}