

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum=0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// 1 2 2 3 3 3 이런식으로 array에 숫자 담기
		for (int i=1; i<=end; i++) {
			for (int j=1; j<i+1; j++) {
				num.add(i);
			}
		}
		
		
		// 담은 array에서 start,와 end사이 숫자 더하기
		for (int i=start-1; i<end; i++){
			sum += num.get(i);
		}
		
		//print
		System.out.println(sum);
	}	
}
