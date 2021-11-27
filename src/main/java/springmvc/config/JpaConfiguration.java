package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
class JpaConfiguration {
        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
//            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//            dataSource.setUrl("jdbc:mysql://localhost:3306/demohealthapp");
//            dataSource.setUsername("root");
//            dataSource.setPassword("Sure100%result");
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true");
            dataSource.setUsername("b74c61c259b732");
            dataSource.setPassword("587dfa2f");
            return dataSource;
        }


    }