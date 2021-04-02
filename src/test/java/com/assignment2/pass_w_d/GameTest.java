package com.assignment2.pass_w_d;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

	@Test
	public void testCalculateOutPutBasedOnNames() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("Rafa", "Silva");
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		i = game.calculateOutPutBasedOnNames("Rafael", "Silval");
		assertEquals("The result should be 2", i, 2);
	}

	public void testCalculateOutPutBasedOnGender() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", i, 1);
		i = game.calculateOutPutBasedOnGender('P');
		assertEquals("The result should be 2", i, 2);
	}
	
	public void testCalculateOutPutBasedOnAge() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnAge(-10);
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnAge(25);
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnAge(30);
		assertEquals("The result should be 1", i, 1);
	}
	
	public void testCalculateOutPutBasedOnHomeCity() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnHomeCity("Amsterdam");
		assertEquals("The result should be 0", i, 0);
		i = game.calculateOutPutBasedOnHomeCity("berlin");
		assertEquals("The result should be 1", i, 1);
		i = game.calculateOutPutBasedOnHomeCity("Cairo");
		assertEquals("The result should be 2", i, 2);
		i = game.calculateOutPutBasedOnHomeCity("dublin");
		assertEquals("The result should be 3", i, 3);
		i = game.calculateOutPutBasedOnHomeCity("edinburgh");
		assertEquals("The result should be 4", i, 4);
		i = game.calculateOutPutBasedOnHomeCity("Fort Lauderdale");
		assertEquals("The result should be 5", i, 5);
		i = game.calculateOutPutBasedOnHomeCity("Geneva");
		assertEquals("The result should be 6", i, 6);
		i = game.calculateOutPutBasedOnHomeCity("Havana");
		assertEquals("The result should be 7", i, 7);
		i = game.calculateOutPutBasedOnHomeCity("Idianapolis");
		assertEquals("The result should be 8", i, 8);
		i = game.calculateOutPutBasedOnHomeCity("Jerusalem");
		assertEquals("The result should be 9", i, 9);
		i = game.calculateOutPutBasedOnHomeCity("Stockholm");
		assertEquals("The result should be 10", i, 10);
	}
	
	
}
