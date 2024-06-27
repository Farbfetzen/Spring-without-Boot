package farbfetzen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import farbfetzen.repository.CourseRepository;
import farbfetzen.service.CourseService;

@Configuration
public class AppConfiguration {

    @Bean
    public CourseRepository courseRepository() {
        return new CourseRepository();
    }

    @Bean
    public CourseService courseService(final CourseRepository courseRepository) {
        return new CourseService(courseRepository);
    }
}
