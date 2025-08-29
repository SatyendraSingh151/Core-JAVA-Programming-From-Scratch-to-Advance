package Excdeption_File_Handeling;

// importing the io File class
import java.io.File;

// take the FileWriter to create the file
import java.io.FileWriter;
import java.io.IOException;
// take the FileReader to read the file 
import java.io.FileReader;




public class File_Creation_Write_Read {

	public static void main(String[] args) {

// 	creating the file object reference to use the createNewFile()	
		File f = new File("D:\\m215\\Test.txt");
		
		try {
			f.createNewFile();
			
//			creating the FileWriter object to write in the file
			FileWriter fw = new FileWriter("D:\\m215\\Test.txt");
			
			fw.write("Hello, this is the text written into the file which is created.");
//			using the flush() to push the data into the created file
			fw.flush();
			
		    FileReader fr = new FileReader(f);
		    int i = fr.read();
		    while(i!=-1) {
		    	System.out.print((char)i);
		    	i=fr.read();
		    }
			
			
		} catch (IOException e) {
			System.out.println("Please provide the correct file name.");
			e.printStackTrace();
		}
		
		

	}

}
