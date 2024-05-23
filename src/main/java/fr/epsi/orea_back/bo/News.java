package fr.epsi.orea_back.bo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class News implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name="news_assets", joinColumns= @JoinColumn(name="ID_NEW", referencedColumnName= "ID"),
            inverseJoinColumns= @JoinColumn(name="ID_ASS", referencedColumnName="ID")
    )
    private Set<Assets> assets;

}
