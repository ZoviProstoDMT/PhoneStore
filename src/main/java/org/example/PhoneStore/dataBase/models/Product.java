package org.example.PhoneStore.dataBase.models;

import javax.persistence.*;

@Entity
@Table (name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String company;
    private int count;
    private int price;

    public Product(){
    }

    public Product(String name, String company, int count, int price) {
        this.name = name;
        this.company = company;
        this.count = count;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model: " + getName() + " | Company: " + getCompany() +
                " | Count : " + getCount() + " | Price: " + getPrice() + " \n";
    }
}
