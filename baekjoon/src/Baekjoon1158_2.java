import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon1158_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> Q = new LinkedList<>();
		int cnt = 0;
		int length = 0;
		for (int i = 0; i < N; i++) {
			Q.offer(++cnt);
		}
		cnt = 0;
		sb.append("<");
		while (length != N) {
			if(cnt == K-1) {
				sb.append(Q.remove()).append(", ");
				length ++;
				cnt = 0;
			}else {
				Q.offer(Q.remove());
				cnt++;
			}
		}
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(">");
		System.out.println(sb);
	}
}
