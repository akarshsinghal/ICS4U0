public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][]newArray;
		
		newArray = new double[5][7];
		
		System.out.println("\t\t"+"OCTOBER CALENDAR");
		System.out.println("\t\t"+"----------------");
		System.out.println("Thurs\t"+"Fri\t"+"Sat\t"+"Sun\t"+"Mon\t"+"Tues\t"+"Wed\t");
		
		calendar(newArray);
		printTwoD(newArray);
		
		System.out.println();
		System.out.println("Numbers ending in .5 are the days you go to school!")
	}
		
	public static void calendar(double[][] twoD) {
		
		double day = 1;
		
		for (int row = 0; row<5;row++) {
			
			for (int col = 0; col<7;col++) {
			    
				twoD[row][col] = day++;
				
				if (day > 31) {
                    break;
                }
			}
		
		}
	}



	public static void printTwoD(double[][] twoD) {
		// Prints the elements of a two dimensional array in the form of a table with
		// rows and columns
		double []arry = {1,2,8,9,15,16,22,23,29,30,-1,-1,-1,-1};
		int i = 0;
		for (int row = 0; row < 5; row++) {

			for (int col = 0; col < 7; col++) {
			    if (twoD[row][col]==arry[i]){
			        System.out.print((twoD[row][col]+0.5) + "\t");
			        i++;
			    }
			    else{
				System.out.print(twoD[row][col] + "\t");
				
			    }
			   
			} // for col
			System.out.println();

		} // for row
	}// printTwoD

}








import java.util.Random;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][]newArray;
		
		newArray = new String[8][8];
		
		String val = "O";
		
		calendar(newArray,val);
		printTwoD(newArray);
		
	}
		
	public static void calendar(String[][] twoD, String value) {
	    
	    String blastSpot = "X";
		for (int row = 0; row<8;row++) {
			
			for (int col = 0; col<8;col++) {
			    
			twoD[row][col] = value;
				

			}
			int mine = (int) (Math.random() * 8);
		    twoD[row][mine] = blastSpot;
		}
	}



	public static void printTwoD(String[][] twoD) {
		// Prints the elements of a two dimensional array in the form of a table with
		// rows and columns
		
		for (int row = 0; row < 8; row++) {

			for (int col = 0; col < 8; col++) {

				System.out.print(twoD[row][col] + "\t");
			   
			} // for col
			System.out.println();

		} // for row
	}// printTwoD

}
