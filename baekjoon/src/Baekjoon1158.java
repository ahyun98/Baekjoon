import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int cnt = 0;
		int n = 0;
		int length = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ++cnt;
		}
		cnt = 0;
		sb.append("<");
		while (length < N) {
			if(cnt == K-1 && arr[n]!=0) {
				sb.append(arr[n]).append(", ");
				arr[n]=0;
				length++;
				n++;
				cnt = 0;
			}else if(arr[n]!=0){
				cnt = cnt+1;
				n++;
			}else {
				n++;
			}
			n = n%N;
		}
		sb.deleteCharAt(sb.lastIndexOf(" "));
		sb.deleteCharAt(sb.lastIndexOf(","));
		sb.append(">");
		System.out.println(sb);
		
	}
}
