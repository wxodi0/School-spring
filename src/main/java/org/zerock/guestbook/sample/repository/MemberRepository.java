package org.zerock.guestbook.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.guestbook.sample.dto.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(int id);

    Optional<Object> findByName(String name);

    List<Member> findAll();
}
