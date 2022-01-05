package ru.hopak.ilya.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fir")
public class Calculator {

    @GetMapping("/calc")
    public String equal(@RequestParam(value = "a",required = false) int a,
                        @RequestParam(value = "b", required = false) int b,
                        @RequestParam(value = "action", required = false) String action,
                        Model model){

        int sum = 0;

        switch (action){
            case ("add") : {
                sum = a + b;
                break;
            }
            case ("min") : {
                sum = a - b;
                break;
            }
            case ("mul") : {
                sum = a * b;
                break;
            }
            case ("div") : {
                sum = a / b;
                break;
            }
            default:
                sum = 0;
        }

        model.addAttribute("summa", sum);

        return "calculator/calculator";
    }

}
