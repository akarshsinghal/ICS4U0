import java.util.*;
import java.io.*;
import java.lang.*;

public class MethodsInUse {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader readFile;
		
		readFile = new BufferedReader (new FileReader ("C:\\Users\\Akarsh\\eclipse-workspace\\Home\\src\\namesList.txt"));

		System.out.println("Enter number of students: ");
		int numStudents = input.nextInt();

		String[] itemsList = new String [numStudents];
		
		for (int index = 0 ; index < itemsList.length ;index++)

				{

				itemsList [index] = readFile.readLine ();

				}

				readFile.close();
				
		addSuffix(itemsList);
		
		insertSubString(itemsList);
		
		reverseNames(itemsList);
	}


	public static String[] addSuffix(String[] studentList) {
		
		String studentListSuffix[] = new String[studentList.length];
		
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
		
		System.out.println("Original"+"\t"+"New");
		System.out.println(".........................");
		
		for (int index=0; index<studentList.length;index++) {
			
			endIndex = (float) Math.floor((studentList.length)/2);
			
			studentListSubString[index] = studentList[index].substring(0, (int) endIndex) + "cool"+studentList[index].substring((int) endIndex);
			System.out.println(studentList[index] + "\t"+ "\t"+ studentListSubString[index]);
		}
		
		return studentList;
	}
	
	public static String[] reverseNames(String[] studentList) {
		
		String studentListReverse[] = new String[studentList.length];
		
		System.out.println("Original"+"\t"+"New");
		System.out.println(".........................");
		
		for (int index=0; index<studentList.length;index++) {
			
			studentListReverse[index] = new StringBuffer(studentList[index]).reverse().toString();
			System.out.println(studentList[index] + "\t"+ "\t"+ studentListReverse[index]);
		}
		
		return studentList;
	}



}
