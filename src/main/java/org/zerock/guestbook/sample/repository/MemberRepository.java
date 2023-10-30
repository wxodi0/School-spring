package org.zerock.guestbook.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.guestbook.sample.dto.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
