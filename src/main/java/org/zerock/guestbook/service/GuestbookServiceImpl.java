package org.zerock.guestbook.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
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
    public GuestbookDTO read(Long gno) {
        Optional<GuestbookEntity> result = guestbookRepository.findById(gno);

//        result.isPresent()
//                ? entityToDTO(result.get())
//                : null;

        return null;
    }

    @Transactional
    @Override
    public void modify(GuestbookDTO dto) {
        Optional<GuestbookEntity> result = guestbookRepository.findById(dto.getGno());

        if(result.isPresent()) {
            GuestbookEntity guestbookEntity = result.get();
            guestbookEntity.changeTitle(dto.getTitle());
            guestbookEntity.changeContent(dto.getContent());
            guestbookRepository.save(guestbookEntity);
        }
    }
    @Override
    public void remove(Long gno) {
        guestbookRepository.deleteById(gno);
    }
}
