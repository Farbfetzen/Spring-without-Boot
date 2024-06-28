package farbfetzen.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import farbfetzen.dao.CourseDao;
import farbfetzen.model.Course;

@Service
public class CourseService{

    private final CourseDao courseDao;

    public CourseService(final CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void recreateTable() {
        courseDao.deleteTable();
        courseDao.createTable();
    }

    public List<Course> list() {
        return courseDao.findAll();
    }

    public int create(final Course course) {
        return courseDao.save(course);
    }

    public Optional<Course> get(final Integer id) {
        return Optional.empty();
    }

    public void update(final Course course, final Integer id) {
    }

    public void delete(final Integer id) {
    }
}
