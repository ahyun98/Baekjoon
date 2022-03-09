

import java.util.Scanner;

public class Baekjoon1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numlist = new int [num];
		int prime = num;
		
		// 입력 받은 숫자들 배열에 넣기
		for (int i=0; i<num; i++) {
			numlist[i] = sc.nextInt();
			
			//1예외처리하고 싶었는데 못하고 그냥 소수아닌거 넣어줌..;
			if (numlist[i]==1) numlist[i]=4;
		}
		
		//소수 판별하기 , 소수가 아니면 prime값 하나씩 줄게하기
		for (int j=0; j<num; j++) {
			for (int t=2; t<numlist[j]; t++) {
				if (numlist[j]%t==0) {
					prime=prime-1;
					break;
				}
			}
		}
		
		System.out.println(prime);
	}

}
