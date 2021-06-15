//Task 1:

import java.util.Scanner;
public class TwoDArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]newArray;
		
		newArray = new int[4][4];
		
		assignValues(newArray, 1);
		printTwoD(newArray);

	}
	
	public static void assignValues(int[][] twoD, int value) {
		for (int row = 0; row<twoD.length;row++) {
			
			for (int col = 0; col<twoD[row].length;col++) {
				row = Math.
				twoD[row][col] = (row+1)*(col+1); 
				
			}
		}
	}
	public static void printTwoD(int[][] twoD) {
		// Prints the elements of a two dimensional array in the form of a table with
		// rows and columns
		System.out.println("This is what your " + twoD.length + " by " + twoD.length + " array looks like.");
		for (int row = 0; row < twoD.length; row++) {

			for (int col = 0; col < twoD[row].length; col++) {
				System.out.print(twoD[row][col] + "\t");
			} // for col
			System.out.println();

		} // for row
	}// printTwoD

}

//Task 2:


import java.util.Scanner;
public class TwoDArrayPractice {

	static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]newArray;
		
		newArray = new int[4][4];
		
		System.out.println(newArray.length);
		
		assignValues(newArray, 1);
		printTwoD(newArray);
		
		sumOfArray(newArray);
		sumOfSecondRow(newArray);
		sumOfLastCol(newArray);
		sumOfDiagonals(newArray);
		sumOfArrayUser(newArray);

	}
	
	public static void assignValues(int[][] twoD, int value) {
		for (int row = 0; row<twoD.length;row++) {
			
			for (int col = 0; col<twoD[row].length;col++) {
				
				twoD[row][col] = (row+1)*(col+1); 
				
			}
		}
	}
	public static void printTwoD(int[][] twoD) {
		// Prints the elements of a two dimensional array in the form of a table with
		// rows and columns
		System.out.println("This is what your " + twoD.length + " by " + twoD.length + " array looks like.");
		for (int row = 0; row < twoD.length; row++) {

			for (int col = 0; col < twoD[row].length; col++) {
				System.out.print(twoD[row][col] + "\t");
			} // for col
			System.out.println();

		} // for row
	}// printTwoD
	
	public static void sumOfArray(int[][] twoD) {
		int sum = 0;
		for (int row = 0; row<twoD.length; row++) {
			
			for (int col = 0; col<twoD[row].length; col++) {
				sum = sum + twoD[row][col];
			}
		}
		System.out.println(sum);
	}
	
	public static void sumOfSecondRow(int[][] twoD) {
		int sum = 0;
		for (int row = 1; row<2; row++) {
			
			for (int col = 0; col<twoD[row].length; col++) {
				sum = sum + twoD[row][col];
			}
		}
		System.out.println(sum);
	}
	
	public static void sumOfLastCol(int[][] twoD) {
		int sum = 0;
		for (int row = 0; row<twoD.length; row++) {
			
			for (int col = 3; col<twoD[row].length; col++) {
				sum = sum + twoD[row][col];
			}
		}
		System.out.println(sum);
	}
	
	public static void sumOfDiagonals(int[][] twoD) {
		int sum = 0;
		for (int row = 0; row<twoD.length; row++) {
			sum = sum + twoD[row][row];
		}
		System.out.println(sum);
	}
	
	public static void sumOfArrayUser(int[][] twoD) {
		int sum = 0;
		
		System.out.println("Row or Col: ");
		String ans = input.next();
		
		if (ans.equalsIgnoreCase("row")) {
			System.out.println("Eneter row: ");
			int rowAns = input.nextInt();
			
			for (int row = rowAns; row<rowAns+1; row++) {
				
				for (int col = 0; col<twoD[row].length; col++) {
					sum = sum + twoD[row][col];
				}
			}
		}
		else if(ans.equalsIgnoreCase("col")) {
			System.out.println("Eneter col: ");
			int colum = input.nextInt();
			
			for (int row = 0; row<twoD.length; row++) {
				
				for (int col = colum; col<colum+1; col++) {
					sum = sum + twoD[row][col];
				}
			}
		}
		
		
		System.out.println(sum);
	}

}


//Task 3:

public static void assignValues(int[][] twoD, int lower, int upper) {
		for (int row = 0; row<twoD.length;row++) {
			
			for (int col = 0; col<twoD[row].length;col++) {
				twoD[row][col] = (int) (Math.random()*(upper-lower))+lower;; 
				
			}
		}
	}

