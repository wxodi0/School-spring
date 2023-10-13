package org.zerock.guestbook.sample.service;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.sample.Restaurant;

@Service
@ToString
public class HotelServiceImpl implements HotelService {

    private Restaurant restaurant;

    public HotelServiceImpl(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Autowired
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }


    @Override
    public void print() {
        System.out.println("hotelServiceImpl");
    }
}


