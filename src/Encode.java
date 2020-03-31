package tema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

public class Encode {
	
	
		//encode input.txt
	
		static String line = " ";
		static String encodedStuff=" ";
		
		public static void encode1()
		{
		File input = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\input.txt");
		File output = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\output.txt");
		
		try {
		BufferedReader br = new BufferedReader(new FileReader(input));
		while ((line = br.readLine()) != null) {
			
			encodedStuff = Base64.getEncoder().encodeToString(line.getBytes());
		}
	
		FileWriter fw = new FileWriter(output);
		fw.write(encodedStuff);
		fw.close();
		br.close();
		System.out.println(encodedStuff);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		//encode input.bin
		
		static String encodedStuff1=" ";
		static String line1 = " ";
		
		public static void encode2()
		{
		File input1 = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\input.bin");
		File output1 = new File("C:\\Users\\rober\\eclipse-workspace\\tema\\src\\output.bin");
		
		try {
		BufferedReader br1 = new BufferedReader(new FileReader(input1));
		while ((line1 = br1.readLine()) != null) {
			
			encodedStuff1 = Base64.getEncoder().encodeToString(line1.getBytes());
		}

		FileWriter fw1 = new FileWriter(output1);
		fw1.write(encodedStuff1);
		fw1.close();
		br1.close();
		System.out.println(encodedStuff1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
}
