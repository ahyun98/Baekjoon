import java.util.Scanner;

public class Baekjoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String word = sc.next();
		int sum = 0;
		for (int i = 0; i < word.length(); i++) {
			sum+=word.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
