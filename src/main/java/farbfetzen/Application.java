package farbfetzen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import farbfetzen.model.Course;
import farbfetzen.service.CourseService;

@ComponentScan
@Slf4j
public class Application {

    private final CourseService courseService;

    public Application(final CourseService courseService) {
        this.courseService = courseService;
    }

    public static void main(final String[] args) {
        new AnnotationConfigApplicationContext(Application.class);
    }

    @EventListener(ContextRefreshedEvent.class)
    public void startupListener() {
        courseService.recreateTable();
        final int courseId = courseService.create(new Course(
                null,
                "How to create your first Spring Application (without Spring Boot)",
                "In this tutorial, you will learn how to create your first Spring Application from scratch without using Spring Boot.",
                "https://www.youtube.com/watch?v=e8aSyQo0nHo"
        ));
        logger.info("Inserted course with id '{}'.", courseId);
        logger.info("All courses: {}", courseService.list());
    }
}
