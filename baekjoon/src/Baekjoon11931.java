import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = 0; i < arr.length; i++) {
			int minIdx = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIdx]>arr[j]) {
					minIdx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
		for (int i : arr) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
