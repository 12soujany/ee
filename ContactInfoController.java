package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Pojos.Contact;

@Controller
public class ContactInfoController {
	// here we need display empty form need one mthod 1
	@RequestMapping("/hi")
	public String IndexPageLoad(Model model) {// load the form  if we want send  data from controller to Ui we use Model
		return "Index";
}
	//need to submit the data top storeing // for save and load  and update
	public String handleSubmitBtn(Contact c,Model m) {
		return null;
	}
	// // show to hyperlink and take to next pafe view conatcts to go to onther page where all contacts list will be there but we need show this hyperlink inside ssame form
	public String handleViewContactHyperLink(Model model) {// to send controller to jsp
		return null;
	}
}
