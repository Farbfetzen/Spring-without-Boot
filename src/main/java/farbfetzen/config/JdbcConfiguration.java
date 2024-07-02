package farbfetzen.config;

import javax.sql.DataSource;
import org.h2.jdbcx.JdbcDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.simple.JdbcClient;

@Configuration
@PropertySource("classpath:application.properties")
public class JdbcConfiguration {

    @Bean
    public DataSource dataSource(@Value("${datasource.url}") final String dataSourceUrl) {
        // The H2 database driver creates the database if it does not exist.
        final var dataSource = new JdbcDataSource();
        dataSource.setUrl(dataSourceUrl);
        return dataSource;
    }

    @Bean
    public JdbcClient jdbcClient(final DataSource dataSource) {
        return JdbcClient.create(dataSource);
    }
}
