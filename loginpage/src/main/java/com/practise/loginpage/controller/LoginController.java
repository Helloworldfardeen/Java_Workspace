package com.practise.loginpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practise.loginpage.dao.Interface.loginInter;

@Controller // it used to send and receives the HTTP (request,response)
public class LoginController {

	@RequestMapping("/gologin") // used for map the url using the given parameter
	public String TakeToLogin() {
		return "login"; // basically this line responsible for user to take to that pages
	}

	@Autowired // --> Enhances IoC mean automatic dependency injection
	loginInter loginDao;
	/*
	 * Overall, using interfaces promotes good design principles such as
	 * abstraction, encapsulation, and separation of concerns, which contribute to
	 * building robust, maintainable, and scalable software systems.
	 */

	@GetMapping("/login") // basically it used retrieving the data
	public String getloginPage() {
		return "login";
	}

	/*
	 * This line of code declares a method called checkUser(). This method takes two
	 * parameters: username and password. These parameters are obtained from the
	 * HTTP request parameters, meaning they come from data sent by a user through a
	 * web browser or a client application. In simpler terms, when someone tries to
	 * log in to a website, they input their username and password. This method is
	 * responsible for taking those inputs and checking if they match the
	 * credentials stored in the system.
	 */
	@PostMapping("/dologin") // basically it used for modifies data
	public String checkUser(@RequestParam String username, @RequestParam String password) {
		/*
		 * This line invokes the validateUser() method of the loginDao object to check
		 * if the provided username and password are valid.
		 */
		boolean loginFlag = loginDao.validateUser(username, password);
		if (loginFlag == true) {
			return "succees";
		} else {
			return "failure";
		}
	}

}
