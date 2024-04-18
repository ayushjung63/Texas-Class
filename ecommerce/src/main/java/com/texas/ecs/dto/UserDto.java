package com.texas.ecs.dto;

import com.texas.ecs.enums.Role;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class UserDto {
    private Integer id;
    @NotNull(message = "Email is compulsory.")
    @NotEmpty(message = "Email is compulsory.")
    private String email;

    @NotNull(message = "Contact is compulsory.")
    @Length(max = 10,min = 10,message = "Contact must consist 10 digits.")
    private String contact;
    private String name;
    private String address;
    private Role role;

    public UserDto(Integer id, String email, String contact, String name, String address, Role role) {
        this.id = id;
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.address = address;
        this.role = role;
    }

    public UserDto(String email, String contact, String name, String address, Role role) {
        this.email = email;
        this.contact = contact;
        this.name = name;
        this.address = address;
        this.role = role;
    }

    public UserDto() {
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
