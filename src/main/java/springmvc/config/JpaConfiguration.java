package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration
class JpaConfiguration {
        @Bean
            public DataSource dataSource() {

          DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true&useSSL=false");
            dataSource.setUsername("b74c61c259b732");
            dataSource.setPassword("587dfa2f");
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("mysql://xmpzahrqg6y14g3w:edv9sww65j47ep4d@yjo6uubt3u5c16az.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/nhrngjhso8gdm6js");
//            dataSource.setUsername("xmpzahrqg6y14g3w");
//            dataSource.setPassword("edv9sww65j47ep4d");
//            dataSource.setPassword();
            return dataSource;
        }

    }
//
//    mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true
//            CLEARDB_DATABASE_URL