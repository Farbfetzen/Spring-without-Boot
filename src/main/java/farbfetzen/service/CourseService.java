package farbfetzen.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import farbfetzen.model.Course;

public class CourseService implements CrudService<Course, Integer> {

    private final List<Course> courses;

    public CourseService() {
        courses = new ArrayList<>();
        final var course = new Course(
                1,
                "How to create your first Spring Application (without Spring Boot)",
                "In this tutorial, you will learn how to create your first Spring Application from scratch without using Spring Boot.",
                "https://www.youtube.com/watch?v=e8aSyQo0nHo"
        );
        courses.add(course);
    }

    @Override
    public List<Course> list() {
        return courses;
    }

    @Override
    public Course create(final Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(final Integer id) {
        return Optional.empty();
    }

    @Override
    public void update(final Course course, final Integer id) {

    }

    @Override
    public void delete(final Integer id) {

    }
}
