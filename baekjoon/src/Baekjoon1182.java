import java.util.Scanner;

public class Baekjoon1182 {
	static int iter = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int tc = 1; tc <= 1; tc++) {
			iter=0;
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			if (K==0) iter--;
			recur(arr, 0, 0, K);
			System.out.println(iter);
		}
	}

	static void recur(int[] arr, int n, int sum, int K) {
		// 이제 그만 두는 파트
		if (n == arr.length) {
			
			if (sum == K) {
				iter++;
			}
			return;
		}

		recur(arr, n + 1, sum + arr[n], K);
		recur(arr, n + 1, sum, K);
	}
}
