import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1654 {
	/*
	 * 나무자르기 와 비숫한 예제 0과 가장 큰 숫자 에서 비교 자를 수 있는 숫자 보다 많다면 앞으로 자를 수 있는 숫자보다 적다면
	 * e=mid-1로 시간복잡도 log n
	 */
	static long[] length;
	static int N;
	static long ans = 0;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		length = new long[K];

		for (int i = 0; i < length.length; i++) {
			length[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(length);

		long s = 1;
		long e = length[K - 1];
		while (s <= e) {
			long mid = (s + e) / 2;
			if (check(mid)) {
				ans = mid;
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		System.out.println(ans);
	}

	static boolean check(long x) {
		long count = 0;
		for (int i = 0; i < length.length; i++) {
			count += length[i] / x;
		}
		if (count >= N)
			return true;
		else
			return false;
	}
}
