package farbfetzen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import farbfetzen.model.Course;
import farbfetzen.repository.CourseRepository;

@Service
public class CourseService implements CrudService<Course, Integer> {

    private final CourseRepository courseRepository;

    public CourseService(final CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> list() {
        return courseRepository.findAll();
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
