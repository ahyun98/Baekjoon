import java.util.Scanner;

public class Baekjoon2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		int max = 0;
		int maxid = 0;
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				maxid = i;
			}
		}
		System.out.println(max);
		System.out.println(maxid+1);
	}
}
