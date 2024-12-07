package com.jlcindia.hibernate;

import jakarta.persistence.*;

@Entity
@Table (name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cid")
    private int cid;
    @Column(name = "cname")
    private String cname;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private Long phone;
    @Column(name = "city")
    private String city;
    public Customer(){}
    public Customer(String cname, String email, Long phone, String city) {
        this.cname = cname;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}
