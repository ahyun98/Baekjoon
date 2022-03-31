import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon2096 {
	public static int[] maxarr;
	public static int[] minarr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		maxarr = new int[4];
		minarr = new int[4];
		for (int i = 1; i < N+1; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int num3 = Integer.parseInt(st.nextToken());
			int a = Math.max(maxarr[1], maxarr[2])+num1;
			int b = Math.max(maxarr[1], Math.max(maxarr[2], maxarr[3]))+num2;
			int c = Math.max(maxarr[2], maxarr[3])+num3;
			maxarr[1] = a;
			maxarr[2] = b;
			maxarr[3] = c;
			
			a = Math.min(minarr[1], minarr[2])+num1;
			b = Math.min(minarr[1], Math.min(minarr[2], minarr[3]))+num2;
			c = Math.min(minarr[2], minarr[3])+num3;
			minarr[1] = a;
			minarr[2] = b;
			minarr[3] = c;
			

		}
		System.out.print(Math.max(maxarr[1], Math.max(maxarr[2], maxarr[3]))+" ");
		System.out.print(Math.min(minarr[1], Math.min(minarr[2], minarr[3])));
	}

}
