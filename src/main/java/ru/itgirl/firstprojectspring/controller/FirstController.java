package ru.itgirl.firstprojectspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FirstController {
    @GetMapping("/dayOfWeek")
    public String getWeekday(@RequestParam(value = "day", defaultValue = "Такого дня нет") String day) {
        String russianDay = "";
        switch (day) {
            case "Monday":
                russianDay = "Понедельник";
                break;
            case "Tuesday":
                russianDay = "Вторник";
                break;
            case "Wednesday":
                russianDay = "Среда";
                break;
            case "Thursday":
                russianDay = "Четверг";
                break;
            case "Friday":
                russianDay = "Пятница";
                break;
            case "Saturday":
                russianDay = "Суббота";
                break;
            case "Sunday":
                russianDay = "Воскресенье";
                break;
            default:
                russianDay = " ";
                break;
        }
        return russianDay;
    }
}

