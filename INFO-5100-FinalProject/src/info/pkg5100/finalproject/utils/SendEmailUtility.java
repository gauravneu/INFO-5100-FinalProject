/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.utils;

import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.User;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author gaurav
 */
public class SendEmailUtility {
    
    UserDaoImplementation userDaoImplementation;

    public void sendMail(User user) {
        // Setting the sender's and reciever's email address
            userDaoImplementation = new UserDaoImplementation();
        //User emailSender = userDaoImplementation.getUserById(1000);
           
            String senderEmailAddress = "1809Hazel@gmail.com";
            String senderEmailPass = "123@Hazel";
            
            String recieverEmailAddress = user.getEmail();
            String recieverUsername=user.getUsername();
            String recieverName=user.getName();
            String recieverPassword=user.getPassword();
            Properties prop = System.getProperties();
            String host = "smtp.gmail.com";
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.ssl.trust", host);
            prop.put("mail.smtp.user", senderEmailAddress);
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(prop);
            try {
                // setting an object for mimeMessage
                MimeMessage message = new MimeMessage(session);// Set From: header field of the header.
                message.setFrom(new InternetAddress(senderEmailAddress));// Set To: header field of the header.
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recieverEmailAddress));// Set Subject: header field
                message.setSubject("Account Creation Successful");
                message.setHeader("X-Priority", "1");
                
                message.setText("Dear "+recieverName+", "
                    + "\n\n Please find your credentials "
                    + "\n\n Username: "+recieverUsername+""
                         + "\n\n Password: "+recieverPassword+""
                         + "\n\n\n\n\n Regards, "
                                 + "\n Admin");
                Transport transport = session.getTransport("smtp");
                transport.connect(host, senderEmailAddress, senderEmailPass);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();

            } catch (MessagingException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid email");
                return;
            }
    }
}
