import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2999 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int N = word.length();
		List<Integer> divisor = new ArrayList<Integer>();
		int R;
		int C;
		if (N==1) {
			R = 1;
			C = 1;
		}else {
			
			for (int i = 1; i < N ; i++) {
				if(N%i==0) {
					divisor.add(i);
				}
			}
			R= divisor.get(divisor.size()/2);
			C = N/R;
		}
		char[][] arr = new char[R][C];
		int t = 0;
		for (int j = 0; j < C; j++) {
			for (int i = 0; i < R; i++) {
				arr[i][j] = word.charAt(t);
				t++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				sb.append(arr[i][j]);
			}
		}
		System.out.println(sb);
	}
}
