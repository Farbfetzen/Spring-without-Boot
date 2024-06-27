package farbfetzen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import farbfetzen.config.AppConfiguration;
import farbfetzen.service.CourseService;

public class Application {

    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        final var courseService = context.getBean("courseService", CourseService.class);
        System.out.println(courseService.list());
    }
}
