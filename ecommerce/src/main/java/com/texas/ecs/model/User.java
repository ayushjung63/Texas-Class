package com.texas.ecs.model;

import com.texas.ecs.enums.Role;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "email",nullable = false)
    private String email;
    @Column(name = "contact",nullable = false)
    private String contact;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "address",nullable = false)
    private String address;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String email, String contact, String name, String address, Role role) {
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.address = address;
        this.role = role;
    }

    public User(Integer id, String email, String contact, String name, String address, Role role) {
        this.id = id;
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.address = address;
        this.role = role;
    }

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
