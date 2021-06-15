import javax.swing.*;

public class ShoppingGUI {
	/*Name: Akarsh
	 *Purpose: Shopping GUI
	 *Date: 2020-11-12
	 */

	//creates the private variables needed for labels, checkbox, and buttons
	private JLabel welcomeMessage;
    private JLabel welcomeInstructions;
    private JCheckBox customerStatus;
    private JLabel foodHeading;
    private JLabel otherHeading;
    private JRadioButton beansOption;
    private JRadioButton ketchupOption;
    private JRadioButton orangeOption;
    private JRadioButton appleOption;
    private JRadioButton tomatoOption;
    private JRadioButton broomOption;
    private JRadioButton towelOption;
    private JRadioButton tissueOption;
    private JRadioButton phoneOption;
    private JRadioButton pencilOption;
    private JButton submitSelection;
    private JTextField userInfo;
    
    public ShoppingGUI() { //constructor
    	//instantiates and assignes values to the buttons, labels, and checkbox
    	JFrame f = new JFrame("Shopping Program");  //creates a frame
    	
    	//messages to display
    	welcomeMessage = new JLabel ("Welcome to Akarsh's Shopping Center!");
        welcomeInstructions = new JLabel ("To begin your shopping experience, select all items you need...");
        
        //checkbox asks user if they are new
        customerStatus = new JCheckBox ("Returning Customer?");
        
        //headings of type of item
        foodHeading = new JLabel ("Food");
        otherHeading = new JLabel ("Other Items");
        
        //items
        beansOption = new JRadioButton ("Beans ($2.00)");
        ketchupOption = new JRadioButton ("Ketchup ($1.50)");
        orangeOption = new JRadioButton ("Orange ($0.50)");
        appleOption = new JRadioButton ("Apple ($0.75)");
        tomatoOption = new JRadioButton ("Tomato ($1.00)");
        broomOption = new JRadioButton ("Broom ($5.00)");
        towelOption = new JRadioButton ("Towel ($1.00)");
        tissueOption = new JRadioButton ("Tissue ($0.50)");
        phoneOption = new JRadioButton ("Phone ($99.99)");
        pencilOption = new JRadioButton ("Pencil ($0.50)");
        
        //info and submission
        submitSelection = new JButton ("Submit");
        userInfo = new JTextField ("Enter name and address.");

        //adjust size and set layout of the frame
        f.setSize(944,574); 
        f.setLayout(null);  

        //add components from above onto the frame
        f.add (welcomeMessage);
        f.add (welcomeInstructions);
        f.add (customerStatus);
        f.add (foodHeading);
        f.add (otherHeading);
        f.add (beansOption);
        f.add (ketchupOption);
        f.add (orangeOption);
        f.add (appleOption);
        f.add (tomatoOption);
        f.add (broomOption);
        f.add (towelOption);
        f.add (tissueOption);
        f.add (phoneOption);
        f.add (pencilOption);
        f.add (submitSelection);
        f.add (userInfo);

        //set the size and x,y coordinates of the components
        welcomeMessage.setBounds (350, 40, 230, 25);
        welcomeInstructions.setBounds (285, 80, 360, 25);
        customerStatus.setBounds (35, 45, 150, 20);
        foodHeading.setBounds (175, 160, 100, 25);
        otherHeading.setBounds (640, 155, 100, 25);
        beansOption.setBounds (155, 200, 120, 25);
        ketchupOption.setBounds (155, 230, 120, 25);
        orangeOption.setBounds (155, 260, 120, 25);
        appleOption.setBounds (155, 290, 100, 25);
        tomatoOption.setBounds (155, 320, 120, 25);
        broomOption.setBounds (620, 195, 120, 25);
        towelOption.setBounds (620, 225, 120, 25);
        tissueOption.setBounds (620, 255, 120, 25);
        phoneOption.setBounds (620, 285, 120, 25);
        pencilOption.setBounds (620, 315, 120, 25);
        submitSelection.setBounds (422, 460, 100, 25);
        userInfo.setBounds (370, 430, 195, 25);
        
        f.setLayout(null);    //in java setting the layout to null is absolute positioning, using this you can set the layout on your own
        f.setVisible(true);    //makes frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //closes when 'x' is pressed
    }//ShoppingGUI
    
	public static void main(String[] args) {

		new ShoppingGUI(); //calls the contructor method
		
	}//main
	
}//ShoppingGUI

