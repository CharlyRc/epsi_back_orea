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
}
