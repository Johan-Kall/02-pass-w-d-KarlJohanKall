package com.assignment2.pass_w_d;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversor() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		
		
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}

}
