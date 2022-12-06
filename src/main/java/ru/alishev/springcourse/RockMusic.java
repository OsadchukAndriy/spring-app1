package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "LinkinPark";
    }
}
