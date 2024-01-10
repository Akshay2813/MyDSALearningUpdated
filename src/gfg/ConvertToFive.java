package gfg;

public class ConvertToFive {

	public static int reverseInt(int n) {
		int temp = n;
		int ans = 0;
		while (temp != 0) {
			int digit = temp % 10;
			if (digit == 0) {
				digit = 5;
			}
			ans = ans * 10 + digit;

			temp = temp / 10;
		}

		return ans;
	}

	public static int convertFive(int n) {
		// add code here.

		int temp = reverseInt(n);
		int ans = 0;
		while (temp != 0) {
			int digit = temp % 10;
			if (digit == 0) {
				digit = 5;
			}
			ans = ans * 10 + digit;

			temp = temp / 10;
		}

		return ans;
	}

	public static void main(String[] args) {

		System.out.print(convertFive(1012));

	}

}
