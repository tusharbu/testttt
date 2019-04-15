package jUnitTesting;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		LAB jtest =new LAB();
		int result= jtest.addnumbers(80, 70);
		assertEquals(150,result);
		}

}
