package fr.epsi.orea_back.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class Assets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "SIZE")
    private long size;
    @ManyToMany(mappedBy = "assets")
    @JsonIgnore
    private Set<Products> products;

    @ManyToMany(mappedBy = "assets")
    @JsonIgnore
    private Set<News> news;

    public Assets() {
    }

    public Assets(String name, String type, long size, Set<Products> products, Set<News> news) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.products = products;
        this.news = news;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Set<Products> getProducts() {
        return products;
    }

    public void setProducts(Set<Products> products) {
        this.products = products;
    }

    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Assets{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }
}
