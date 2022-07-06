package ru.hopak.ilya.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@ControllerAdvice
public class LowGlobal {

//    @ExceptionHandler(Exception.class)
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 1. Печать консоли
        // 2. Записать журнал
        // 4. Показать пользователю удобный интерфейс
        System.out.println(request.getRequestURI());
        System.out.println(handler.getClass());
        ModelAndView modelandView = new ModelAndView("second/exception");

        return modelandView;

    }
}
