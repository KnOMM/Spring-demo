package com.example.springdemo.service;

import com.example.springdemo.model.Taxi;
import com.example.springdemo.repositoery.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiCaller {

    private final TaxiRepository taxiRepository;

    public TaxiCaller(TaxiRepository taxiRepository) {
        this.taxiRepository = taxiRepository;
    }

    public void call(String person) {
        Taxi car = taxiRepository.getFreeTaxi();
        System.out.println("Call taxi for " + person);
        System.out.println("Car: " + car);
    }
}
