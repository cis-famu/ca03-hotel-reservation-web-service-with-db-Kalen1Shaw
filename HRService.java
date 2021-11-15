/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model.service;


import com.mycompany.hotelreservation.model.HotelInfo;
import com.mycompany.hotelreservation.model.Reservation;
import com.mycompany.hotelreservation.model.Room;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kshaw
 */

public class HRService {
    
    private final ArrayList<Reservation> list = new ArrayList<>();
    
    public HRService(){
        
        ArrayList<Room> r1 = new ArrayList<>();
        HotelInfo h1 = new HotelInfo();
        
        r1.add(new Room("floor 1", 444, "King"));
        h1.name = "Kalen Shaw";
        h1.address = "new address";
        h1.phone = "888-888-8888";
        
        list.add(new Reservation(114,12444,new Date(System.currentTimeMillis()), "PAID", "plat", new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()), "Kalen Shaw", 2, 0, h1, "sample")); 
        
        
       
    }
    
    public Reservation findbyconfNo(int confirmationNo){
            
            for (int i = 0; i < list.size(); ++i){
            if(list.get(i).getConfirmationNo() == confirmationNo)
                return list.get(i);
        }
        return null;
    }
    
        public Reservation findbycustID(int customerId){
            
            for (int i = 0; i < list.size(); ++i){
            if(list.get(i).getCustomerId() == customerId)
                return list.get(i);
        }
        return null;
    }
        public Reservation findbyplat(String platform){
            
            for (int i = 0; i < list.size(); ++i){
            if(list.get(i).getPlatform().equals(platform))
                return list.get(i);
        }
        return null;
    }
        public Reservation findbypaystat(String paymentStatus){
            
            for (int i = 0; i < list.size(); ++i){
            if(list.get(i).getPaymentStatus().equals(paymentStatus))
                return list.get(i);
        }
        return null;
    }
    }
    
        
    

