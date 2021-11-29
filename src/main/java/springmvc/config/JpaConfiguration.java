package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@Configuration("spring.datasource")
class JpaConfiguration {
        @Bean
            public BasicDataSource dataSource() throws URISyntaxException {
            URI dbUri = new URI(System.getenv("CLEARDB_DATABSE_URL"));

            String username = dbUri.getUserInfo().split(":")[0];
            String password = dbUri.getUserInfo().split(":")[1];
            String dbUrl = "jdbc:mysql//" + dbUri.getHost() + dbUri.getPath();

            BasicDataSource basicDataSource = new BasicDataSource();

            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            basicDataSource.setUsername(username);
            basicDataSource.setPassword(password);
            basicDataSource.setUrl(dbUrl);
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("jdbc:mysql://localhost:3306/demohealthapp");
//            dataSource.setUsername("root");
//            dataSource.setPassword("Sure100%result");
////            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("mysql://xmpzahrqg6y14g3w:edv9sww65j47ep4d@yjo6uubt3u5c16az.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/nhrngjhso8gdm6js");
//            dataSource.setUsername("xmpzahrqg6y14g3w");
//            dataSource.setPassword("edv9sww65j47ep4d");
//            dataSource.setPassword();
            return basicDataSource;
        }


    }
//
//    mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true
//            CLEARDB_DATABASE_URL