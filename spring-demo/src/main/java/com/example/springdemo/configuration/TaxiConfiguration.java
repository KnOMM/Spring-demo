package com.example.springdemo.configuration;

import com.example.springdemo.model.Taxi;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TaxiConfiguration {

    @Bean
    public List<Taxi> taxiList() {
        Taxi t1 = new Taxi("Lanos","1234","Oleh", DayOfWeek.TUESDAY);
        Taxi t2 = new Taxi("Nisan","1561","Ivan", DayOfWeek.TUESDAY);
        Taxi t3 = new Taxi("Mazda","1111","Sona", DayOfWeek.TUESDAY);
        Taxi t4 = new Taxi("Toyota","9865","Sasha", DayOfWeek.WEDNESDAY);
        Taxi t5 = new Taxi("Skoda","2576","Nikita", DayOfWeek.THURSDAY);
        Taxi t6 = new Taxi("Honda","4682","Vova", DayOfWeek.FRIDAY);
        Taxi t7 = new Taxi("Suzuki","1972","Tolya", DayOfWeek.SATURDAY);
        Taxi t8 = new Taxi("Lanos","6755","Nazar", DayOfWeek.SUNDAY);
        return Lists.newArrayList(t1,t2,t3,t4,t5,t6,t7,t8);
    }
}
