package com.tranning.cdac.springWebForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.tranning.cdac.springWebForm.model.Reservation;

@Controller
/*
 * Think of @Controller as a label that tells Spring, "Hey, this class is
 * special. It's in charge of handling web requests
 */
public class ReservationController {

	@GetMapping("/ticket")
	/*
	 * When someone wants to book a ticket and goes to the URL "/ticket" in their
	 * web browser, this method kicks in.
	 */
	public String bookingForm(Model theModel) {
		Reservation obj = new Reservation();
		theModel.addAttribute("reservation", obj);
		return "reservation"; // it has reservation obj/attribute
		/*
		 * Inside this method: We create a new Reservation object. It's like a form
		 * where users can enter their details. We add this Reservation object to a
		 * "model". Think of a model as a folder where we keep things we want to show on
		 * a web page. Then, we say, "Go show the reservation.jsp page." This page will
		 * display the booking form along with the reservation details.
		 */
	}

	@PostMapping("/submitForm")
	
	public String submitForm(@ModelAttribute("reservation") Reservation obj) {

		return "confiramation"; // returns confirmation.jsp + reservation object
	}

}
