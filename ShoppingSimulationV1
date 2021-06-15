import java.util.*; //import library
public class shoppingSimulationV1 {
/*Name: Akarsh Singhal
 *Date: 2020-09-12
 *Purpose: make a shopping list program
 */
	
	//initiate static variables
	static Scanner input = new Scanner(System.in); //initiate scanner to get inputs
	static double prices[] = {24.99, 6.99, 1.99, 2.49, 19.99, 49.99, 8.49, 9.99, 0.99, 5.99}; 
	static String items[] = {"PhoneCase", "ChickenMcWrap", "PotatoChips", "ChocolateBar", "SunGlasses", "LapTopCase", "WaterBottle", "Headphones", "BubbleGum", "KeyChain"};
	static double buyingPrices[] = new double[10];
	static double budget = 0;
	
	public static void main(String[] args) {
		String answer;
		
		do {
		printInventory(); //prints the inventory
		getBudget(); //asks for budget
		int itemNumber = getNumItems(); //amount of item user wants to buy
		receipt(nameItems(itemNumber), quantityItems(itemNumber), itemNumber, buyingPrices ); //receipt
		
		System.out.println();
		System.out.println("Thanks for your purchase! Would you like to shop again, please answer using (yes/no): ");
		answer = input.next();// repeat
		
		}while (answer.equals("yes"));
	}//main
	
	public static void printInventory() {
		System.out.println("Welcome to the Online Shop!"); //welcomes user
		System.out.println("");
		System.out.println("Item Name"+"\t"+"Price"); //displays prices+details
		System.out.println(".....................");
		
		for (int i = 0; i<10; i++) {
			System.out.println(items[i]+"\t"+prices[i]);
		}
		
	}//printInventory
	
	public static int getNumItems() { //asks user for the amount of items they want to purchase
		System.out.println("");
		System.out.println("How many items would you like? ");
		int numItems = input.nextInt();
		
		return numItems;
	}//getNumItems
	
	public static void getBudget() { //asks user for spending budget
		System.out.println();
		System.out.println("Enter your budget: ");
		budget = input.nextDouble();
	}//getBudget
	
	public static String[] nameItems(int numOfItems) { //asks user for the items they want
		String[] itemNames = new String[numOfItems];
		
		for (int i = 0; i<numOfItems; i++) {
			System.out.println("Enter the name of item "+(i+1));
			itemNames[i] = input.next();
			
			switch(itemNames[i].toLowerCase()) { //matches prices according to the product
			case "phonecase":
				buyingPrices[i] = 24.99;
				break;
			case "chickenmcwrap":
				buyingPrices[i] = 6.99;
				break;
			case "potatochips":
				buyingPrices[i] = 1.99;
				break;
			case "chocolatebar":
				buyingPrices[i] = 2.49;
				break;
			case "sunglasses":
				buyingPrices[i] = 19.99;
				break;
			case "laptopcase":
				buyingPrices[i] = 49.99;
				break;
			case "waterbottle":
				buyingPrices[i] = 8.49;
				break;
			case "headphones":
				buyingPrices[i] = 9.99;
				break;
			case "bubblegum":
				buyingPrices[i] = 0.99;
				break;
			case "keychain":
				buyingPrices[i] = 5.99;
				break;
			default: //product not in stock
				System.out.println("Sorry that product is not available at the moment. Please check again next week.");
				break;
			}
		}
		return itemNames;
		
	}//nameItems
	
	
	public static int[] quantityItems(int numOfItems) { //asks user for the quantity of each item
		int[] itemQuantity = new int[numOfItems];
		
		for (int i = 0; i<numOfItems; i++) {
			System.out.println("Enter the quanitity of item "+(i+1));
			itemQuantity[i] = input.nextInt();
		}
		return itemQuantity;
		
	}//quantityItems
	
	public static void receipt(String []itemNames, int []itemQuantity, int numOfItems, double[] unitPrice) { //gives the user their shopping receipt
		System.out.println("Qty"+"\t"+"Description"+"\t"+"Unit Price"+"\t"+"Price");
		double sum = 0;
		double tax = 0;
		
		for (int i=0; i<numOfItems;i++) {
			System.out.println(itemQuantity[i]+"\t"+itemNames[i]+"\t"+unitPrice[i]+"\t"+"\t"+Math.round((unitPrice[i]*itemQuantity[i]) * 100.0) / 100.0); 
			sum = sum+(unitPrice[i]*itemQuantity[i]);
		}
		tax = Math.round((sum*0.13) * 100.0) / 100.0;
		double grandTotal = Math.round((sum+tax) * 100.0) / 100.0; //finalizes amount
		System.out.println("\t"+"SubTotal"+"\t"+"\t"+"\t"+Math.round(sum * 100.0) / 100.0);
		System.out.println("\t"+"13% Tax"+"\t"+"\t"+"\t"+"\t"+tax);
		System.out.println("\t"+"Grand Total"+"\t"+"\t"+"\t"+grandTotal);
		System.out.println();
		
		if (grandTotal<=budget) { //budget met
			System.out.println("Your total purchase meets your budget.");
		}
		else { //budget not met
			System.out.println("You total purchase does not meet your budget.");
		}
		
	}//receipt

}





//The code below is related to the code above. Paste the code above and below in seperate files to run.









import java.util.Scanner;

public class OneDArrayTask1 {
	/*
	 * Name: Akarsh Date: 9/16/2020 Purpose: to create a shopping list
	 */

	static Scanner input = new Scanner(System.in);
	static double budget = 0;
	static double grandTotal;

