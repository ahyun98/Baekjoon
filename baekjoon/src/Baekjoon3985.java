import java.util.Scanner;

public class Baekjoon3985 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int[] roll = new int[L + 1];
		int N = sc.nextInt();
		int[] count = new int[N + 1];
		int expect = 0;
		int expectvalue = 0;
		for (int i = 1; i <= N; i++) {
			int startidx = sc.nextInt();
			int endidx = sc.nextInt();
			if (expectvalue < endidx - startidx) {
				expect = i;
				expectvalue = endidx - startidx;
			}

			for (int j = startidx; j <= endidx; j++) {
				if (roll[j] == 0) {
					roll[j] = i;
				}
			}

		}

		for (int i = 0; i < roll.length; i++) {
			if (roll[i] != 0)
				count[roll[i]]++;
		}

		int max = 0;
		for (int i = 0; i < count.length; i++) {
			if (count[max] < count[i]) {
				max = i;
			}
		}
		System.out.println(expect);
		System.out.println(max);

	}
}
