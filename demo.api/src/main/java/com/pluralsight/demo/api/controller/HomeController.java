package com.pluralsight.demo.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(@RequestParam(defaultValue = "Craig") String name){
        return "Hello " + name;
    }
}
