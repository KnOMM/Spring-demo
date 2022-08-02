package com.example.springdemo.repositoery;

import com.example.springdemo.model.Taxi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

@Repository
public class TaxiRepository {

    final
    List<Taxi> taxiList;

    public TaxiRepository(List<Taxi> taxiList) {
        this.taxiList = taxiList;
    }

    public Taxi getFreeTaxi(){
        DayOfWeek dayOfWeekNow = LocalDate.now().getDayOfWeek();
        Taxi taxi = taxiList.stream()
                .filter(t -> !t.getRestDay().equals(dayOfWeekNow))
                .findFirst()
                .orElse(null);
        return taxi;
    }
}
