import java.util.Scanner;

public class Bicycle {
	/*
	 * Name: Akarsh Purpose: To learn objects Date: 10/21/2020
	 */

	static Scanner input = new Scanner(System.in);
	
	public static int howMany;

	// instance variables
	private String colour;
	private String brand;
	private double height;
	private double length;
	private double width;
	private int gears;
	private int tireSize;

//Bicycle

	//Constructors
	public Bicycle() {
		colour = "blue";
		brand = "Super Cycle";
		height = 22;
		length = 70.5;
		width = 3;
		gears = 21;
		tireSize = 26;
		
		//increment howMany in the constructor(s)
		howMany++;
	}

	public Bicycle(String colour, String brand, int height, double length, double width, int gears, int tireSize) {
		this.colour = colour;
		this.brand = brand;
		this.height = height;
		this.length = length;
		this.width = width;
		this.gears = gears;
		this.tireSize = tireSize;
		
		//increment howMany in the constructor(s)
		howMany++;
	}

	//getters
	public String getColour() {
		// returns the value of the instance variable colour
		return colour;
	}// getColour

	public String getBrand() {
		// returns the value of the instance variable brand
		return brand;
	}// getBrand

	public double getHeight() {
		// returns the value of the instance variable height
		return height;
	}// getHeight

	public double getLength() {
		// returns the value of the instance variable length
		return length;
	}// getLength

	public double getWidth() {
		// returns the value of the instance variable width
		return width;
	}// getWidth

	public int getGears() {
		// returns the value of the instance variable width
		return gears;
	}// getGears
	
	public int getTireSize() {
		// returns the value of the instance variable width
		return tireSize;
	}// getTireSize

	
	//setters
	public void setColour(String colour) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.colour = colour;
	}// setColour

	public void setBrand(String brand) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.brand = brand;
	}// setBrand

	public void setHeight(double height) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.height = height;
	}// setHeight

	public void setLength(double length) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.length = length;
	}// setLength

	public void setWidth(double width) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.width = width;
	}// setWidth

	public void setGears(int gears) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.gears = gears;
	}// setGears
	
	public void setTireSize(int tireSize) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.tireSize = tireSize;
	}// setTireSize

	
	//Instance methods
	public String suitableSurface(int tireSize) { //calculates how many pages user can write 

		if(tireSize==27) {
			return "road";
		}
		else if(tireSize==26 || tireSize==29) {
			return "mountain";
		}
		else if(tireSize>29){
			return "off-road";
		}
		else {
			return "bike park";
		}

	}//suitableSurface

	public boolean standOpen() { //checks to see pen open/close

		boolean open = false; //initially close

		String answer = null;

		System.out.println("Is the stand open (yes/no)? ");

		answer = input.next(); //asks user for open/close status

		if (answer.equalsIgnoreCase("yes")) {
			open = true;
		}

		return open;
	}//standOpen

	public double speedCombinations(int gears) { //how many speed combinations are there

		return Math.pow((gears/2), (gears/2));
	}//penStatus

	public String dimensions(double height, double length, double width) { //dimensions of bike

		return length +"x" +width +"x"+ height;
	}//volume

	public double heightCompatible(double height) {

		return height+50; //formula to see which height is compatible
	}//heightCompatible
	
	//displaying objects
	public String toString() {
		return ("This bike is made by "+brand+ " and it is "+colour+". It has a length of "+length+", a width of "+width+", and a height of "+height+". It has "+
	gears+".");
	} //toString
	
	//equals method
	public boolean equals (Bicycle bicycle) {
		if (this.height == bicycle.height && this.width == bicycle.width && this.length == bicycle.length && this.brand == bicycle.brand && this.colour == bicycle.colour) {
			return true;
		}
		else {
			return false;
		}
	} //equals

}//Bicycle



//Bicycle class above and the code below tests the class above.





public class BicycleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first object
		Bicycle mainBike;
		mainBike = new Bicycle();
		
		//second object
		Bicycle extraBike;
		extraBike = mainBike;
		
		//assign values to variables of first object
		mainBike.setColour("orange");
		mainBike.setBrand("Nike");
		mainBike.setHeight(23);
		mainBike.setLength(65);
		mainBike.setWidth(3);
		mainBike.setGears(14);
		extraBike.setTireSize(27);
		
		//check if equal
		System.out.println(mainBike.equals(extraBike));

		
		//print the first object
		System.out.println(mainBike.getColour());
		System.out.println(mainBike.getBrand());
		System.out.println(mainBike.getHeight());
		System.out.println(mainBike.getLength());
		System.out.println(mainBike.getWidth());
		System.out.println(mainBike.getGears());
		System.out.println(mainBike.getTireSize());
		
		//print the second object
		System.out.println(extraBike.getColour());
		System.out.println(extraBike.getBrand());
		System.out.println(extraBike.getHeight());
		System.out.println(extraBike.getLength());
		System.out.println(extraBike.getWidth());
		System.out.println(extraBike.getGears());
		System.out.println(extraBike.getTireSize());
		
		//test instance methods
		System.out.println(extraBike.suitableSurface(extraBike.getTireSize()));
		System.out.println(extraBike.standOpen());
		System.out.println(extraBike.speedCombinations(extraBike.getGears()));
		System.out.println(extraBike.dimensions(extraBike.getHeight(),extraBike.getLength(),extraBike.getWidth()));
		System.out.println(extraBike.heightCompatible(extraBike.getHeight()));
		
		//test objects
		System.out.println(mainBike.toString());
		System.out.println(mainBike.equals(extraBike));
		
		//howMany
		System.out.println(Pen.howMany);
	}//main

}//

