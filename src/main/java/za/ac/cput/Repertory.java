package za.ac.cput;
/*
* @reppertory.java
* Author : Joseph Djamba 218292694
* This program demonstrate the test driven developmnt in the application
* */
public class Repertory {
    public String contactName;
    public String ContactSurname;
    public int ContactNumber;
    public String emailAdress;


    public Repertory(String contactName, String ContactSurname, int ContactNumber, String emailAdress) {
        contactName = contactName;
        ContactSurname = ContactSurname;
        ContactNumber = ContactNumber;
        emailAdress = emailAdress;

    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactSurname() {
        return ContactSurname;
    }

    public void setContactSurname(String contactSurname) {
        ContactSurname = contactSurname;
    }

    public int getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(int contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
}
