package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.entity.GuestbookEntity;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    Long read(Long gno);

    default GuestbookEntity dtoToEntity(GuestbookDTO dto){ //default기능까지 구현
        return GuestbookEntity.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .writer(dto.getWriter())
                .content(dto.getContent())
                .build();
    }
}
