package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ViewsContactController {
// we need add new contact there it self 
//	public int AddnewContactHyprerLinl(Contact cantact,Model model) {
//		return 0;
//		
//	}
	public String handleAddnewContactHyprerLink(Model model) {// here we just redorecting to list page so just model is enoughss
		return null;
		
	}
	public String editContact(Integer ContactId,Model model) {  // here contactId for path and model object for send data to Ui// becasued we edit one by one record 
		//with respect of id as primary key  // why we using model means we need to make editable from when we editing so based on primary key we need to make as fisrt form
		return null;
		
	}
//	public String updateContact(Contact contact,Model model) {
//		return null;
//		
//	}// this method is alerdy used in save page no need agian do
	public String deleteContact(Integer ContactId ,Model model) {// we can use without model also 
		return null;
		
	}
}
