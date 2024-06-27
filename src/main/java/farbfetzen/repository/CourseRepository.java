package farbfetzen.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import farbfetzen.model.Course;

@Repository
public class CourseRepository implements CrudRepository<Course> {

    @Override
    public List<Course> findAll() {
        final var courses = new ArrayList<Course>();
        courses.add(new Course(
                1,
                "How to create your first Spring Application (without Spring Boot)",
                "In this tutorial, you will learn how to create your first Spring Application from scratch without using Spring Boot.",
                "https://www.youtube.com/watch?v=e8aSyQo0nHo"
        ));
        return courses;
    }
}
