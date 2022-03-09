import java.util.Scanner;

public class Baekjoon2023 {
	static int[] arr = { 1, 2, 3, 5, 7, 9 };
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		recur(0, 0);
	}

	static boolean check(int num) {
		// 1은 예외의 변수로 1로 시작하는 수는 소수가 아니기 때문에 1로 시작하면 나가기
		if(num==1) {
			return false;
		}
		
		// 소수인지 확인해서 소수가 아니면 나가기
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		//다 봤는데 소수였으니까 true반환해서 check(num)에 안걸림.
		return true;

	}

	static void recur(int cur, int num) {
		// 가지치기, 소수가아니면 더 볼것도 없이 나가기
		if (!check(num)) {
			return;
		}
		
		// 나가는 조건, n자리수 다 채웠는데 소수이면 출력
		if (cur == n) {
			System.out.println(num);
			return;
		}
		
		//baseline arr의 모든 값들을 하나씩 넣어보는 과정
		for (int i = 0; i < arr.length; i++) {
			recur(cur + 1, 10 * num + arr[i]);
		}

	}
}
