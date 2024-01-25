package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class L_66_Plus_One {

	public static int[] plusOne(int[] digits) {

		long sum = 0;
		for (int i = 0; i < digits.length; i++) {
			long temp= (long) (Math.pow(10, digits.length - 1 - i) * digits[i]);
			sum = sum+temp;
		}
		System.out.println("Sum= " + sum);
		sum = sum + 1;
		System.out.println("Sum+1= " + sum);

		ArrayList<Long> li = new ArrayList();
		while (sum != 0) {
			long temp = sum % 10;
			li.add(temp);
			sum = sum / 10;
		}
		Collections.reverse(li);
		System.out.println("li= " + li);

		int[] ans = new int[li.size()];

		for (int i = 0; i < ans.length; i++) {
			ans[i] = li.get(i).intValue();
			;

		}

		return ans;

	}

	public static int[] plusOne_Optimized(int[] digits)
    {

       for (int i = digits.length - 1; i >= 0; i--)
        {
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
	    digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
//		int[] arr = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
		int[] arr = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
//		int[] ans = plusOne(arr);
		int[] ans  = plusOne_Optimized(arr);
//		System.out.print("ans" + Arrays.toString(ans));
		//6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4
		
//		long i = 728509129536673284379577474947011174006l;
//		System.out.print(i+1);

	}

}
