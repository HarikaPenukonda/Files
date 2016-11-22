package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public void writeData() throws FileNotFoundException, IOException {
		try (FileWriter fout = new FileWriter("e:/test.txt")) {
		//try (FileOutputStream fout = new FileOutputStream("e:/test.txt")) {
		
			String str;
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter data:");
			str = sc.nextLine(); //it takes complete "Hello World" including space
			//str = sc.next(); //it takes only "Hello" it wont take the data after the space
			fout.write(str);
		}
	}

	public static void main(String[] args) {
		FileWriteDemo f1 = new FileWriteDemo();
		try {
			f1.writeData();
	
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
