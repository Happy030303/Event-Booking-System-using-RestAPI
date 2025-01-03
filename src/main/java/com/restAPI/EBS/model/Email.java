package com.restAPI.EBS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Email
{
    @Id
    private int email_id;
    private String email;
    private String password;
    private String role;







/////////////////////////////////////////////////////////////////////////////////////
// constructor

    public Email()
    {
        // zero parametrised constructor
    }

    public Email(  int email_id, String email, String password, String role)
    {
        this.password = password;
        this.email = email;
        this.email_id = email_id;
    }

    /////////////////////////////////////////////////////////////////////////////////////

    // setters and getters
    public int getEmail_id() {
        return email_id;
    }

    public void setEmail_id(int email_id) {
        this.email_id = email_id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
