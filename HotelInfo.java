/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model;

import java.util.ArrayList;

/**
 *
 * @author kshaw
 */
public class HotelInfo {
    
    public String name;
    public String address;
    public String phone;
    private ArrayList<Room> rooms;
    
    
    public HotelInfo(){}
    
    public HotelInfo(String name, String address, String phone, ArrayList<Room> rooms){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rooms = rooms;
    
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }


    
}
