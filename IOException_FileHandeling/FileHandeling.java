package IOException_FileHandeling;
/*
 * IOException -> this is the checked exception which we must fix as a developer
 * 
 * FileNotFoundException is the example of the IOException 
 * 
 * this is available in the java.io package
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling {

	public static void main(String[] args) /* throws IOException */ {
		File f = new File("D:\\m215\\car.txt");
		
		try {
//			creation of the file
			f.createNewFile();
			
//			writing in the file
			FileWriter fw = new FileWriter(f);
			fw.write("This is the demo text which I am learning here in the core java concept in the topic of file handling.");
			
//			by using the flush() we flush the data in the created file
			fw.flush();
			
//			reading the content of the file
			FileReader fr = new FileReader("D:\\m215\\car.txt");
			
//			we can read the file by the help of the read()
			   int i = fr.read();
			    while(i!=-1) {
			    	System.out.print((char)i);
			    	i=fr.read();
			    }
			
			
			
		
			
		}
		catch(IOException e) {
			System.out.println("I have handeled the exception, which is described as "+e);
		}
		
		
		

	}

}
