import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon2170 {
	public static void main(String[] args) throws IOException{
		Stack<Long> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		long[][] arr = new long[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<long[]>() {

			@Override
			public int compare(long[] o1, long[] o2) {
				if(o1[0]==o2[0]) return (int) (o1[1]-o2[1]);
				return (int) (o1[0]-o2[0]);
			}
			
		});
		stack.add(arr[0][0]);
		stack.add(arr[0][1]);
		long ans = 0;
		for (int i = 1; i < N; i++) {
			if(stack.peek()>=arr[i][0]) {
				if(stack.peek()>arr[i][1]) {
					continue;
				}else {
					stack.pop();
					stack.add(arr[i][1]);
				}
			}else {
				ans += stack.pop()-stack.pop();
				stack.add(arr[i][0]);
				stack.add(arr[i][1]);
			}
		}
		while(!stack.isEmpty()) {
			ans+= stack.pop()-stack.pop();
		}
		bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
	}
}
