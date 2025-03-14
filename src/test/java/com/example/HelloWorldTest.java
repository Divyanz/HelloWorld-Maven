package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
	 @Test
	    void testGetMessage() {
	        HelloWorld helloWorld = new HelloWorld();
	        assertEquals("Hello, World!", helloWorld.getMessage());
	    }
}
