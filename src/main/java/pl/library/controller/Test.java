package pl.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {


        @GetMapping("/hello")
        public String helloPage(){
            return "Hello";
        }

        @GetMapping("/test")
        public String testPage(){
            return "To jest testowa strona " + Test.class.getCanonicalName();
        }
    }

