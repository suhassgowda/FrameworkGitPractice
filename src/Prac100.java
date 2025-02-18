import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Prac100 {
	public static void main(String[] args) {
		int a = 100;
		int b = 160;
		int c = 190;
		
		if(a>b && a>c) {
			System.out.println(a);
			
		}else if(b>a && b>c) {
			System.out.println(b);
		}else if(c>b && c>a) {
			System.out.println(c);
		}
		
		
	} 
}
