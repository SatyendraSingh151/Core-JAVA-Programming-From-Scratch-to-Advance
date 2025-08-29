package IOException_FileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Write_And_Read_File {

	public static void main(String[] args) {
		
		File f =new File("D:\\m215\\Test.txt"); // giving the file location and the name
		
//		writing something in the file
		try {
			FileWriter fw = new FileWriter(f);
//			writing in the file
			fw.write("This is the new text written in the existing file");
//			sending the data to the file given
			fw.flush();
			
//			now reading the file
			FileReader fr = new FileReader(f);
//			this has the read() of the int type return 
			int i = fr.read(); 
//			System.out.print((char)i);
			// by default it takes the first character in the form of int 
//			now by the help of the loop we are going to access the whole text by doing the typecast to the char type
			while(i!=-1) {
				System.out.print((char)i);
				i=fr.read();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
