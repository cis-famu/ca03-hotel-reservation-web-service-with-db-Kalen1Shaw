/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model.service;


import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.mycompany.hotelreservation.model.HotelInfo;
import com.mycompany.hotelreservation.model.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author kshaw
 */

public class HRService extends DBConnection {
    
    private final ArrayList<Reservation> list = new ArrayList<>();
    
    public HRService(){
        super();        
    }
    
     public Reservation findByconfNo(int confirmationNo) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("Reservation");
	//query where clause
	Query query = po.whereEqualTo("confirmationNo", confirmationNo);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(Reservation.class);
        
        return null;
    }
    
        public Reservation findBycustId(int customerId) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("Reservation");
	//query where clause
	Query query = po.whereEqualTo("id", customerId);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(Reservation.class);
        
        return null;
    }
        
         public Reservation findByplat(String platform) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("Reservation");
	//query where clause
	Query query = po.whereEqualTo("platform", platform);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(Reservation.class);
        
        return null;
    }
         public Reservation findBypaystat(String paymentStatus) throws InterruptedException, ExecutionException{
    
	//refernce to the collection(table)
	CollectionReference  po = db.collection("Reservation");
	//query where clause
	Query query = po.whereEqualTo("paymentStatus", paymentStatus);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(Reservation.class);
        
        return null;
    }
        public String createReservation( int confirmationNo, String paymentStatus, 
                String platform, Date checkInDate, Date checkOutDate, 
                String reservationName, int adultGuests, int minorGuests, 
                HotelInfo hotelinformation, String cancellationPolicy) throws ParseException, InterruptedException, ExecutionException{
  
	//create date format that doesn't include time
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00");
	//get the current date as a string
	String now = formatter.format(new Date(System.currentTimeMillis()));

	//create submitted date
	Date completed = formatter.parse(now);
  
	// create instance of Random class
	Random rand = new Random();

	// Generate random integers in range 0 to 9999
	int customerId = rand.nextInt(10000);
	
	
	//create purchase order
	Reservation newRes = new Reservation(customerId, confirmationNo, completed, paymentStatus, 
                platform, checkInDate, checkOutDate, reservationName, adultGuests, minorGuests, hotelinformation, cancellationPolicy);
	//save values to database
	ApiFuture<DocumentReference> future = db.collection("Reservation").add(newRes);
	
	//retrieve newly created document(row)
	DocumentReference doc = future.get();
   
    //return the document id;
	return doc.getId();
	
 
}
    }
    
        
    

