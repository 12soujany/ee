package com.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//@data this lombok anntion it will genrate seeters and getters
@Entity// when we dont give @table and give as entity it will take table name as real class name in database
@Table(name="contact_detils")
public class ContactdetlsEntity {


	@Id// the fisrt varible will be primary key
	// when ever we dont give column name accrding to anntions it will take real varibles as column name in tabale in database
	
	@Column(name="contact_Id")
	// we need to genrate sl no or id by defaulut because we cant ask user to enter sl no so we can use anntion
	// @GeneratedValue for primary key column
	@GeneratedValue
	private int ContactId;
	@Column(name="contact_Name")
	private String ContactName;
	@Column(name="contact_Number")
	private String ContactNumber;
	@Column(name="contact_Email")
	private String Email;
	// what diffrence between setters and getters diff with lombok genrtaing
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
