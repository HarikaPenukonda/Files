package files;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public void readData() throws IOException

	{
		try (FileReader fr = new FileReader("e:/test.txt")) {
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i); // to convert the ASCII values to
											// the characters
				// we use type casting method,println char goes to next line

				// System.out.println(i); // it gives the ASCII value of the
				// letters
			}
		}
	}

	public static void main(String[] args) {
		FileReadDemo f1 = new FileReadDemo();
		try {
			f1.readData();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
