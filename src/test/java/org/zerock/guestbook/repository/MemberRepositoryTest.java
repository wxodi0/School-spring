package org.zerock.guestbook.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.guestbook.sample.dto.Member;
import org.zerock.guestbook.sample.repository.MemberRepository;
import org.zerock.guestbook.sample.service.MemberService;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;
    @Test
    void join() {
        Member member = new Member();
        member.setName("TaeYang");

        Long saveId = memberService.join(member);
    }
}
