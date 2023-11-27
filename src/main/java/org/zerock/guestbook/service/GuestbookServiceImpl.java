package org.zerock.guestbook.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.entity.GuestbookEntity;
import org.zerock.guestbook.repository.GuestbookRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GuestbookServiceImpl implements GuestbookService {

    private final GuestbookRepository guestbookRepository;

    @Override
    public Long register(GuestbookDTO dto) {
        GuestbookEntity guestbookEntity = dtoToEntity(dto);
        guestbookRepository.save(guestbookEntity);
        return guestbookEntity.getGno();
    }

    @Override
    public Long read(Long gno) {
        Optional<GuestbookEntity> result = guestbookRepository.findById(gno);
        return null;
    }
}
