package ru.gb.springbootlesson8;

import org.slf4j.event.Level;
import org.springframework.stereotype.Component;

@Component
//@Timer(level = Level.WARN)     // измеряем время выполнения всех методов класса
public class Volvo {
    public void method1(String args){
        System.out.println("Работа метода 1");
    }

    @Timer(level = Level.WARN)     // измеряем время выполнения метода
    public String method2(String args){
        System.out.println("Работа метода 2");
        return "result";
    }
    @Loggable(level = Level.WARN)
    public void method3(String args){
        System.out.println("Работа метода 3");
        throw new RuntimeException("Ошибка в методе 3");
    }
}
