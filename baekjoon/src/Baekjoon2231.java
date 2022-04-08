

import java.util.Scanner;

public class Baekjoon2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		int a = 0;
		for (int i = 1; i < n; i++) {
			a = 0;
			String str = Integer.toString(i);
			a += i;
			for (int j = 0; j < str.length(); j++) {
				a += str.charAt(j)-'0';
			}
			if(a==n) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}
}
