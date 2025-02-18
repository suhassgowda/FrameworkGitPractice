import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriteFile {
	public static void main(String[] args) {
		try {
			FileWriter f1 = new FileWriter("C:/Users/Suhas S/OneDrive/Documents/pracfile.txt");
			f1.write("Hello suhas very Good morning");
			f1.close();
			System.out.println("success");
		}catch(IOException e) {
			System.out.println("error is seen");
			e.printStackTrace();
			
		}
	}

}
