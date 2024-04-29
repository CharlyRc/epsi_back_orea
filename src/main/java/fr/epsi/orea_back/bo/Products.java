package fr.epsi.orea_back.bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ALLERGENS")
    private String allergens;
    @OneToMany(mappedBy = "product")
    private Set<PicturesProducts> picturesProducts;

}
