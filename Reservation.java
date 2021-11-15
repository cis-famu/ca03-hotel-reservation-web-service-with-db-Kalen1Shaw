/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author kshaw
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
    private @XmlAttribute int customerId;
    private @XmlAttribute int confirmationNo;
    private @XmlAttribute Date completed;
    private @XmlAttribute String paymentStatus;
    private @XmlAttribute String platform;
    private Date checkInDate;
    private Date checkOutDate;
    private String reservationName;
    private int adultGuests;
    private int minorGuests;
    private HotelInfo hotelinformation;
    private String cancellationPolicy;
    
    public Reservation(){}
    
    public Reservation(int customerId, int confirmationNo, Date completed, String paymentStatus, String platform, Date checkInDate, Date checkOutDate, String reservationName, int adultGuests, int minorGuests, HotelInfo hotelinformation, String cancellationPolicy){
        
        this.customerId = customerId;
        this.confirmationNo = confirmationNo;
        this.completed = completed;
        this.paymentStatus = paymentStatus;
        this.platform = platform;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationName = reservationName;
        this.adultGuests = adultGuests;
        this.minorGuests = minorGuests;
        this.hotelinformation = hotelinformation;
        this.cancellationPolicy = cancellationPolicy;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getConfirmationNo() {
        return confirmationNo;
    }

    public void setConfirmationNo(int confirmationNo) {
        this.confirmationNo = confirmationNo;
    }

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
        public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public HotelInfo getHotelinformation() {
        return hotelinformation;
    }

    public void setHotelinformation(HotelInfo hotelinformation) {
        this.hotelinformation = hotelinformation;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public int getAdultGuests() {
        return adultGuests;
    }

    public void setAdultGuests(int adultGuests) {
        this.adultGuests = adultGuests;
    }

    public int getMinorGuests() {
        return minorGuests;
    }

    public void setMinorGuests(int minorGuests) {
        this.minorGuests = minorGuests;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }
    
    
}
