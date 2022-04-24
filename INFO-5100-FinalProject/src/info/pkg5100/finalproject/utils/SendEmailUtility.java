/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.utils;

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

    public void main(String[] args) {
        // Recipient's email ID needs to be mentioned.
        String to = "gaurav21961@gmail.com";
        String from = "gaurav131969@gmail.com";
        String pass = "password";// Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
// properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties);
        try {
// Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);// Set From: header field of the header.
            message.setFrom(new InternetAddress(from));// Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));// Set Subject: header field
            message.setSubject("New Registration for Charity Management System");
            message.setText("You have been successfully registered. Thank you!");
// Send message
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            System.out.println("Sent message successfully....");
        } catch (MessagingException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email ID is invalid!.");
        }
    }

}
