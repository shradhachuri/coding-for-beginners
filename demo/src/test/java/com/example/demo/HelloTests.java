package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SprintBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SprintBootTest
public class HelloTests {

	@Test
	public void testHello () {
		
		if (10 + 10 ==20)
			System.out.println("Yes");
		else
			System.out.println("No");
	assertEquals ("a","a");
		
	}	
}
