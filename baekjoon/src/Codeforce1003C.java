import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Codeforce1003C {
	public static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		double ans = 0;
		for (int i = 0; i <= arr.length-k; i++) {
			for (int j = k; j <= arr.length-i; j++) {
				ans = Math.max(avg(i,j),ans);
			}
		}
		System.out.println(ans);
	}
	public static double avg(int startidx, double num) {
		int iter = 0;
		double sum = 0;
		while(iter < num) {
			if(startidx>=arr.length) {
				return 0;
			}
			sum += arr[startidx];
			iter++;
			startidx++;
		}
		double ans = sum/num; 
		return ans;
	}
}
