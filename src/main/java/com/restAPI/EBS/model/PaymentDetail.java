package com.restAPI.EBS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Entity
@Scope("prototype")
public class PaymentDetail
{
    @Id
    private int paymentId; // primary key
    private int bookingId; // Foreign Key referencing Bookings table
    private String paymentMode; // upi, card, cash
    private Date paymentDate; // when payment done
    private String paymentStatus; // successful or failed










//////////////////////////////////////////////////////////////////////////////////////////////////////////
    //constructor
    public PaymentDetail()
    {
        // zero parametrised constructor
    }

    public PaymentDetail(int paymentId, String paymentStatus, Date paymentDate, String paymentMode, int bookingId) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
        this.bookingId = bookingId;
    }
// -------------------------------------------------------------------------------------------------------------------------


    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
