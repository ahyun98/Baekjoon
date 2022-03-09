

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		long[] length = new long[num - 1];
		long[] price = new long[num];

		long answer = 0;
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < length.length; i++) {
			length[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < price.length; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}

		long min2 = price[0];
		answer+=min2*length[0];

		for (int i = 1; i < price.length - 1; i++) {
			if (min2 <= price[i]) {
				answer += min2 * length[i];
			} else if (min2 > price[i]) {
				min2 = price[i];
				answer += min2 * length[i];
			}
		}
		System.out.println(answer);

	}
}
