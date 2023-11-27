package org.zerock.guestbook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {
        AuditingEntityListener.class
})
abstract class BaseEntity {
    @CreatedDate
    @Column(name = "reg_date", updatable = false)
    private LocalDateTime regDate;
    @LastModifiedDate
    @Column(name = "mod_date")
    private LocalDateTime modDate;
}
