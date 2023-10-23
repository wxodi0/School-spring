package org.zerock.guestbook.sample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.guestbook.sample.dto.Member;

import java.util.List;

@RestController
@Slf4j
@RequestMapping
public class MemberController {
    @PostMapping("/member")
    public String joinMember() {
        return null;
    }

    @GetMapping("/member/{id}")
    public Member member() {
        return null;
    }

    @GetMapping("/member/all")
    public List<Member> memberList() {
        return null;
    }
}
