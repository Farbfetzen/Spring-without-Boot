package farbfetzen.dao;

import java.util.List;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import farbfetzen.model.Course;

@Component
public class CourseDao {

    private final JdbcClient jdbcClient;

    public CourseDao(final JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public void createTable() {
        jdbcClient.sql("""
                CREATE TABLE course (
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    title VARCHAR(100) NOT NULL,
                    description VARCHAR(500),
                    url VARCHAR(500)
                )""").update();
    }

    public void deleteTable() {
        jdbcClient.sql("DROP TABLE IF EXISTS course").update();
    }

    public int save(final Course course) {
        final var generatedKeyHolder = new GeneratedKeyHolder();
        jdbcClient
                .sql("INSERT INTO course (title, description, url) VALUES (:title, :description, :url)")
                .param("title", course.title())
                .param("description", course.description())
                .param("url", course.url())
                .update(generatedKeyHolder);
        return generatedKeyHolder.getKey().intValue();
    }

    public List<Course> findAll() {
        return jdbcClient.sql("SELECT * FROM course").query(Course.class).list();
    }
}
