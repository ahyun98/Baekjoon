import java.util.Scanner;

public class Baekjoon8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String word = sc.next();
			int ans = 0;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'O') {
					ans++;
					int j = i - 1;
					while (j >= 0 && word.charAt(j) == 'O') {
						ans++;
						j--;
					}
				}
			}
			System.out.println(ans);
		}
	}
}
