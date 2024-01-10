package String;

public class S_01_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaration of string 
		
		String s="Geek for Geek";
		
		//String s1= new String("GeekforGeek");
		
		//Immutable string
		
		String s2="Sachin";
		s2.concat("Tendulakar");
		System.out.println(s2);
		
		//Various method
		String s1="Hello Akshay";
		
		int l = s1.length();
		System.out.println(l);
		
		char ch = s1.charAt(2);
		System.out.println(ch);
		
		String subString = s1.substring(2);
		System.out.println(subString);
		
		String substr=s1.substring(2,4);
		System.out.println(substr);
		
		
		String scon=s1.concat(" Good Morning");
		System.out.println(scon);
		
		String s3="learn share learn";
		int j=s3.indexOf("ea");
		System.out.println(j);

		int k=s3.indexOf("ea", 3);
		System.out.println(k);
		
		int m=s3.lastIndexOf("a");
		System.out.println(m);
		
		 String h="Hello";
		 boolean b= h.equals("hello");
		 System.out.println(b);
		 boolean c=h.equalsIgnoreCase("hello");
		 System.out.println(c);
		 
		 
		 String lower=h.toLowerCase();
		 System.out.println(lower);
		 String upper=h.toUpperCase();
		 System.out.println(lower);
		 
		 String newString=h.replace("l", "k");
		 System.out.println(newString);
		
		
		

	}

}
