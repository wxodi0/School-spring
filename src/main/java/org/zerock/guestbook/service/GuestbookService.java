package org.zerock.guestbook.service;

import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.entity.GuestbookEntity;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    GuestbookDTO read(Long gno);
    void modify(GuestbookDTO dto);
    void remove(Long gno);

    default GuestbookEntity dtoToEntity(GuestbookDTO dto){ //default기능까지 구현
        return GuestbookEntity.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .writer(dto.getWriter())
                .content(dto.getContent())
                .build();
    }

    default GuestbookDTO entityToDTO(GuestbookDTO dto) {
        return GuestbookDTO.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .regDate(dto.getRegDate())
                .modDate(dto.getModDate())
                .build();
    }
}
