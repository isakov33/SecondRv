package space.abdilazov.secondrv;

public class Modelka {
    private String Contact;
    private int photo;

    public Modelka(String contact, int photo) {
        Contact = contact;
        this.photo = photo;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public Modelka(String contact, String number, int photo) {
        Contact = contact;
        this.photo = photo;
    }
}
