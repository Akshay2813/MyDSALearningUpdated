import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= new String("abc");
		String s2="abc";
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2)); //true
		
		
		String s3="abc";
		System.out.println(s2==s3);  //true
		System.out.println(s2.equals(s3));  //true


	}

}
