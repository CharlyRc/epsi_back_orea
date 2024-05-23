package fr.epsi.orea_back.bo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ZIP_CODE")
    private String zipCode;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "MAIL")
    private String mail;
    @Column(name = "MESSAGE")
    private String message;

    public Contact() {
    }

    public Contact(String lastName, String firstName, String address, String city, String zipCode, String phoneNumber, String mail, String message) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", zipCode='").append(zipCode).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
