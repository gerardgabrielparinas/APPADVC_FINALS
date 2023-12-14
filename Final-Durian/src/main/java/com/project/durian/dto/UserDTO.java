package com.project.durian.dto;

import com.project.durian.model.Customer;
import com.project.durian.model.User;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UserDTO {

    private Long id;

    @NotBlank(message = "Password is Required")
    private String password;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is Required")
    private String email;

    private Boolean admin;

    private CustomerDTO customer;

    public UserDTO() {}

    public UserDTO(User user) {
        this.id = user.getId();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.admin = user.getAdmin();
        this.customer = user.getCustomer() == null? null: new CustomerDTO(user.getCustomer());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }


}
