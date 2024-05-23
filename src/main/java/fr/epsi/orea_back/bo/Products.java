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
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="products_assets", joinColumns= @JoinColumn(name="ID_PRO", referencedColumnName= "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_ASS", referencedColumnName="ID")
    )
    private Set<Assets> assets;

}
