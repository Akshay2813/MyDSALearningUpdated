package gfg;

import java.util.HashMap;
import java.util.Map;

public class PartyofCouples {

	public static int findSingle(int N, int arr[]) {

		Map<Integer, Integer> m = new HashMap<>();

		int ans = 0;
		for (int i = 0; i < N; i++) {
			int count = m.getOrDefault(arr[i], 0); // assume 1=2
			m.put(arr[i], count + 1);
		}
		for (Map.Entry<Integer, Integer> i : m.entrySet()) {
			if (i.getValue() == 1) {
				// System.out.print(i.getKey());
				ans = i.getKey();

			}
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1 };
		int N = 5;
		findSingle(N, arr);

	}

}
