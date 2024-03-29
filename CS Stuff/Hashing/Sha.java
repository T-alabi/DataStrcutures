import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Java program to calculate SHA hash value
import java.math.BigInteger; 
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest; //import MD
import java.security.NoSuchAlgorithmException; 

public class Sha {
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException {
		// getInstance() method is called with hashing SHA
		MessageDigest md = MessageDigest.getInstance("SHA-256");//new instance of MD, Sha-256

		// digest() method called to calculate MD of an input and to return an array of bytes
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String toHexString(byte[] hash)	{
		// Convert byte array into signum representation (extracts the sign)
		BigInteger number = new BigInteger(1, hash);

		// Convert message digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString(16));

		// Add leading zeros
		while (hexString.length() < 32) {
			hexString.insert(0, '0');
		}

		return hexString.toString();
	}

	// Driver code
	public static void main(String args[]) {
		try	{
			System.out.println("HashCodes Generated by SHA-256:");

			String fname = "Yulia";
			System.out.println("\nThe Hash of " + fname + " is : " + toHexString(getSHA(fname)));
			System.out.println("\nThe Hash of " + fname + " is : " + toHexString(getSHA(fname)));

			String lname = "Kumar";
			System.out.println("The hash of " + lname + " is : " + toHexString(getSHA(lname)));

		}
		// For specifying wrong message digest algorithms
		catch (NoSuchAlgorithmException e) {
			System.out.println("Exception thrown for incorrect algorithm: " + e);
		}
	}
}