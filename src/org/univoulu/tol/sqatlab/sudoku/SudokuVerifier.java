package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	String valid = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String invalid = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	public void possibleSolution(){
		switch(verify(valid)){
		case 0: System.out.println("Valid Solution"); break;
		}
		
	}
	
	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
}
