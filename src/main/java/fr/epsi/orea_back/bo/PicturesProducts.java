package fr.epsi.orea_back.bo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class PicturesProducts implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "URL")
    private String url;

    @Column(name = "CAPTION")
    private String caption;

    @ManyToOne
    @JoinColumn(name = "ID")
    private Products product;
}
