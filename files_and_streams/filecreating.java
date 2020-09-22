package files_and_streams;

import java.io.File;
import java.io.IOException;

public class filecreating {
	public static void main(String[] args) {
		try {
			// Creating an object of a file
			File myObj = new File("C:FileHandlingNewFilef1.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
