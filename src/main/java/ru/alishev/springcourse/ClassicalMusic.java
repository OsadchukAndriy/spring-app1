package ru.alishev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music {



    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");

    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");

    }

    @Override
    public String getSong() {
        return "Mazart";
    }
}
