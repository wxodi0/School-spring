package org.zerock.guestbook.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")
@Slf4j
public class TestController {

    //    localhost:9090/test/{name}
    @GetMapping("/{name}")
    public void test(
            @PathVariable("name") String name) {

    }

}
