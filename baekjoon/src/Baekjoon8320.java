import java.util.Scanner;

public class Baekjoon8320 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int ans = 0;

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j <= num)
					ans++;
			}
		}
		System.out.println(ans);
	}
}
