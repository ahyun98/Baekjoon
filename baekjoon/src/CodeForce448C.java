import java.util.Scanner;

public class CodeForce448C {
	static int[] fence;
	static int ans;
	public static void main(String[] args) {
		// 제일 많이 연결되어있는 거부터 하나씩 칠하는게 최소 스트로크
		// 근데 제일 긴거 어떻게 찾냐고
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fence = new int[n];

		for (int i = 0; i < n; i++) {
			fence[i] = sc.nextInt();
		}
		// 한 행에서 가장 길게 연결된 세로길이 저장할 거임
		System.out.println(paint(0, n - 1, fence));
//		paint(0, n - 1, fence);
	}

	public static int paint(int start, int end, int[] fence) {
		int min = Integer.MAX_VALUE;
		for (int i = start; i <= end; i++) {
			min = (min > fence[i]) ? fence[i] : min;
		}
		int stroke = min;

		for (int i = start; i <= end; i++) {
			fence[i] -= min;
		}

		// 0이 아닌 부분이 있을 때
		for (int i = start; i <= end; i++) {
			if (fence[i] != 0) {
				int s = i;
				i++;
				while (i <= end && fence[i] != 0) {
					i++;
				}
				int e = --i;
				stroke += paint(s, e, fence);
			}
		}
		return Math.min(stroke, end + 1 - start);
	}
}
