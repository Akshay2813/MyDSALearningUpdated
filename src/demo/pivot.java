package demo;

public class pivot {

	// rotated + sorted arr
	// 9 10 2 4 6 8 >>>after Sort>>>2 4 6 8 9 10
	public static int pivotIndexOfArr(int[] arr) {

		int start = 0;
		int end = arr.length - 1;
		int mid = start + (end - start) / 2;

		while (start <= end) {

			if(start==end)
	        {
	            return start;
	        }
			if (mid <= end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			if (mid-1 >=start && arr[mid - 1] > arr[mid]) {
				return mid - 1;
			}
			if (arr[start] > arr[mid]) {

				// we are on line B and pivot is on left side
				end = mid - 1;

			} else {
				start = mid + 1;
			}
			mid = start + (end - start) / 2;
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr= {9,10,2,4,6,8};
		
		System.out.println(pivotIndexOfArr(arr));
	}

}
