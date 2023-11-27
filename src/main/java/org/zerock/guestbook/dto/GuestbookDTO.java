package org.zerock.guestbook.dto;

import java.time.LocalDateTime;

public class GuestbookDTO {
    private Long gno;

    public Long getGno() {
        return gno;
    }

    public void setGno(Long gno) {
        this.gno = gno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public LocalDateTime getModDate() {
        return modDate;
    }

    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }

    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate, modDate;
}
