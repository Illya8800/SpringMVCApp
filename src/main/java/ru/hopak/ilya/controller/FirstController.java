package ru.hopak.ilya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @GetMapping("/hello-world")
    public ModelAndView met() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("isTrue", new Integer(5));
        return new ModelAndView("/first/hello_world");
    }


    @GetMapping("/buy")
    public String set() throws Exception {
        System.out.println("i`m here");
        return "second/exception";
    }


/*
    @ExceptionHandler(Exception.class)
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 1. Печать консоли
        // 2. Записать журнал
        // 4. Показать пользователю удобный интерфейс
        System.out.println(request.getRequestURI());
        System.out.println(handler.getClass());
        ModelAndView modelandView = new ModelAndView("second/lowexception");
        return modelandView;

    }*/
}
