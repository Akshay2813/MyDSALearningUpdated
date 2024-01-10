package gfg;

/* Given a non-negative integer N. The task is to check if N is a power of 2.
 *  More formally, check if N can be expressed as 2x for some integer x. 
 *  Return true if N is power of 2 else return false.*/
public class Powerof2 {

	public static boolean isPowerofTwo(long n) {
		// supporase range = 0 1 2 3 4 5 6 7 8- - - - - n our target is like 2 to power
		// of value(range)==n
		long start = 0;
		long end = n;
		long mid = start + (end - start) / 2;

		while (start <= end) {
			if (Math.pow(2, mid) == n) {
				return true;
			} else if (Math.pow(2, mid) > n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = start + (end - start) / 2;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
