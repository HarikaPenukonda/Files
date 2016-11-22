
//copying the data from one file to another file i.e read the data from one file 
//and write the data to another file

package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	
	public static void copyFile()
	{
		try
		{
			FileInputStream fin = new FileInputStream("e:/Test.txt");
			FileOutputStream fout = new FileOutputStream("f:/Test.txt");
			int i;
			while((i=fin.read())!= -1)
			{
				fout.write(i);
			}
		}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		
	}

	public static void main(String[] args) {
		copyFile();

	}

}
