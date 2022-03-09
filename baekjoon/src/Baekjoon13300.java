import java.util.Scanner;

public class Baekjoon13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		int[][] student = new int[7][2];
		for (int i = 0; i < N; i++) {
			int sex = sc.nextInt();
			int grade = sc.nextInt();
			student[grade][sex]++;
			if(student[grade][sex]==K) {
				ans++;
				student[grade][sex]=0;
			}
		}
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				if(student[i][j]!=0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
