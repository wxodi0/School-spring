package org.zerock.guestbook.sample.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.guestbook.sample.Restaurant;
import org.zerock.guestbook.sample.School;

@Service
@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService  {

    private final Restaurant restaurant;
    private final School school;

    public HotelServiceImpl(Restaurant restaurant, School school) {
        this.restaurant = restaurant;
        this.school = school;
    }

    @Override
    public void print() {
        System.out.println("......hotelServiceImpl 1");
    }
}
