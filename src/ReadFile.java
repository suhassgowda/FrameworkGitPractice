import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
		File obj = new File("C:/Users/Suhas S/OneDrive/Documents/pracfile.txt");
		Scanner s1 = new Scanner(obj);
		while(s1.hasNextLine()){
			String data =s1.nextLine();
			System.out.println(data);
		}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
	}

}
