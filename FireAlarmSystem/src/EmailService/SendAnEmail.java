/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailService;


import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author DELL
 */
public class SendAnEmail {
 
    /*** to send an email to desktop client when the co2 Level or smoke Level values goes up ***/
     public void sendSensorAlert(String Emailsbjct, String mailReciever, String hardcodemsg) {
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    final String emailAddress = new EmailBody().recieveEmailInfo().username;
                    final String emailPassword = new EmailBody().recieveEmailInfo().password;

                    Properties properties = new Properties();
                    properties.put("mail.smtp.auth", "true");
                    properties.put("mail.smtp.starttls.enable", "true");
                    properties.put("mail.smtp.host", "smtp.gmail.com");
                    properties.put("mail.smtp.port", "587");

                    Session session = Session.getDefaultInstance(properties,
                            new Authenticator() {
                                protected PasswordAuthentication getPasswordAuthentication() {
                                   // return new PasswordAuthentication(
                                           // new EmailBody().recieveEmailInfo().username, new EmailBody().recieveEmailInfo().password);
                                           
                                           //////////////////////////////////////
                                  /*String un=new EmailBody().recieveEmailInfo().username;
                                  String pw=new EmailBody().recieveEmailInfo().password;
                                  PasswordAuthentication passwordAuthentication= new PasswordAuthentication(un,pw);
                                  return passwordAuthentication;*/
                                  ////////////////////////////////////////
                                  PasswordAuthentication passwordAuthentication= new PasswordAuthentication(emailAddress,emailPassword);
                                  return passwordAuthentication;
                                }
                            });
                    Message msg = new MimeMessage(session);
                    msg.setFrom(new InternetAddress(emailAddress));
                    //msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailReciever));
                    msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sawandiudeshitha1997@gmail.com"));
                    
                    msg.setSubject(Emailsbjct);
                    msg.setContent(hardcodemsg, "text/html;charset=utf-8");

                    Transport.send(msg);

                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        }).start();
    }
}
