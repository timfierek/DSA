import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {4,9,2,5,7};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}
	
	private static void mergeSort(int[] arr, int left, int right) {
		int mid = (left + right - 1) / 2;

		if(left < right) {
			merge(arr, left, mid, right);
		}
		else {
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
		}
	}
	
	private static void merge(int[] arr, int left, int mid, int right) {
		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		int[] l = new int[size1];
		int[] r = new int[size2];
		
		for(int i = 0; i < size1; i++) {
			l[i] = arr[left + i];
		}
		for(int j = 0; j < size2; j++) {
			r[j] = arr[mid + 1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < size1 && j < size2) {
			if(l[i] <= r[j]) {
				arr[k] = l[i];
				i++;
			}
			else {
				arr[k] = r[j];
				j++;
			}
			k++;
		}
		
		while(i < size1) {
			arr[k] = l[i];
			i++;
			k++;
		}
		
		while(j < size2) {
			arr[k] = r[j];
			j++;
			k++;
		}
		
	}
	
	
	
}
