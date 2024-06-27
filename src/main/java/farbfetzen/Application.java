package farbfetzen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import farbfetzen.service.CourseService;

@ComponentScan
@Slf4j
public class Application {

    public static void main(final String[] args) {
        final var context = new AnnotationConfigApplicationContext(Application.class);
        final var courseService = context.getBean("courseService", CourseService.class);
        logger.info("Courses: {}", courseService.list());
    }
}
