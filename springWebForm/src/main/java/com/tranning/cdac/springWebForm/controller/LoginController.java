package com.tranning.cdac.springWebForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tranning.cdac.springWebForm.model.User;

@Controller
public class LoginController {
//	@RequestMapping("/gotologin")
//	public String logina()
//	{
//		return "login";
//	}
	@GetMapping("/gotologin")
	public String showLoginForm(Model model) {

		User user = new User();
		model.addAttribute("u", user);
		return "login"; // returns login.jsp + user object
	}

	@PostMapping("/login-success")
	public String display(@ModelAttribute("u") User user, Model model) {

		model.addAttribute("username", user.getUsername());
		model.addAttribute("password", user.getPassward());
//		System.out.println(user.getUsername());
		return "result";// returns result.jsp + username & password attributes
	}

}

/*
 * Annotations:
 * 
 * @Controller: Yeh annotation Spring Framework ko bataata hai ki yeh class ek
 * controller hai, jiske through hum web requests handle kar sakte hain.
 * 
 * @GetMapping("/gotologin"): Yeh annotation batata hai ki showLoginForm()
 * method ko GET requests ke liye bind karna hai jab "/gotologin" URL pe aaye.
 * 
 * @PostMapping("/login-success"): Yeh annotation batata hai ki display() method
 * ko POST requests ke liye bind karna hai jab "/login-success" URL pe aaye.
 * Methods:
 * 
 * showLoginForm(Model model): Yeh method ek login form ko display karta hai.
 * Jab "/gotologin" URL pe GET request aata hai, to yeh method call hota hai. Is
 * method mein ek naya User object banaya jata hai aur usko model mein daal kar
 * "u" naam se template ko bhej diya jata hai. display(@ModelAttribute("u") User
 * user, Model model): Yeh method login form se submit kiye gaye data ko process
 * karta hai aur result page ko display karta hai. Jab "/login-success" URL pe
 * POST request aata hai, to yeh method call hota hai. Is method mein User
 * object ko model se retrieve kiya jata hai, jismein user ke input fields ke
 * values hote hain. Phir in values ko alag-alag attributes ke roop mein model
 * mein daal kar "result" page ko bhej diya jata hai. Model:
 * 
 * Model ek data structure hai jo Spring Framework mein template ke saath data
 * ko pass karne ke liye use hota hai. Is example mein, showLoginForm() method
 * mein User object ko model mein daal kar "u" naam se bhej diya jata hai, aur
 * display() method mein username aur password ko model mein daal kar "username"
 * aur "password" naam se bhej diya jata hai. Templates:
 * 
 * "login" aur "result" yeh dono templates hain jo actual HTML pages hain.
 * "login" page pe user ko form dikhaya jata hai jismein username aur password
 * daalne ke liye fields hote hain. Jab user form submit karta hai, phir
 * "result" page pe username aur password ko display kiya jata hai. User Model:
 * 
 * User ek model class hai jo username aur password ko represent karta hai.
 * Ismein getters aur setters hote hain jisse hum user ke input ko store aur
 * retrieve kar sakein. Is tareeke se, yeh code user ke login form submissions
 * ko process karta hai aur result ko display karta hai, Spring Framework ke
 * madyam se
 */
