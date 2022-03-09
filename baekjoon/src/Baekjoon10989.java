import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10989 {
	public static int[] arr;
	public static int[] count=new int[10001];
	public static int[] result;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		result = new int[num];
		arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		countingsort();
		for (int i : result) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	public static void countingsort() {
		
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
		
		for (int i = arr.length-1; i >= 0; i--) {
			result[--count[arr[i]]] = arr[i];
		}
		
	}
}
