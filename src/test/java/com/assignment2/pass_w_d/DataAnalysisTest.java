package com.assignment2.pass_w_d;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

	@Test
	public void testBuildFinalString() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));
	}
	
	@Test
	public void testGetResultStringNamesAndAge() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		assertEquals("The result should be 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'", 
				dataAnalysis.getResultStringNamesAndAge(values), "The first name is smaller or equals in size to the last name and the participant is 30 or younger");
		
		values.set(1, "Rafae"); 
		values.set(4, "31");
		assertEquals("The result should be 'The first name is smaller or equals in size to the last name and the participant is 30 or younger'", 
				dataAnalysis.getResultStringNamesAndAge(values), "The first name is smaller or equals in size to the last name and the participant is 30 or younger");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafae", "Silval", "M", "31", "Fortaleza"));
		assertEquals("The result should be 'The first name is greater or equals in size to the last name and the participant older than 30'", 
				dataAnalysis.getResultStringNamesAndAge(values), "The first name is greater or equals in size to the last name and the participant older than 30");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "31", "Fortaleza"));
		assertEquals("The result should be 'No analysis was performed'", 
				dataAnalysis.getResultStringNamesAndAge(values), "No analysis was performed");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafae", "Silval", "M", "30", "Fortaleza"));
		assertEquals("The result should be 'No analysis was performed'", 
				dataAnalysis.getResultStringNamesAndAge(values), "No analysis was performed");
	}
	
	@Test
	public void testGetResulStringHomecityAndAge() {
		DataAnalysis dataAnalysis = new DataAnalysis();
		ArrayList<String> values = new ArrayList<String>();
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Moon"));
		assertEquals("The result should be 'The name of the homecity is small and the participant is 30 or older'", 
				dataAnalysis.getResulStringHomecityAndAge(values), "The name of the homecity is small and the participant is 30 or older");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Moon"));
		assertEquals("The result should be 'The name of the homecity is small and the participant is younger than 30'", 
				dataAnalysis.getResulStringHomecityAndAge(values), "The name of the homecity is small and the participant is younger than 30");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		assertEquals("The result should be 'The name of the homecity is big and the participant is 30 or older'", 
				dataAnalysis.getResulStringHomecityAndAge(values), "The name of the homecity is big and the participant is 30 or older");
		
		values.clear();
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Fortaleza"));
		assertEquals("The result should be 'The name of the homecity is big and the participant is younger than 30'", 
				dataAnalysis.getResulStringHomecityAndAge(values), "The name of the homecity is big and the participant is younger than 30");
	}
}
