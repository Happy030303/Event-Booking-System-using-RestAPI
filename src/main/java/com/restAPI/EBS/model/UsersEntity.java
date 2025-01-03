package com.restAPI.EBS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;

import java.sql.Timestamp;

@Entity
@Scope("prototype")
public class UsersEntity
{
    @Id
    private int userId; // primary key
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @Column(name="email", unique = true, nullable = false)
    private String email;
    @Column(name="phone_number", length = 10, nullable = false)
    private String phoneNumber;
    @Column(name="role", nullable = false)
    private String role;
    @Column(name = "created_at", nullable = false, updatable = false)
    private Timestamp createdAt;
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;



//getters
    public int getUserId() {
        return userId;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getRole() {
        return role;
    }
    public Timestamp getCreatedAt() {
        return createdAt;
    }
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }


//setters
    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
    public void setCreatedAt(Timestamp createdAt) {
    this.createdAt = createdAt;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
            this.username = username;
    }
    public void setUserId(int userId) {
    this.userId = userId;
    }


}

