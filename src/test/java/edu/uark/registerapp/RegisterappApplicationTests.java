package edu.uark.registerapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisterappApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSignInTakeID(){
		//will test to see if the user name field is actually taking a result
		//will test that the error checking is working properly when looking for empty names
	}

	@Test
	public void testSignInIDTakePassword(){
		//tests for seeing if password is empty
		//look to see if the password matches whats in the records
	}

	@Test
	public void testSignInUserExists(){
		//tests the database to see if the user exists
	}

	@Test
	public void testSignInQuery(){
		//tests to see if the sign in actually queries the database
	}

}
