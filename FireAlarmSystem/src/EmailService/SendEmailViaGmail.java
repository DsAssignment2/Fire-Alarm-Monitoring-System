/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailService;

import javax.mail.Message;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author DELL
 */
public class SendEmailViaGmail {
    public static void main(String[] args) {

		final String username="dsassignment2dreamteam2020@gmail.com";
		final String password="ds2020@#";
		
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.post", "465");
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.socketFactory.port", "465");
		prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		
		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
			
		});
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sawandiudeshitha1997@gmail.com"));
			message.setSubject("Fire Alarm Sensor Alert");
			message.setText("Dear User, \n\n Alert: CO2 level or Smoke level is moves to a value greater than 5");
			
			Transport.send(message);
			System.out.println("Email send successfully");
			
		}catch(MessagingException e) {
			e.printStackTrace();
		
		}
	}
}
