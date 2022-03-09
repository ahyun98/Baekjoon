import java.util.Scanner;

public class Baekjoon2851 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int total = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			total+=arr[i];
			if(total>=100) {
				if(Math.abs(100-total)>Math.abs(100-(total-arr[i]))) {
					ans = total-arr[i];
				}else {
					ans = total;
				}
				break;
			}
			ans = total;
		}
		System.out.println(ans);
	}
}
