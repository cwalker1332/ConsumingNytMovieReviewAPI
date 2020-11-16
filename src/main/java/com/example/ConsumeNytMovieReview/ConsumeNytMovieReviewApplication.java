package com.example.ConsumeNytMovieReview;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeNytMovieReviewApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeNytMovieReviewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeNytMovieReviewApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			MovieReview review = restTemplate.getForObject(
					"https://api.nytimes.com/svc/movies/v2/reviews/search.json?query=godfather&api-key=6GEBOu5fhWXKfRs7Qf4VZnh07mBrjRuB", MovieReview.class);
			log.info(review.toString());
		};
	}
}
