import java.util.Scanner;

public class Baekjoon2750 {
	public static Scanner sc = new Scanner(System.in);
	public static int num = sc.nextInt();
	public static int[] arr = new int[num];
	public static void main(String[] args) {
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(j,j+1);
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
	public static void swap(int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
