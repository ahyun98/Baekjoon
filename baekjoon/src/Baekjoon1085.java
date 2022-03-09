import java.util.Scanner;

public class Baekjoon1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int min = 0;
		min = Math.min(x, Math.min(y, Math.min(w-x, h-y)));
		System.out.println(min);
	}
}
