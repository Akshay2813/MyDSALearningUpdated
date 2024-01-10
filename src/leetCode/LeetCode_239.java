package leetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_239 {

	public int[] maxSlidingWindow(int[] nums, int k) {

		List<Integer> ansList = new ArrayList<>();

		Deque<Integer> dq = new LinkedList<>();

		// proceess first window
		for (int i = 0; i < k; i++) // 1 3 -1
		{
			while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
				dq.pollLast();
			}
			dq.addLast(i);
		}

		// store first window ans
		ansList.add(nums[dq.peekFirst()]);
		// process remaining widnwos

		for (int i = k; i < nums.length; i++) {
			if (!dq.isEmpty() && i - dq.peekFirst() >= k) {
				dq.pollFirst();
			}
			while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) {
				dq.pollLast();
			}
			dq.addLast(i);

			ansList.add(nums[dq.peekFirst()]);

		}

		int[] ans = new int[ansList.size()];

		for (int i = 0; i < ansList.size(); i++) {
			ans[i] = ansList.get(i);
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