	public static void main(String[] args) {

		String[] itemsList = { "PhoneCase", "ChickenMcWrap", "PotatoChips", "ChocolateBar", "SunGlasses", "LapTopCase",
				"WaterBottle", "Headphones", "BubbleGum", "KeyChain" };

		double[] priceList = { 24.99, 6.99, 1.99, 2.49, 19.99, 49.99, 8.49, 9.99, 0.99, 5.99 };

		String  answer;
		
		do {
		printInventory(itemsList, priceList);

		getBudget();
		int numItems = getNumItems();

		int cartQty[] = new int[numItems];
		String cartItems[] = new String[numItems];
		double cartPrices[] = new double[numItems];

		for (int index = 0; index < numItems; index++)

		{
			System.out.println();
			System.out.println("Item #" + (index + 1) + ": ");

			cartItems[index] = getNameOfItem();

			int place = checkInventory(cartItems[index], itemsList);

			if (place < 0) {
				System.out.println(cartItems[index] + " is not in the inventory.");
			} else {
				cartItems[index] = itemsList[place];
				cartQty[index] = getQuantity(cartItems[index]);
				cartPrices[index] = priceList[place];
			}

		}

		discount();
		
		System.out.println("Shopping Cart");
		receipt(cartItems, cartQty, numItems, cartPrices);
		
		payment();
		
		System.out.println("Thanks for your purchase! Would you like to shop again, please answer using (yes/no): ");
		answer = input.next();// repeat
		
		}while (answer.equals("yes"));

	}// main

	public static void getBudget() { // asks user for spending budget
		System.out.println();
		System.out.println("Enter your budget: ");
		budget = input.nextDouble();
	}// getBudget

	public static void receipt(String[] itemNames, int[] itemQuantity, int numOfItems, double[] unitPrice) { 
		System.out.println("Qty" + "\t" + "Description" + "\t" + "Unit Price" + "\t" + "Price");
		double sum = 0;
		double tax = 0;

		for (int i = 0; i < numOfItems; i++) {
			System.out.println(itemQuantity[i] + "\t" + itemNames[i] + "\t" + unitPrice[i] + "\t" + "\t"
					+ Math.round((unitPrice[i] * itemQuantity[i]) * 100.0) / 100.0);
			sum = sum + (unitPrice[i] * itemQuantity[i]);
		}
		tax = Math.round((sum * 0.13) * 100.0) / 100.0;
		grandTotal = Math.round((sum + tax) * 100.0) / 100.0; // finalizes amount
		System.out.println("\t" + "SubTotal" + "\t" + "\t" + "\t" + Math.round(sum * 100.0) / 100.0);
		System.out.println("\t" + "13% Tax" + "\t" + "\t" + "\t" + "\t" + tax);
		System.out.println("\t" + "Grand Total" + "\t" + "\t" + "\t" + grandTotal);
		System.out.println();

		if (grandTotal <= budget) { // budget met
			System.out.println("Your total purchase meets your budget.");
			System.out.println();
		} else { // budget not met
			System.out.println("You total purchase does not meet your budget.");
			System.out.println();

		}

	}// receipt
	
	public static void discount() {
		System.out.println();
		System.out.println("Would you like to apply a discount code (yes/no)? ");
		String discountAnswer = input.next();
		
		if (discountAnswer.equals("yes")) {
			System.out.println("Enter the code: ");
			String codeEntered = input.next();
			
			if (codeEntered.equalsIgnoreCase("shopping")) {
				grandTotal = grandTotal - (grandTotal*0.20);
				System.out.println("20% discount applied!");
				System.out.println();
			}
			else {
				System.out.println("Sorry the code is incorrect.");
			}
			
		}
		else {
		}
	}

	public static void printInventory(String[] items, double[] prices) {
		System.out.println("Items\t\t\tPrice");
		System.out.println("-------------------------------");
		for (int index = 0; index < items.length; index++) {
			System.out.println(items[index] + "\t\t" + prices[index]);
		} // for

	}// printInventory

	public static int getNumItems() {
		System.out.print("How many items would you like to purchase?: ");
		System.out.println();
		int numOfItems = input.nextInt();
		return numOfItems;
	}// getNumItems

	// Get name of item
	public static String getNameOfItem() {
		System.out.print("Name of item: ");
		String itemWanted = input.next();
		return itemWanted;
	}
	
	public static void payment() {
		 System.out.println();
		 System.out.println("Do you want to pay by cash or card? ");
		 String paymentMethod = input.next();
		 
		 if (paymentMethod.equalsIgnoreCase("cash")) {
			 System.out.println();
			 System.out.println("Please pay when delivery man delivers your items.");
			 System.out.println();
		 }
		 else if(paymentMethod.equalsIgnoreCase("card")) {
			 System.out.println();
			 System.out.println("Enter card holders full name: ");
			 String cardName = input.nextLine();
			 System.out.println("Enter card number: ");
			 double cardNum = input.nextDouble();
			 System.out.println("Enter the cvc code: ");
			 int cardCvc = input.nextInt();
			 System.out.println("Approved!");
			 System.out.println();
		 }
		 else {
			 System.out.println();
			 System.out.println("System Error");
			 System.out.println();
		 }
	}

	// Check inventory return the index
	public static int checkInventory(String itemPicked, String[] items) {

		int location = -7;
		for (int index = 0; index < items.length; index++) {
			if (items[index].equalsIgnoreCase(itemPicked)) {
				location = index;
			} // if
		} // for
		return location;

	}// checkInventory

	public static int getQuantity(String itemPicked) {
		System.out.print("How many " + itemPicked + " would you like to purchase?: ");
		int quantity = input.nextInt();
		return quantity;
	}

}// ShoppingTask
