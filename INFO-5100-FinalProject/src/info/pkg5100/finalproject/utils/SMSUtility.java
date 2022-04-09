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
 * @author hazel
 */
public class SMSUtility {

    private void sendTextMessage() {
        String to = "16176524983";
        System.out.println(to);
        String from = "1809Hazel@gmail.com";
        String pass = "123@Hazel";
        // Assuming you are sending email from localhost
        // String host = "192.168.0.16";
        // Get system properties
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
        properties.put("mail.smtp.user", from);
        // properties.put("mail.smtp.password", pass);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        // Setup mail server
        // properties.setProperty("mail.smtp.host", host);
        // properties.put("mail.smtp.starttls.enable", "true");
        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);
        // final PasswordAuthentication auth = new PasswordAuthentication(from, pass);
        //Session session = Session.getDefaultInstance(properties, new Authenticator() {
        // @Override
        // protected PasswordAuthentication getPasswordAuthentication() { return auth; }
        //});
        //Session session = Session.getInstance(properties);
        try {
        // Create a default MimeMessage object.
        MimeMessage message = new MimeMessage(session);



        // Set From: header field of the header.
        message.setFrom(new InternetAddress(from));



        // Set To: header field of the header.
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));



        // Set Subject: header field
        message.setSubject("Report Successfully Filed");
        message.setText("Thank you for your report!");
        // Send message
        Transport transport = session.getTransport("smtp");
        transport.connect(host, from, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        System.out.println("SMS successfully sent");
        } catch (MessagingException ex) {
        JOptionPane.showMessageDialog(null, "Invalid contact number!");
        }
        }
    
    public static void main(String[] args) {
        new SMSUtility().sendTextMessage();
    }
}
