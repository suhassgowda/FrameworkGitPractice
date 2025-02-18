import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GetFileinfo {
	public static void main(String[] args) {

			File f1 = new File("C:/Users/Suhas S/OneDrive/Documents/pracfile.txt");
			if(f1.exists()) {
			System.out.println(f1.canRead());
			System.out.println(f1.canWrite());
			System.out.println(f1.getAbsolutePath());
			System.out.println(f1.getName());
			System.out.println(f1.length());
			System.out.println(f1.list());
			System.out.println(f1.getFreeSpace());
			}
		
	}

}
