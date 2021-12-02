//package springmvc.config;
//
//import org.springframework.context.MessageSource;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ReloadableResourceBundleMessageSource;
//import org.springframework.context.support.ResourceBundleMessageSource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//class EmailConfiguration {
//    @Bean
//    public JavaMailSender getJavaMailSender()
//    {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(25);
//
//        mailSender.setUsername("krithikaananthu@gmail.com");
//        mailSender.setPassword("Sure100@result");
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.debug", "true");
//
//        return mailSender;
//    }
//
//    @Bean
//    public SimpleMailMessage emailTemplate()
//    {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setTo("krithikaananthu@gmail.com");
//        message.setFrom("krithikaananthu@gmail.com");
//        message.setText("Information Regarding your searched Symptom !!");
//        return message;
//    }
//
////    @Bean
////    public MessageSource messageSource() {
////        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
////        messageSource.setBasename("/WEB-INF/messages");
////        return messageSource;
////    }
//
//    @Bean(name="messageSource")
//    public ResourceBundleMessageSource bundleMessageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename("messages");
//        return messageSource;
//    }
//    }
////
////    mysql://b74c61c259b732:587dfa2f@us-cdbr-east-04.cleardb.com/heroku_c7ffd05b6ea39f1?reconnect=true
////            CLEARDB_DATABASE_URL