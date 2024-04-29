package fr.epsi.orea_back.bo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "PASSWORD")
    private String password;

}
