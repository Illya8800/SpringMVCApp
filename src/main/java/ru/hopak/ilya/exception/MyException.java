package ru.hopak.ilya.exception;

public class MyException extends IllegalAccessError {

    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }
}
