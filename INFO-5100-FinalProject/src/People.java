/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gaurav
 */
public class People {
    private int id;
    private String name;
    private String phoneNumber;
    private String emailId;
    private String address;

    public People(int id, String name, String phoneNumber, String emailId, 
            String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }
}
