package org.zerock.guestbook.sample.service;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.sample.Restaurant;

@Service
@ToString
public class HotelServiceImpl implements HotelService {

    private Restaurant restaurant;

    @Override
    public void print() {
        System.out.println("hotelServiceImpl");
    }
}


