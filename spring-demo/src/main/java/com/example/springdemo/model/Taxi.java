package com.example.springdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.DayOfWeek;

@Data
@AllArgsConstructor
public class Taxi {
    private String car;
    private String carNumber;
    private String driverName;
    private DayOfWeek restDay;

}
