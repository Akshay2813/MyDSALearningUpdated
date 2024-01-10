package Question;

import java.util.Scanner;

public class Q1_Hello_world {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name= ");
		String name = sc.next();
		System.out.println();
	
		System.out.print("Enter your Age= ");
		int age = sc.nextInt();
		System.out.println();
		
		
		System.out.println("Hello "+ name + " " + "your age is " + age);
	}

}
