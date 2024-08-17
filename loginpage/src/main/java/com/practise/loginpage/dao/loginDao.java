package com.practise.loginpage.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practise.loginpage.dao.Interface.loginInter;

@Repository
/*
 * @Repository tells Spring that this class handles interactions with a
 * database.
 */
public class loginDao implements loginInter {
	@Autowired
	/*
	 * This is like someone giving you the tools you need to do your job.
	 * Here, @Autowired gives our loginDao class a JdbcTemplate tool to connect to
	 * the database.
	 */
	JdbcTemplate jdbaTemplate;
	/*
	 * n summary, JdbcTemplate simplifies database operations in Java by abstracting
	 * away JDBC complexities. In this code, it's used to interact with the database
	 * for user authentication within the loginDao class.
	 */

	public boolean validateUser(String username, String password) {
		/*
		 * In simple terms, this code checks if there is exactly one row in the
		 * userslogin table with the provided username and password. If such a row
		 * exists, it returns true, indicating successful validation of the user's
		 * credentials. Otherwise, it returns false, indicating invalid credentials. 
		 */
		int count;
		count = jdbaTemplate.queryForObject("select count(*) from userslogin where username =? and password =?",
				Integer.class, username, password);
		if (count == 1) {
			return true;
		} else {
			return false;
		}
	}

}
