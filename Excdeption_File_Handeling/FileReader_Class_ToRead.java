package Excdeption_File_Handeling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class FileReader_Class_ToRead {

	public static void main(String[] args) throws IOException /*throws FileNotFoundException -> this can be thrown to the caller*/{
//		to read the file
		File f = new File("D:\\m215\\car.txt");// this needs the location of the existing file
		
		try {
			FileReader fr = new FileReader(f);// this needs the reference of the file location
			int i = fr.read();
//			System.out.println((char)i); //  by default it takes the first character then by running the loop we will print all the characters
			while(i!=-1) /* here -1 represents that there is no more character left */{
				System.out.print((char)i);
				
//				again we will update the condition
				i=fr.read();			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
			e.printStackTrace();
		} 
	}
}


