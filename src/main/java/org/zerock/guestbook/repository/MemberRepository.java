package org.zerock.guestbook.repository;

import org.zerock.guestbook.dto.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(int id);

    Optional<Object> findByName(String name);

    List<Member> findAll();
}
