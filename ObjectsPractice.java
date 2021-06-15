
public class Pen {
	
	// instance variables
	String material;
	double height;
	double length;


}


//One class is above and one is below.

public class PenTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen favPen;
		favPen = new Pen();
		
		Pen newPen;
		newPen = new Pen();
		
		favPen.material = "wood";
		favPen.height = 2;
		favPen.length = 3;
		
		System.out.println(favPen.material);
		System.out.println(favPen.height);
		System.out.println(favPen.length);
		
		System.out.println(newPen.material);
		System.out.println(newPen.height);
		System.out.println(newPen.length);
	}

}




