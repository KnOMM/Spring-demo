package com.example.springdemo.component;

import com.example.springdemo.service.TaxiCaller;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Person {

    private TaxiCaller taxiCaller;

    @Value("${user.properties.person.name}")
    private String name;
    @Value("${user.properties.person.phone}")
    private String phone;

    @Autowired
    public Person(TaxiCaller taxiCaller) {
        this.taxiCaller = taxiCaller;
    }

    public void goTaxi() {
        taxiCaller.call(name);
    }
}
