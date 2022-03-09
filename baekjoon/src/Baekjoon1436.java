import java.util.Scanner;

public class Baekjoon1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int[] arr = new int[10000];
		arr[0] = 666;
		int id = 1;
		int i = 1;
		int t = 0;
		while (id < 9000) {
			while (6 * t < i && i < t + 6) {
				arr[id] = i * 1000 + num;
				id++;
				i++;
			}
			for (int j = 0; j <= 9; j++) {
				arr[id] = t * 100 + num * 10 + j;
				id++;
			}
			t *= 10;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}
}
