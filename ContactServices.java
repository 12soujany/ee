package com.servicelayer;

import java.util.List;
import com.Pojos.Contact;

public interface ContactServices {
	// need one method to save the records but we need retrun type as boolean if save 
		// save=true fail=false
		public boolean saveContacts(Contact contcats);
		// we need view all contacts when touches view wallcontcats need method
		public List<Contact>getAllContacts();// retrving all records here passingList fpr store data and passing pojs
		
		
		// second screen need methods
		//edit method based on primary key
		//public boolean editGetContcatById(Integer ContactId);// need to cjcek with option
		public Contact getContactById(Integer ContactId);// retrving one record we need to retrun objcet so called contact
		// when we do edit method we are going to update also  so we need one update mthod also
		public boolean updateContact(Contact contact);
		// for delete method based on primary key
		public boolean deleteContactById(Integer ContactId);
	}


