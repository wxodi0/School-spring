package org.zerock.guestbook.sample.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.guestbook.sample.repository.MemberRepository;
import org.zerock.guestbook.sample.dto.Member;

import java.util.List;
import java.util.Optional;

@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Optional<Member> findMember(int id) {
        return memberRepository.findById(id);
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}
