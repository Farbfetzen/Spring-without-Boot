package farbfetzen.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import farbfetzen.model.Course;
import farbfetzen.repository.CourseRepository;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

    private final static Course testCourse = new Course(1, "Test", "A description.", "http://example.org/");

    @Mock
    private CourseRepository courseRepository;

    @InjectMocks
    private CourseService courseService;

    @Test
    void list() {
        when(courseRepository.findAll()).thenReturn(List.of(testCourse));
        assertThat(courseService.list()).containsExactly(testCourse);
    }
}