package org.zerock.guestbook.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.guestbook.dto.GuestbookDTO;

import static org.junit.jupiter.api.Assertions.*;

class GuestbookServiceTest {

    @Autowired
    private GuestbookService guestbookService;

    @Test
    void testRegister() {

    }

    @Test
    void testRead() {
        GuestbookDTO dto =  guestbookService.read(1L);
        System.out.println(dto);
    }

    @Test
    void testModify() {
        GuestbookDTO dto = GuestbookDTO.builder()
                .gno(1L)
                .title("update")
                .content("update")
                .build();
        guestbookService.modify(dto);
    }
}