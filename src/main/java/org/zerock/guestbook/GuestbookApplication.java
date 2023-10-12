package org.zerock.guestbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.zerock.guestbook.sample.School;
import org.zerock.guestbook.sample.Restaurant;

import java.util.Arrays;

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
		log.info("school : {}", school);

		Restaurant restaurant = applicationContext.getBean("restaurant" , Restaurant.class);
		log.info("restaurant : {}", restaurant);
	}
}
