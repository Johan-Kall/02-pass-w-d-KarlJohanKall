package com.assignment2.pass_w_d;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {

	@Test
	public void testNameLenghtGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
		resultsFromInputs.setResultForNameLenght(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForNameLenght(), 0);
		resultsFromInputs.setResultForNameLenght(-10);
		assertEquals("The result should be -10", resultsFromInputs.getResultForNameLenght(), -10);
	}
	
	@Test
	public void testGenderGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForGender(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForGender(), 10);
		resultsFromInputs.setResultForGender(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForGender(), 0);
		resultsFromInputs.setResultForGender(-10);
		assertEquals("The result should be -10", resultsFromInputs.getResultForGender(), -10);
	}
	
	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForAge(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForAge(), 10);
		resultsFromInputs.setResultForAge(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForAge(), 0);
		resultsFromInputs.setResultForAge(-10);
		assertEquals("The result should be -10", resultsFromInputs.getResultForAge(), -10);
	}

	@Test
	public void testHomeCityGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();
		resultsFromInputs.setResultForHomeCity(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForHomeCity(), 10);
		resultsFromInputs.setResultForHomeCity(0);
		assertEquals("The result should be 0", resultsFromInputs.getResultForHomeCity(), 0);
		resultsFromInputs.setResultForHomeCity(-10);
		assertEquals("The result should be -10", resultsFromInputs.getResultForHomeCity(), -10);
	}

	
}
