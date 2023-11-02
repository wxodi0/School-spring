package org.zerock.guestbook.sample.controller;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.zerock.guestbook.sample.dto.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController // @Controller + @ResponseBody
@RequestMapping("/member")
@Slf4j
public class MemberController {

    private Map<String, Member> userMap;

    @PostConstruct
    public void init(){
        userMap = new HashMap<>();
        userMap.put("1", new Member("1", "홍길동1"));
        userMap.put("2", new Member("2", "홍길동2"));
        userMap.put("3", new Member("3", "홍길동3"));
        userMap.put("4", new Member("4", "홍길동4"));
    }
    // GET : ?key=value
    // POST : /member
    // {
    //      "id":"5",
    //      "name":"홍길동5"
    // }
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping("")
    public void register(@RequestBody Member member){
        userMap.put(member.getId(), member);
    }

    // GET /member/1
    @GetMapping("/{id}")
    public Member get(@PathVariable("id") String id){
        return userMap.get(id);
    }

    @GetMapping("/all")
    public List<Member> getAll(){
//        Map<key,value> -> List
        return userMap.values().stream().collect(Collectors.toList());
    }


}
