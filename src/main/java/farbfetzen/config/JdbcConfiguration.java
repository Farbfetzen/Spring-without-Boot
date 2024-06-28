package farbfetzen.config;

import javax.sql.DataSource;
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.JdbcClient;

@Configuration
public class JdbcConfiguration {

    @Bean
    public DataSource dataSource() {
        // The H2 database driver creates the database if it does not exist.
        final var dataSource = new JdbcDataSource();
        dataSource.setUrl("jdbc:h2:file:./devDb");
        return dataSource;
    }

    @Bean
    public JdbcClient jdbcClient(final DataSource dataSource) {
        return JdbcClient.create(dataSource);
    }
}
