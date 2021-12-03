package springmvc.email;
import org.springframework.beans.factory.annotation.Autowired;
import springmvc.model.User;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;



public class ConfirmMail {
    @Autowired
    User user;

    public static void sendMail(User user) throws MessagingException {

        System.out.println("Initializing");

        Properties properties = new Properties();

        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

        String myEmail = "aealthawarenessservice@gmail.com";
        String password = "healthawareness";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail,password);
            }
        });

        Message message = prepareMessage(session,myEmail,user);

        Transport.send(message);
        System.out.println("Message sent successfully");
    }

    private static Message prepareMessage(Session session, String myEmail,User user) {

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
            message.setSubject("Welcome to Health Awareness Application. Confirm your email address");
            String htmlcode = "<h2> Hello, " + user.getUsername() +
                            "<h4> Please click on the below link to confirm your email address\n" +
                            "<p><a href=\"https://03ff-96-20-228-247.ngrok.io/HealthApplication_ICDE/confirm\">Confirm my email address</a></p>";
            message.setContent(htmlcode, "text/html");
            return message;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;

    }


}