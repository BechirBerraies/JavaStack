package com.example.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class HelloController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello world";
    }

    @RequestMapping("/daikichi/travel/{place}")
    public String showLesson( @PathVariable("place") String place) {
        return "Congratulation  you will travel  to " + place;
    }


    @RequestMapping("/daikichi/{lotto}/{number}")
    public String requestMethodName(@PathVariable("lotto") String lotto, @PathVariable("number") int number) {

        if(number%2==0){
            return "ra" ;
        }
        return "re";
    }
    

    

}