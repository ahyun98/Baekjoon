import java.util.Scanner;

public class Baekjoon1592 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int iter = sc.nextInt();
		int length = sc.nextInt();
		int totaliter =0;

		int[] student = new int[N];
		int idx = 0;
		student[0]=1;
		while (student[idx] < iter) {
			if (student[idx] % 2 == 0) { // 이게 짝수임
				idx = (idx+(N-length)) % N;
				student[idx]++;
				totaliter++;
			} else { // 이건 홀수
				idx = (idx + length) % N;
				student[idx]++;
				totaliter++;
			}
		}
		System.out.println(totaliter);
	}
}
