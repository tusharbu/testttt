package jUnitTesting;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class testAddString {
	void test() {
		LAB teststring=new LAB();
		String result=teststring.addStrings("Gaurav", "Tushar");
		assertEquals("GauravTushar",result);
		}
	
}
