package tema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

public class Decode {
	
	//decode output.txt
	
	static String line = " ";

	public static void decode1()
	{
		
		File file = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\output.txt");
		try {
		BufferedReader br = new BufferedReader(new FileReader(file));
		while ((line = br.readLine()) != null) {
			
			String decodedStuff = new String(Base64.getDecoder().decode(line));
			System.out.println(decodedStuff);
		}
		br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//decode output.bin
	
	static String line1 = " ";
	
	public static void decode2()
	{
		File file1 = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\output.bin");
		try {
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		while ((line1 = br1.readLine()) != null) {
			
			String decodedStuff1 = new String(Base64.getDecoder().decode(line1));
			System.out.println(decodedStuff1);
		}
		br1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
}
