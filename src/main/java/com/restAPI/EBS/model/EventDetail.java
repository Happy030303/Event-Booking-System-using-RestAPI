package com.restAPI.EBS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Entity
@Scope("prototype")
public class EventDetail
{
    @Id
    private int eventId;
    private String place;
    private String eventName;
    private Date eventDate;
    private int price;
    private int availableSeates;
    private int occupiedSeates;
    private Date createdDate;
    private Date updatedDate;








    ////////////////////////////////////////////////////////////////////////////////////////////
// constructor
    public EventDetail()
    {
        // zero parametrised constructor
    }

    public EventDetail(int eventId, Date updatedDate, Date createdDate, int occupiedSeates, int availableSeates, int price, String eventName, String place, Date eventDate) {
        this.eventId = eventId;
        this.updatedDate = updatedDate;
        this.createdDate = createdDate;
        this.occupiedSeates = occupiedSeates;
        this.availableSeates = availableSeates;
        this.price = price;
        this.eventName = eventName;
        this.place = place;
        this.eventDate = eventDate;
    }


//-----------------------------------------------------------------------------

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableSeates() {
        return availableSeates;
    }

    public void setAvailableSeates(int availableSeates) {
        this.availableSeates = availableSeates;
    }

    public int getOccupiedSeates() {
        return occupiedSeates;
    }

    public void setOccupiedSeates(int occupiedSeates) {
        this.occupiedSeates = occupiedSeates;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }


}
