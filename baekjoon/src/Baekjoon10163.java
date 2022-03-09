import java.util.Scanner;

public class Baekjoon10163 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[1001][1001];
		for (int color = 1; color <= N; color++) {
			int c = sc.nextInt();
			int r = sc.nextInt();
			int width = sc.nextInt();
			int height = sc.nextInt();
			for (int i = r; i < r+height; i++) {
				for (int j = c; j < c+width; j++) {
					arr[i][j] = color;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int color = 1; color <= N; color++) {
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i][j] == color)
						cnt++;
				}
			}
			sb.append(cnt).append("\n");
		}
		System.out.println(sb);
		
	}
}
