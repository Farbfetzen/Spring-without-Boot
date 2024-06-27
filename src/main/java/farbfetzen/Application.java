package farbfetzen;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import farbfetzen.service.CourseService;

@ComponentScan("farbfetzen")
public class Application {

    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(Application.class);
        final var courseService = context.getBean("courseService", CourseService.class);
        System.out.println(courseService.list());
    }
}
