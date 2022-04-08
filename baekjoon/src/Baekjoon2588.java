import java.util.Scanner;

public class Baekjoon2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String b = sc.next();
		int ans1 = b.charAt(2)-'0';
		int ans2 = b.charAt(1)-'0';
		int ans3 = b.charAt(0)-'0';
		int ans = Integer.parseInt(b);
		System.out.println(a*ans1);
		System.out.println(a*ans2);
		System.out.println(a*ans3);
		System.out.println(a*ans);
	}
}
