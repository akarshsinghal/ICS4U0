import java.util.*;
import java.io.*;

public class readingFile {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader readFile;
		BufferedReader readFile1;
		
		readFile = new BufferedReader (new FileReader ("G:\\Semester 1\\src\\namesList.txt"));
		
		readFile1 = new BufferedReader (new FileReader ("G:\\Semester 1\\src\\colorList.txt"));

		int numStudents = 19;

		String[] itemsList = new String [numStudents];
		
		String[] colorList = new String [numStudents];
		
		for (int index = 0 ; index < itemsList.length ;index++)

				{

				itemsList [index] = readFile.readLine ();
				colorList [index] = readFile1.readLine();

				}

				readFile.close();
				readFile1.close();
		
		printList(itemsList);
		
		addSuffix(itemsList);
		
		insertSubString(itemsList);
		
		reverseNames(itemsList);
		
		favouriteColor(colorList, itemsList);
	}

	public static void printList(String[] oneD){
		for (int index = 0; index < oneD.length; index++){
			System.out.println(oneD[index]);
		}
	}
	

	public static String[] addSuffix(String[] studentList) {
		
		String studentListSuffix[] = new String[studentList.length];
		
		System.out.println();
		System.out.println("Original"+"\t"+"New");
		System.out.println(".........................");
		
		for (int index=0; index<studentList.length;index++) {
			studentListSuffix[index] = studentList[index] + "cool";
			System.out.println(studentList[index] + "\t"+ "\t"+ studentListSuffix[index]);
		}
		
		return studentList;
	}
	
	public static String[] insertSubString(String[] studentList) {
		
		String studentListSubString[] = new String[studentList.length];
		
		float endIndex;
		
		System.out.println();
		System.out.println("Original"+"\t"+"New");
		System.out.println(".........................");
		
		for (int index=0; index<studentList.length;index++) {
			
			endIndex = (float) Math.floor((studentList[index].length())/2);
			
			studentListSubString[index] = studentList[index].substring(0, (int) endIndex) + "cool"+studentList[index].substring((int) endIndex);
			System.out.println(studentList[index] + "\t"+ "\t"+ studentListSubString[index]);
		}
		
		return studentList;
	}
	
	public static String[] reverseNames(String[] studentList) {
		
		String studentListReverse[] = new String[studentList.length];
		
		System.out.println();
		System.out.println("Original"+"\t"+"New");
		System.out.println(".........................");
		
		for (int index=0; index<studentList.length;index++) {
			
			studentListReverse[index] = new StringBuffer(studentList[index]).reverse().toString();
			System.out.println(studentList[index] + "\t"+ "\t"+ studentListReverse[index]);
		}
		
		return studentList;
	}
	
	public static void favouriteColor(String[]favouriteColor, String[]studentList){
		System.out.println();
		System.out.println("Name"+"\t"+"\t"+"Favourite Color");
		System.out.println("..............................");
		
		for (int i=0;i<studentList.length;i++){
			System.out.println(studentList[i]+"\t"+"\t"+favouriteColor[i]);
		}
	}



}
