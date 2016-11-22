package files;

import java.io.File;
import java.io.IOException;

public class DisplayList {
	
	public void showList() {
	
		File dir = new File("e:/pages");
		String [] list = dir.list();
		for(String lst:list)
		{
			System.out.println(lst);
		}
	    File[] list1 = dir.listFiles();
		for(File f1:list1)
		{
			if(f1.isDirectory())
			{
				System.out.println(f1+"is a dir ");
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		DisplayList files = new DisplayList();
		files.showList();
	}

}
