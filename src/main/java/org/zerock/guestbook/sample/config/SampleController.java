package org.zerock.guestbook.sample.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RestController
@Slf4j
public class SampleController {
    @GetMapping("")
    public void ex01() {
        log.info(".................ex01");
    }

    @GetMapping("/ex02")
    public void ex02() {
        log.info("..........02");
    }

    @GetMapping("/hotels/?")
    public void ex03() {
        log.info("..........03");
    }

}
