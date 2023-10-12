package org.zerock.guestbook.sample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HotelServiceTest{
    @Autowired
    private HotelService hotelService;

    @Test
    void test () {
        System.out.println("1=================");
        System.out.println(hotelService);
        System.out.println("2=================");
    }
}
