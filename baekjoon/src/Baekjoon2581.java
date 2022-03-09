

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int number;
		int sum = 0;
		int minimum = 1;
		if (min ==1) min=2; //min이 1일 경우 min2로 변경함으로써 1이 소수되는 것을 방지
		int[] prime = new int[max+1-min];
		
		//min부터 max까지 배열에 넣기
		for (int t=0; t<max+1-min; t++) {
			prime[t]=t+min;
		}
		
		//소수인지 확인해서 소수가 아닐 경우 그 값을 0으로 변경(덧셈할때 문제없게)
		for (int i=0; i<max+1-min; i++) {
			for (int j=2; j<prime[i]; j++) {
				if (prime[i]%j==0) {
					prime[i]=0;
				}
			}
		}
		
		//소수 모두 더하기
		for (int i=0; i<prime.length; i++) {
			sum+=prime[i];
		}
		
		//최솟값 찾기, 0이 아닌 가장 앞의 값이 최소가 됨.
		for (int i=0; i<prime.length; i++) {
			if (prime[i]!=0) {
				minimum=prime[i];
				break;
			}
		}
		
		//조건에서 소수가 없을경우 -1 반환 부합 아니면 소수의 합과 가장 작은 소수 출력
		if(sum==0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(minimum);
		}
		
	}
}
