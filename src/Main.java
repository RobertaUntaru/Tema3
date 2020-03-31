package tema;

public class Main {
	public static void main(String args[]) {
		
		//text file
		System.out.println("=== Encode and decode text file ===");
		System.out.println("->Encoded data: ");
		Encode.encode1();
		System.out.println("Decoded data:");
		Decode.decode1();
		//binary file
		System.out.println("=== Encode and decode binary file ===");
		System.out.println("->Encoded data: ");
		Encode.encode2();
		System.out.println("->Decoded data:");
		Decode.decode2();
		
	}

}
