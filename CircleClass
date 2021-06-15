
public class Circle {
	//Name: Akarsh
	//Purpose: circle class
	//Date: 2020-10-28

	private double xCooord; // x-coordinate of the centre
	private double yCooord; // y-coordinate of the centre
	private double radius; // radius
	private double distance; // distance variable (Part A Question B)
	private double centreSeperation;// center separation variable (Part A Question C)
	private double minDistance; // minimum distance variable (Part A Question D)

	// Constructors
	public Circle() { // no parameters (Part C Question A)
		xCooord = 0;
		yCooord = 0;
		radius = 1;
	}//Circle

	public Circle(int xCooord, int yCooord, int radius) { // three parameters (Part C Question B)
		this.xCooord = xCooord;
		this.yCooord = yCooord;
		this.radius = radius;
	}//Circle

	public Circle(double xCooord, double yCooord, double radius) { // three double parameters (Part C Question C)
		this.xCooord = xCooord;
		this.yCooord = yCooord;
		if (radius < 0) { //if radius is negative
			this.radius = radius * -1;
		} else {
			this.radius = radius;
		}

	}//Circle

	public Circle(Circle circle) { // object parameter (Part C Question D)
		this.xCooord = circle.xCooord;
		this.yCooord = circle.yCooord;
		this.radius = circle.radius;
	}//Circle

	// accessors
	public double getXCooord() {
		// returns the value of the instance variable type
		return xCooord;
	}// getXCooord

	public double getYCooord() {
		// returns the value of the instance variable material
		return yCooord;
	}// getYCooord

	public double getRadius() {
		// returns the value of the instance variable height
		return radius;
	}// getRadius

	// mutators
	public void setXCooord(double xCooord) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.xCooord = xCooord;
	}// setXCooord

	public void setYCooord(double yCooord) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.yCooord = yCooord;
	}// setYCooord

	public void setRadius(double radius) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		this.radius = radius;
	}// setRadius

	// Pat A Question B
	public void setDistance(int xCord, int yCord) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		double distance = Math.sqrt((xCord * xCord) + (yCord * yCord));
		this.distance = distance;
	}//setDistance

	// Part A Question C
	public void setCentreSeperation(int xCord1, int yCord1, int xCord2, int yCord2) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		double insideSqrt = (Math.pow((xCord2 - xCord1), 2)) + (Math.pow(yCord2 - yCord1, 2));
		double centreSeperation = Math.sqrt(insideSqrt);
		System.out.println(centreSeperation);
		this.centreSeperation = centreSeperation;
	}//setCentreSeperation

	// Part A Question D
	public void setMinDistance(double distanceOfCenters, int radius1, int radius2) {
		/*
		 * Sets the value of the implicit objects type to the value passed to the
		 * parameter
		 */
		minDistance = distanceOfCenters - (radius1 + radius2);
		this.minDistance = minDistance;
	}//setMinDistance

	// Part B Question A
	public double area(double radius) { //finds area
		return 3.14 * (Math.pow(radius, 2));
	}//area

	// Part B Question B
	public Circle smaller(Circle circle) { 
		Circle smallerCircle = new Circle(0, 0, 0);
		if (this.radius > circle.radius) {
			smallerCircle.radius = this.radius - circle.radius;
		} else if (this.radius < circle.radius) {
			smallerCircle.radius = circle.radius - this.radius;
		}
		return smallerCircle;
	}//smaller

	//Part B Question C
	public boolean isInside(Circle circle) {//checks if circle is inside
		if (centreSeperation + this.radius < circle.radius) {
			return true;
		} else {
			return false;
		}
	}//isInside

	//Part B Question G
	public boolean equals(Circle circle) {
		if (this.radius == circle.radius) {
			return true;
		} else {
			return false;
		}
	}//equals

	//Part B Question H
	public String toString() {
		return ("Centre: (" + this.xCooord + "," + this.yCooord + ")\tRadius: " + this.radius);
	} // toString

	//Part D
	public double areaRatio(Circle circle) {
		double areaCircle1 = this.area(radius);
		double areaCircle2 = this.area(radius);
		double areaRatio = areaCircle1 / areaCircle2;
		return areaRatio;
	}//areaRatio
}//Circle





//Circle class is above and the class below tests it.






public class CircleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Part A Question A
		Circle circle1;
		circle1 = new Circle(1,2,4);
		
		//Part A Question A
		Circle circle2;
		circle2 = new Circle(-2,0,2);
		
		//Part B Question B
		Circle circle3;
		circle3 = circle1.smaller(circle2);
		
		//Area test
		System.out.println(circle1.area(circle1.getRadius()));
		
		//Contain method test
		boolean contained = circle1.isInside(circle2);
		System.out.println("Contained: "+contained);
		
		//Equals test
		System.out.println(circle1.equals(circle2));//B.d
		System.out.println(circle2.equals(circle3));//B.e
		
		//toString test
		System.out.println(circle1.toString());
		
		//areaRatio test
		System.out.println(circle1.areaRatio(circle2));
	}

}


