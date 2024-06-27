package farbfetzen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import farbfetzen.service.CourseService;

@Configuration
public class AppConfiguration {

    @Bean
    public CourseService courseService() {
        return new CourseService();
    }
}
