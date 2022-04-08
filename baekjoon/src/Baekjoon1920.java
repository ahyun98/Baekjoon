import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
	public static int mid;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] numarr = new int[N];
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numarr);

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < M; i++) {
			int ans = 0;
			int num = Integer.parseInt(st.nextToken());
			int s = 0;
			int e = N-1;
			while(s<=e) {
				int mid = (s+e)/2;
				if(numarr[mid]==num) {
					ans = 1;
					break;
				}else if(numarr[mid]>num) {
					e = mid-1;
				}else {
					s = mid+1;
				}
			}
			System.out.println(ans);
		}

	}

}
