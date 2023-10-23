package org.zerock.guestbook.sample.service;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
@ToString
public class HotelServiceV2Impl implements HotelService {
    @Override
    public void print() {
        System.out.println("....................... HotelServiceV2Impl");
    }
}
