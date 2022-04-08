

public class Permutation {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		permutation(arr,0,4,4);
	}
	static void permutation(int[] arr, int depth, int n, int r) {
	    if (depth == r) {
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			};
			System.out.println();
	        return;
	    }
	 
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	        
	    }
	}
	 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
}
