package org.zerock.guestbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.zerock.guestbook.sample.School;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@Slf4j
public class GuestbookApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(GuestbookApplication.class, args);
		String[] beanNames = applicationContext.getBeanDefinitionNames();

		Arrays.stream(beanNames)
				.forEach(e -> {
					log.info("Bean Name : {}" , e);
				});
		School school = new School();
		applicationContext.getBean("school",School.class);
		log.info("school : {}",school);
	}
}
