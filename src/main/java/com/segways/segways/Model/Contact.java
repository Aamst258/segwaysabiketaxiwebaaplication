/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.segways.segways.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "Contact")

public class Contact {  
   
    @Id
    private String messageId;
    private String fname;
      private String lname;
      public Contact(String messageId, String fname, String lname, String email, String message) {
		super();
		this.messageId = messageId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.message = message;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String email;
      private String message; 

   
      
}
