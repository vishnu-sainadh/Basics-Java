package files_and_streams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writetofile {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:FileHandlingNewFilef1.txt");
			// Writes this content into the specified file
			myWriter.write("Java is the prominent programming language of the millenium!");

			// Closing is necessary to retrieve the resources allocated
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
		}
	}
}
