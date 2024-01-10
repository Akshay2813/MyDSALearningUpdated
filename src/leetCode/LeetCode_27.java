package leetCode;

public class LeetCode_27 {

	public int removeElement(int[] nums, int val) {

		int start = 0;
		int ansLength = 0;

		// [3,2,2,3]

		while (start < nums.length) {
			if (nums[start] != val) {
				nums[ansLength] = nums[start];
				ansLength++;
			}
			start++;

		}

		return ansLength;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
