package com.tweetapp.userDetails;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.tweetapp.usersDetails.UserController;
import com.tweetapp.usersDetails.Users;

@SpringBootTest 
public class UserTest {
	
	@Autowired
	private UserController userController;
	

	public void contextLoads() throws Exception {
		assertThat(userController).isNotNull();
	}
	

	public void registerUser() throws Exception{
		Users user=new Users("test","user","test_user@yahoo.com","test_user","password","7982568409");
		URI location = new URI("http://localhost/test_user");
		ResponseEntity<Void> value = ResponseEntity.created(location).build();
		System.out.println(value+" "+user);
		assertThat(userController.register(user)).isEqualTo(value);
		
	}
	

	public void authentication() throws Exception{
		assertThat(userController.authencticate("test_user", "password")).isTrue();
	}
	

	public void getAllUser() throws Exception{
		assertThat(userController.getAllUsers()).isNotNull();
	}
	

	public void searchByRegex() throws Exception{
		assertThat(userController.searchByRegex("test")).isNotNull();
	}
	

	public void getUser() throws Exception{
		assertThat(userController.getUser("test")).isNull();
	}
	

	public void forgotPassword() throws Exception{
		Users user = new Users("test","user","test_user@yahoo.com","test_user","password","7982568409");
		ResponseEntity<Users> value=new ResponseEntity<Users>(user, HttpStatus.OK);
		assertThat(userController.updatePassword("test_user", user)).isEqualTo(value);
	}

}
