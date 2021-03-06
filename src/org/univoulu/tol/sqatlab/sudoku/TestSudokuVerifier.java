package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	SudokuVerifier game;
	
	@Before
	public void setup(){
		game = new SudokuVerifier();
	}
	
	@Test
	public void testInputLength() {
		assertEquals(0, game.possibleSolution());
	}

	@Test
	public void testInputStringIsValid(){
		assertEquals(0, game.possibleSolution());
	}
	
	@Test
	public void testSubGridIsValid(){
		assertEquals(0, game.possibleSolution());
	}
}
