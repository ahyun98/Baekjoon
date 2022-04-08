import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon10816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr2.length; i++) {
			int idx = 0;
			int s = 0;
			int e = n-1;
			//같은 값에서 가장 왼쪽
			while(s<=e) {
				int mid = (s+e)/2;
				
				if(arr[mid] == arr2[i]) {
					idx = mid;
					e = mid -1;
				}else if(arr[mid] < arr2[i]) {
					s = mid+1;
				}else {
					e = mid-1;
				}
			}
			//같은 값에서 오른쪽 확인
			int idx2 = -1;
			s = 0;
			e = n-1;
			while(s<=e) {
				int mid = (s+e)/2;
				
				if(arr[mid] == arr2[i]) {
					idx2 = mid;
					s = mid+1;
				}else if(arr[mid] <arr2[i]) {
					s = mid+1;
				}else {
					e = mid-1;
				}
			}
			sb.append(idx2+1-idx).append(" ");
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString());
		bw.flush();
		br.close();
	}
}
