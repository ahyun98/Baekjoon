

import java.util.Scanner;

public class Baekjoon9291 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[][] sdoku = new int[9][9];

			for (int i = 0; i < sdoku.length; i++) {
				for (int j = 0; j < sdoku.length; j++) {
					sdoku[i][j] = sc.nextInt();
				}
			}
			String result = "CORRECT";

			out: for (int i = 0; i < sdoku.length; i++) {
				int[] numarr = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				for (int j = 0; j < sdoku.length; j++) {
					int num = sdoku[i][j];
					if (numarr[num] == 1) {
						numarr[num]--;
					} else if (numarr[num] == 0) {
						result = "INCORRECT";
						break out;

					}
				}
			}

			out: for (int i = 0; i < sdoku.length; i++) {
				int[] numarr = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
				for (int j = 0; j < sdoku.length; j++) {
					int num = sdoku[j][i];
					if (numarr[num] == 1) {
						numarr[num]--;
					} else if (numarr[num] == 0) {
						result = "INCORRECT";
						break out;

					}
				}
			}

			out: for (int k = 0; k < 3; k++) {
				for (int t = 0; t < 3; t++) {
					int[] numarr = { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							int num = sdoku[3 * k + j][3 * t + i];
							if (numarr[num] == 1) {
								numarr[num]--;
							} else if (numarr[num] == 0) {
								result = "INCORRECT";
								break out;
							}
						}

					}
				}
			}
			System.out.println("Case " + tc + ": " + result);
		}
	}
}
