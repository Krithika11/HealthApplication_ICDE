package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration("spring.datasource")
class JpaConfiguration {
        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("jdbc:mysql://localhost:3306/demohealthapp");
//            dataSource.setUsername("root");
//            dataSource.setPassword("Sure100%result");
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("mysql://xmpzahrqg6y14g3w:edv9sww65j47ep4d@yjo6uubt3u5c16az.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/nhrngjhso8gdm6js");
            dataSource.setUsername("xmpzahrqg6y14g3w");
            dataSource.setPassword("edv9sww65j47ep4d");
//            dataSource.setPassword();
            return dataSource;
        }


    }