package com.Pojos;
// to trsnsfer data
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

// Pojos class has data which is middleer between database and java so it will to the data
//In summary, the @Table annotation is used to provide details about the database table, while the @Entity annotation is used to mark a Java class as an entity and provide mapping details to a database table.
// both @table and @entity we can use

public class Contact {
	// we need to give primary key
	@Id
	private int ContactId;
	private String ContactName;
	private String ContactNumber;
	private String Email;
	public int getContactId() {
		return ContactId;
	}
	public void setContactId(int contactId) {
		ContactId = contactId;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
}
