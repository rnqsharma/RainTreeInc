import java.io.File;
import java.util.Scanner;

public class MakeReport {
	public static void main(String args[]) {
		
		// All the log files are int he resources folder
		String path = "resources/logFiles";
		final File folder = new File(path);
		Scanner cin = new Scanner(System.in);
		
		// Inout from the User
		System.out.println("Enter the date range for which you want to see the report");
		
		//Date format to be in "DD-MM"
		System.out.println("(Date Format Should be DD-MM)");
		System.out.print("Enter TO date ");
		//Gets the I/P
		String getUserDateInputFrom = cin.nextLine();
		System.out.println();
		System.out.print("Enter FROM date ");
		String getUserDateInputTo =  cin.nextLine();
		
		// Formatting and Reading is done here
		ReadFile read = new ReadFile(getUserDateInputFrom, getUserDateInputTo);
		read.listFilesForFolder(folder);
	}
}
