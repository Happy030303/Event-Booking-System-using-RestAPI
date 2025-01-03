package com.restAPI.EBS.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Entity
@Scope("prototype")
public class Ticket
{
    @Id
    private int bookingId;
    @Column( nullable = false)
    private int userId; // make foreign key
    @Column( nullable = false)
    private int numberOfTickets;
    @Column( nullable = false)
    private int price;
    @Column( nullable = false)
    private Date bookingDate;
    @Column(nullable = false)
    private String boookingStatus;
    @Column(nullable = false)
    private String paymentMode;


    // ---------------------------------------------------------------------------------------------
    public Ticket() {
    }

    public Ticket(int bookingId, int userId, int price, int numberOfTickets, Date bookingDate, String paymentMode, String boookingStatus) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.price = price;
        this.numberOfTickets = numberOfTickets;
        this.bookingDate = bookingDate;
        this.paymentMode = paymentMode;
        this.boookingStatus = boookingStatus;
    }

    //-----------------------------------------------------------
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getBoookingStatus() {
        return boookingStatus;
    }

    public void setBoookingStatus(String boookingStatus) {
        this.boookingStatus = boookingStatus;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
