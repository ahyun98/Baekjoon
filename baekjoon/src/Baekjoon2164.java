import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2164 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> Q = new LinkedList<>();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			Q.offer(++cnt);
		}
		while(Q.size()!=1) {
			Q.remove();
			Q.offer(Q.poll());
		}
		System.out.println(Q.peek());
	}
}
