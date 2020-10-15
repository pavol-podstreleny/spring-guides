package com.podstreleny.pavol.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(new Random().nextInt(),"Hello " + name);
    }



}
