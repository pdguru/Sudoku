package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;

public class SudokuVerifier {

	String valid = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String invalid = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	
	public int possibleSolution(){
		switch(verify(invalid)){
		case 0: System.out.println("Valid Solution"); return 0;
		case -1: System.out.println("Invalid Input"); return -1;
		case -2: System.out.println("Number repeated in subgrid"); return -2;
		case -3: System.out.println("Number repeated in row"); return -3;
		case -4: System.out.println("Number repeated in column"); return -4;
		case -5: System.out.println("Invalid Input"); return -5;
		default: return 1;
		}
		
	}
	
	public int verify(String candidateSolution) {
		//check length
		if(candidateSolution.length()!=81) return -5;
		
		//valid numbers
		for(int i=0; i<81; i++){
			if(!Character.isDigit(candidateSolution.charAt(i)))	return -1; 
		}
		
		//row validity
		ArrayList<String> rows = new ArrayList<>();
		rows.add(candidateSolution.substring(0, 8));
		rows.add(candidateSolution.substring(9, 17));
		rows.add(candidateSolution.substring(18, 26));
		rows.add(candidateSolution.substring(27, 35));
		rows.add(candidateSolution.substring(36, 44));
		rows.add(candidateSolution.substring(45, 53));
		rows.add(candidateSolution.substring(54, 62));
		rows.add(candidateSolution.substring(63, 71));
		rows.add(candidateSolution.substring(72, 80));
		
		if(rows.subList(1, 9).contains(rows.get(0))) return -3;
		
		
		//subgrid validity
		return -2;
	}
}
