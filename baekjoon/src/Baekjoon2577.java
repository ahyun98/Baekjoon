import java.util.Scanner;

public class Baekjoon2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
		String numword = Integer.toString(num);
		int[] count = new int[10];
		for (int i = 0; i < numword.length(); i++) {
			count[numword.charAt(i)-'0']++;
		}
		for (int i : count) {
			System.out.println(i);
		}
	}
}
