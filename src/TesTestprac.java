import java.io.File;
import java.io.IOException;

public class TesTestprac {
	
	public static void main(String[] args) {
		
		try {
			File obj = new File("C:/Users/Suhas S/OneDrive/Documents/pracfile.txt");
			if(obj.createNewFile()) {
				System.out.println(obj.getName()+"  Created");
			}else {
				System.out.println("file exists");
			}
		}catch(IOException e){
			System.out.println("Error is seen");
			e.printStackTrace();
		}
	}

}
