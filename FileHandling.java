import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) 
	{
		//code to create new file
		File myFile=new File("src/cwh.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			System.out.println("File not created");
			e.printStackTrace();
		}
		
		//code to write in file
		try {
			FileWriter fileWriter=new FileWriter(myFile);
			fileWriter.write("This is a text");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
