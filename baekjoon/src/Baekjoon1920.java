import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
	public static int mid;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] numarr = new int[N];
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numarr.length; i++) {
			numarr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(numarr);
		
		for (int i : numarr) {
			System.out.print(i+" ");
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int a = Integer.parseInt(st.nextToken());
			for (int j = 0; j < numarr.length; j++) {
				
			}
		}
	}
	
	public static void binarysearch(int ans, int s, int e) {
		while(s <= e) {
			mid = (s+e) / 2;
			
			if(mid == ans) {
				
			}
		}
	}

}
