package farbfetzen;

import farbfetzen.service.CourseService;

public class Application {

    public static void main(String[] args) {
        final var courseService = new CourseService();
        System.out.println(courseService.list());
    }
}
