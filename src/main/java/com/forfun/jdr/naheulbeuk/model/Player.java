package com.forfun.jdr.naheulbeuk.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "player")
public class Player {
	
	@Id
    private String id;
	
	@Field("firstname")
    private String firstName;
    
	@Field("lastname")
    private String lastName;
 
    public Player() {}
 
    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
}