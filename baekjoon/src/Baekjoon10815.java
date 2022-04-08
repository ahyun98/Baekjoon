import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10815 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		int[] arr2 = new int[M];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			int ans = 0;
			int s = 0;
			int e = N - 1;
			while(s<=e) {
				int mid = (s+e)/2;
				if (arr[mid] == arr2[i]) {
					ans = 1;
					break;
				}else if(arr[mid] < arr2[i]) {
					s = mid+1;
				}else {
					e = mid-1;
				}
			}
			System.out.print(ans+" ");
		}
		
		
		
	}
}
