import java.util.Scanner;

public class Baekjoon16953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int cnt = 0;

		while (B != A) {
			if (B % 10 == 1) {
				B = B / 10;
				cnt++;
			} else if (B % 2 == 0) {
				B = B / 2;
				cnt++;
			} else {
				cnt = -1;
				break;
			}
			if (A > B) {
				cnt = -1;
				break;
			}
		}
		if (A == B) {
			cnt++;
		}
		System.out.println(cnt);
	}
}
