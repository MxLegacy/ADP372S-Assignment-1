package za.ac.cput.repertory;

public class Repertory {

    public String contactName;
    public String ContactSurname;
    public int ContactNumber;
    public String emailAdress;
    public String name;


    public Repertory(String message) {
        this.name = name;
    }

    public Repertory(String contactName, String contactSurname, int contactNumber, String emailAdress) {
        this.contactName = contactName;
        this.ContactSurname = contactSurname;
        this.ContactNumber = contactNumber;
        this.emailAdress = emailAdress;
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


