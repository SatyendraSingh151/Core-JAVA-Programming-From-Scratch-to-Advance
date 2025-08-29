package Excdeption_File_Handeling;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileCreation {

	public static void main(String[] args) /*throws IOException */{
		
		File f = new File("D:\\m215\\demo.txt");//here the file name is given in the location

//		here it throws the IOException, so we need to handle it here
		
		try {
			f.createNewFile();
			FileWriter fr = new FileWriter("D:\\m215\\demo.txt");
			fr.write("Hello, Satya you have done it. Now you are ready to move on");
			fr.flush();

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Please provide the valid path to the folder.");
		}
		
		
		
//		creating the FileWriter object for the write()

		
		

		
				
	}

}
