package org.zerock.guestbook.sample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zerock.guestbook.sample.dto.Member;
import org.zerock.guestbook.sample.service.MemberService;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping
public class MemberController {
    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/member")
    public String joinMember(Member member) throws Exception {

        return null;
    }

    @GetMapping("/member/{id}")
    public Optional<Member> member(@PathVariable int id) {
        return memberService.findMember(id);
    }

    @GetMapping("/member/all")
    public List<Member> memberList() {
        return memberService.findMembers();
    }
}
