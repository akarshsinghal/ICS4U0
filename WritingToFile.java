import java.util.*;
import java.io.*;

public class WritingFile {

	public static void main(String[] args)throws IOException {

		BufferedWriter writeFile;
		
		writeFile = new BufferedWriter (new FileWriter ("G:\\Semester 1\\src\\days.txt"));
		
		writeFile.write("Sunday");
		writeFile.newLine();
		
		String[] days = {"Monday", "Tuesday", "Wednesday"};
		
		for (int index=0; index<days.length;index++){
			writeFile.write(days[index]);
			writeFile.newLine();
			
		}
		
		
		writeFile.close();
	}

}


