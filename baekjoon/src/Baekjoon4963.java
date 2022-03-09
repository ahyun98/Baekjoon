

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon4963 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();

		int[] dx = { 1, -1, 0, 0, 1, 1, -1, -1 };
		int[] dy = { 0, 0, 1, -1, -1, 1, -1, 1 };

		StringBuilder sb = new StringBuilder();
		do {
			int answer = 0;
			int[][] map = new int[height][width];

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					ArrayList<Integer> search = new ArrayList<Integer>();
					for (int k = 0; k < 8; k++) {
						if (i + dx[k] >= 0 && j + dy[k] >= 0 && i + dx[k] < height && j + dy[k] < width) {
							search.add(map[i + dx[k]][j + dy[k]]);

						}

					}
					
					if (map[i][j] == 1 && !search.contains(2)) {
						answer++;
						map[i][j] = 2;
						for (int k = 0; k < 8; k++) {
							if (i + dx[k] >= 0 && j + dy[k] >= 0 && i + dx[k] < height && j + dy[k] < width && map[i + dx[k]][j + dy[k]]==1) {
								map[i + dx[k]][j + dy[k]]=2;

							}

						}

					} else if (map[i][j] == 1 && search.contains(2)) {
						map[i][j] = 2;
					}else if(map[i][j]==2) {
						for (int k = 0; k < 8; k++) {
							if (i + dx[k] >= 0 && j + dy[k] >= 0 && i + dx[k] < height && j + dy[k] < width && map[i + dx[k]][j + dy[k]]==1) {
								map[i + dx[k]][j + dy[k]]=2;

							}

						}
					}
				}
			}
			sb.append(answer).append("\n");
			width = sc.nextInt();
			height = sc.nextInt();
		} while (width != 0 && height != 0);
		System.out.println(sb);

	}

}
