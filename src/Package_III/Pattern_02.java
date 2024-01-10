package Package_III;

import java.util.Scanner;


/*  P_1
  
		 1 2 3
		 1 2 3
		 1 2 3

*/
/*  P_2
 
		1 1 1
		2 2 2
		3 3 3
*/

/*  P_3

1 2 3
4 5 6
7 8 9
*/

/*
 		A A A
 		B B B
 		C C C
 */
public class Pattern_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to print the pattern ");

        int n = scanner.nextInt();
        System.out.println("## Printing the pattern ##");
        System.out.println();
        int count = 0;
        char ch='A';
        for(int row=0; row <n;row++)
        {
        	for(int col=0; col<n; col++)
        	{
        	//	System.out.print(col+1 + " ");  //p_1
        		
        	//	System.out.print(row+1 + " ");  ////p_2
        		
//        		count = count +1;
//        		System.out.print(count + " ");  //p_3
//        		
//        		char c = (char) (ch+row);
//        		System.out.print(c);
        		
//        		char c = (char) (ch+col);
//        		System.out.print(c);
        		
        
        		System.out.print(ch);
        		ch = (char) (ch+1);
        		
        		
        		
        		
        		
        		
        	}
        	System.out.println();
        }
	}

}
