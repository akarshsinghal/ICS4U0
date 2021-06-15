import java.util.*;

public class Pen {
	/*
	 * Name: Akarsh Purpose: To learn objects Date: 10/21/2020
	 */

	static Scanner input = new Scanner(System.in);

	// instance variables
	private String type;
	private String material;
	private double height;
	private double length;
	private double width;
	private double writeLength;

//Pen

	public static int howMany;
	
	
	//Constructors
	public Pen() {
		type = "clicky";
		material = "wood";
		height = 0.5;
		length = 13;
		width = 0.5;
		writeLength = 200000;
		
		//increment howMany in the constructor(s)
		howMany++;
	}

	public Pen(String type, String material, int height, double length, double width, double writeLength) {
		this.type = type;
		this.material = material;
		this.height = height;
		this.length = length;
		this.width = width;
		this.writeLength = writeLength;
		
		//increment howMany in the constructor(s)
		howMany++;
	}

	//getters
	public String getType() {
		// returns the value of the instance variable type
		return type;
	}// getType

	public String getMaterial() {
		// returns the value of the instance variable material
		return material;
	}// getMaterial

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

	public double getWriteLength() {
		// returns the value of the instance variable width
		return writeLength;
	}// getInkAmount

	
	//setters
	public void setType(String type) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.type = type;
	}// setType

	public void setMaterial(String material) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.material = material;
	}// setMaterial

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

	public void setWriteLength(double writeLength) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.writeLength = writeLength;
	}// writeLength

	
	//Instance methods
	public double pagesWritable(double writeLength) { //calculates how many pages user can write 

		double pageLength = 529; //page length of a normal paper in cm

		return writeLength / pageLength;
	}//pagesWritable

	public boolean penOpen() { //checks to see pen open/close

		boolean open = false; //initially close

		String answer = null;

		System.out.println("Is the pen open (yes/no)? ");

		answer = input.next(); //asks user for open/close status

		if (answer.equalsIgnoreCase("yes")) {
			open = true;
		}

		return open;
	}//penOpen

	public double penStatus(double pages) { //how many pages still writable
		
		System.out.println("Enter pages written: ");
		int pagesWritten = input.nextInt(); //pages already written

		return pages - pagesWritten;
	}//penStatus

	public double volume(double height, double length, double width) { //volume calculation

		return length * width * height;
	}//volume

	public double inkCompatible(double volume) {

		return (volume / 2) / volume; //formula to see which ink is compatible
	}//inkCompatible
	
	//displaying objects
	public String toString() {
		return ("This pen is made of "+material+ " and it is "+type+". It has a length of "+length+", a width of "+width+", and a height of "+height+". It can write "+
	writeLength+"cm.");
	} //toString
	
	//equals method
	public boolean equals (Pen pen) {
		if (this.height == pen.height && this.width == pen.width && this.length == pen.length && this.material == pen.material && this.type == pen.type) {
			return true;
		}
		else {
			return false;
		}
	} //equals
	
	


}//Pen







//The class below runs the code above. This code was built to learn classes in Java.








public class PenTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//first object
		Pen favPen;
		favPen = new Pen();
		
		//second object
		Pen newPen;
		newPen = favPen;
		
		//assign values to variables of first object
		favPen.setType("clicky");
		favPen.setMaterial("wood");
		favPen.setHeight(2);
		favPen.setLength(3);
		favPen.setWidth(1);
		favPen.setWriteLength(200000);
		newPen.setType("button");
		
		//check if equal
		System.out.println(favPen.equals(newPen));

		
		//print the first object
		System.out.println(favPen.getType());
		System.out.println(favPen.getMaterial());
		System.out.println(favPen.getHeight());
		System.out.println(favPen.getLength());
		System.out.println(favPen.getWidth());
		System.out.println(favPen.getWriteLength());
		
		//print the second object
		System.out.println(newPen.getType());
		System.out.println(newPen.getMaterial());
		System.out.println(newPen.getHeight());
		System.out.println(newPen.getLength());
		System.out.println(newPen.getWidth());
		System.out.println(newPen.getWriteLength());
		
		//test instance methods
		System.out.println(newPen.pagesWritable(newPen.getWriteLength()));
		System.out.println(newPen.penOpen());
		System.out.println(newPen.penStatus((newPen.pagesWritable(newPen.getWriteLength()))));
		System.out.println(newPen.volume(newPen.getHeight(),newPen.getLength(),newPen.getWidth()));
		System.out.println(newPen.inkCompatible((newPen.volume(newPen.getHeight(),newPen.getLength(),newPen.getWidth()))));
		
		//test objects
		System.out.println(favPen.toString());
		System.out.println(favPen.equals(newPen));
		
		//howMany
		System.out.println(Pen.howMany);
	}//main

}//PenTester


