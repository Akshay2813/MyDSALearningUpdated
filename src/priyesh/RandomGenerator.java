package priyesh;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class RandomGenerator {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		
		
		
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		int rand = 0;

		
		int s= random.nextInt(2)+10;
		   
		       System.out.println(s);
		   
		       
		       System.out.println( 'a' + random.nextInt(10));
		        
		        System.out.println( 'A' + random.nextInt(10));
		        
		    


	}

}
