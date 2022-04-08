import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon2805 {
	/*
	 * 이분 탐색, 매개변수 탐색 문제 상근이가 가져갈 수 있는 나무의 m를 확인해서 상근이가 가져가려고 하는 나무가 7m라고 가정하면 7m이상을
	 * 가져갈 수 있는 건 전부 o 가져갈 수 없는 건 전부 x로 두고 o중에 가장 오른쪽 인덱스의 값을 반환하면 된다
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] tree = new int[n];
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(tree);
		int ans = 0;
		int s = 0;
		int e = tree[n-1];
		while (s <= e) {
			int mid = (s + e) / 2;
			long length = 0;
			for (int j = 0; j < tree.length; j++) {
				if (tree[j] - mid > 0) {
					length += tree[j] - mid;
				}
			}
			if (length >= m) {
				ans = mid;
				s = mid+1;
			} else {
				e = mid-1;
			}
		}
		System.out.println(ans);

	}
}
