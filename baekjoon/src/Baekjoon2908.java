import java.util.Scanner;

public class Baekjoon2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i>=0 ; i--) {
			sb.append(num1.charAt(i)-'0');
		}
		String num1r = sb.toString();
		int a = Integer.parseInt(num1r);
		sb = new StringBuilder();
		for (int i = 2; i>=0 ; i--) {
			sb.append(num2.charAt(i)-'0');
		}
		String num2r = sb.toString();
		int b = Integer.parseInt(num2r);
		System.out.println(Math.max(a, b));
	}
}
