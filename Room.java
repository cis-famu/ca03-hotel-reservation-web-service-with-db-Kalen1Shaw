/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model;

/**
 *
 * @author kshaw
 */
public class Room {
    
    private String floor;
    private int number;
    private String bedType;
    
    public Room(){}
    
    public Room(String floor, int number, String bedType){
        this.floor = floor;
        this.number = number;
        this.bedType = bedType;
    }

    public String getFloor() {return floor;}
    public void setFloor(String floor) {this.floor = floor;}

    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}

    public String getBedType() {return bedType;}
    public void setBedType(String bedType) {this.bedType = bedType;}
    
    
}
