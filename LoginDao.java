

package com.java.login;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.java.signup.TestConnection;

public class LoginDao {

	public static boolean checkLogin(String email, String password) throws FileNotFoundException, IOException {
		boolean result = false;
		try {
			Connection connection = TestConnection.createConnection();
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select email,password from facebook_signup where email='"+email+"'and password='"+password+"'");
			
			  if (set.next()) { 
				  result = true; 
				  }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
		
	}

}
