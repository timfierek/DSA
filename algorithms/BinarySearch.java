import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		System.out.println(binarySearch(nums, 10));
		System.out.println(binarySearch(nums, 1));
		System.out.println(binarySearch(nums, 2));
		System.out.println(binarySearch(nums, 3));
		System.out.println(binarySearch(nums, -40));
	}
	
	public static int binarySearch(int[] arr, int targetNum) {
		return binarySearch(arr, 0, arr.length-1, targetNum);
	}
	
	private static int binarySearch(int[] arr, int ind1, int ind2, int targetNum) {
		int cutIndex = (ind2 + ind1) / 2;
		
		if(arr[cutIndex] == targetNum) {
			return cutIndex;
		}
		else if(ind2 <= ind1) {
			return -1;
		}
		
		
		if(arr[cutIndex] < targetNum) {
			return binarySearch(arr, cutIndex + 1, ind2, targetNum);
		}
		else {
			return binarySearch(arr, ind1, cutIndex - 1, targetNum);
		}
		
	}
	
}
