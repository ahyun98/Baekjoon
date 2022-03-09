import java.util.Scanner;

public class Baekjoon10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		StringBuilder sb = new StringBuilder();
		do {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a != 0 && b != 0)
				sb.append(a + b).append("\n");
		} while (a != 0 && b != 0);
		System.out.println(sb);
	}
}
