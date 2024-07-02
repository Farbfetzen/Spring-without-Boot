package farbfetzen.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import farbfetzen.course.Course;
import farbfetzen.course.CourseService;

@Slf4j
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private final CourseService courseService;

    public StartupListener(final CourseService courseService) {
        this.courseService = courseService;
    }

    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
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
