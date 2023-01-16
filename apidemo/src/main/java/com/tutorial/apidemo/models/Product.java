package com.tutorial.apidemo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    //this is primary key
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //!validate field 
    @Column(nullable = false, unique = true, length = 300)
    private String productName;
    private int year;
    private Float price;
    private String url;
    // calculate filed = transient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product(String productName, int year, Float price, String url) {
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public Product(){
        
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", year=" + year + ", price=" + price + ", url="
                + url + "]";
    }
    
}
