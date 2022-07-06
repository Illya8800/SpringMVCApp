package ru.hopak.ilya.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        // 1. Печать консоли
        // 2. Записать журнал
        // 4. Показать пользователю удобный интерфейс

        ModelAndView modelandView = new ModelAndView("second/another");

        return modelandView;
    }
}
