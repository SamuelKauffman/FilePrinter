import java.io.*;
import java.util.Scanner;


public class FirstFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			File f = new File("joe.dat");
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found" + e.getMessage());
		}
	}

}
