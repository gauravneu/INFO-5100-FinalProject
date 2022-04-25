/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info.pkg5100.finalproject.utils;

import info.pkg5100.finalproject.daos.UserDaoImplementation;
import info.pkg5100.finalproject.models.User;
import info.pkg5100.finalproject.ui.AmbulanceRequestMngt;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    public void sendMail(String messageContent, String subject) {
        // Setting the sender's and reciever's email address
            userDaoImplementation = new UserDaoImplementation();
        try {
            User emailSender = userDaoImplementation.getUserById(1000);
            String recieverEmailAddress = emailSender.getName();
            String senderEmailAddress = emailSender.getUsername();
            String senderEmailPass = emailSender.getPassword();

           
    }

}
