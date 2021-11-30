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
//            URI dbUri = new URI(System.getenv("DATABASE_URL"));
//
//            String username = dbUri.getUserInfo().split(":")[0];
//            String password = dbUri.getUserInfo().split(":")[1];
//            String dbUrl = "jdbc:mysql//" + dbUri.getHost() + dbUri.getPath();
//            BasicDataSource basicDataSource = new BasicDataSource();

          DriverManagerDataSource dataSource = new DriverManagerDataSource();
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("jdbc:mysql://localhost:3306/demohealthapp");
//            dataSource.setUsername("root");
//            dataSource.setPassword("Sure100%result");
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true");
            dataSource.setUsername("b74c61c259b732");
            dataSource.setPassword("587dfa2f");
            return dataSource;
        }

    }
//
//    mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true
//            CLEARDB_DATABASE_URL