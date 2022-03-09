import java.util.Scanner;

public class Baekjoon14696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= round; i++) {
			int[] a = new int[5];
			int[] b = new int[5];
			int aNum = sc.nextInt();
			for (int j = 0; j < aNum; j++) {
				a[sc.nextInt()]++;
			}
			int bNum = sc.nextInt();
			for (int j = 0; j < bNum; j++) {
				b[sc.nextInt()]++;
			}

			for (int j = a.length - 1; j >= 0; j--) {
				if (a[j] < b[j]) {
					sb.append("B").append("\n");
					break;
				} else if (a[j] > b[j]) {
					sb.append("A").append("\n");
					break;
				}
				if (j == 0 && a[j] == b[j]) {
					sb.append("D").append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
