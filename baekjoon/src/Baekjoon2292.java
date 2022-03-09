import java.util.Scanner;

public class Baekjoon2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] arr = new long[20000];

		arr[0]=1;
		long memory=1;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = memory+6*i;
			memory = arr[i];
		}
		
//		for (int i = 0; i < 20; i++) {
//			System.out.println(arr[i]);
//		}
		int num = sc.nextInt();
		for (int i = 0; i < arr.length-1; i++) {
			if(num==1) {
				System.out.println(1); 
				break;
			}
			if(num>arr[i] && arr[i+1]>=num) {
				System.out.println(i+2);
			}
		}
	}
}
