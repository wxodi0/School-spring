package org.zerock.guestbook.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class GuestbookDTO {
    private Long gno;

    public void setGno(Long gno) {
        this.gno = gno;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }

    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate, modDate;
}
