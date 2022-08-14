import java.util.Arrays;

public class QuickSort {

	
	public static void main(String[] args) {
		int[] arr = {1, 50, 6, 9, 45, 32, 900, 1, 2, 3};
		QuickSort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] array) {
		Sort(array, 0, array.length - 1);
	}
	
	protected static void Sort(int[] A, int left, int right) {
		int q;
		
		if(left < right) {
			q = Partition(A, left, right);
			Sort(A, left, q - 1);
			Sort(A, q + 1, right);
		}
	}
	
	protected static int Partition(int[] A, int start, int end) {
		int i = start;
		int j = end - 1;
		int x = A[end];
		
		while(i <= j) {
			while((i <= j) && (A[i] <= x)) {
				i++;
			}
			while((i <= j) && (A[j] >= x)) {
				j--;
			}
			if(i < j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		int temp = A[i];
		A[i] = A[end];
		A[end] = temp;
		
		return i;
	}
	
}
