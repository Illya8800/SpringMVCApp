package ru.hopak.ilya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.hopak.ilya.exception.MyException;

@Controller
public class SecondController {

    @GetMapping("/too")
    public String too(){

        throw new MyException();
//        return "/first/hello_world";
    }
}
