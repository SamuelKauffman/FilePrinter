import java.io.*;
import java.util.Scanner;

public class SecondFile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File f = new File("test.dat");
			Scanner scanner = new Scanner(f);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException("File not found");
		}

	}
}
