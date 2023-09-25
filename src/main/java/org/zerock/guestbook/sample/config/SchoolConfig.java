package org.zerock.guestbook.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zerock.guestbook.sample.School;

@Configuration
public class SchoolConfig {
    @Bean
    public School school(){
        return new School();
    }
}
