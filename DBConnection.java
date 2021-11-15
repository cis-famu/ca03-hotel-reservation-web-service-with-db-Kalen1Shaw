/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hotelreservation.model.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kshaw
 */
public class DBConnection {

	//Database connection variable. It is shared with any class that inherits from this class
    protected static Firestore db;
    
	//constructor
	//throws file and IO exceptions from attempting to open the credential file
    public DBConnection(){
		
		//Your project id
        String projectId = "hotelreservation-573e0";
        
        FileInputStream serviceAccount;
        
        try {
        serviceAccount = new FileInputStream("\"C:\\Users\\kshaw\\Documents\\hotelreservation-573e0-firebase-adminsdk-zd3fr-1e1a27f539.json\"");
        
		//set up database connection
        FirestoreOptions firestoreOptions =
        FirestoreOptions.getDefaultInstance().toBuilder()
            .setProjectId(projectId)
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .build();
			
		//connect to database
        db = firestoreOptions.getService();
        } catch (IOException ex){
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE,  null, ex);
        }
		
		//Open the credential json file 
        
    }
}
