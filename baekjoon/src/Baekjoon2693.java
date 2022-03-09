

import java.util.Scanner;

public class Baekjoon2693 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int memory;
		int[] numlist = new int[10];
		int[] answer = new int[T];
		// 받아온 수 numlist배열에 추가
		for (int t = 0; t < T; t++) {
			for (int k = 0; k < numlist.length; k++) {
				numlist[k] = sc.nextInt();
			}
			
			//i번째 수와 i+1번째 수를 비교 i가 더 크면 둘이 자리 바꾸기
			for (int j = 0; j < numlist.length; j++) {
				for (int i = 0; i < numlist.length - 1; i++) {
					if (numlist[i] > numlist[i + 1]) {
						memory = numlist[i];
						numlist[i] = numlist[i + 1];
						numlist[i + 1] = memory;
					}
				}
			}
			answer[t] = numlist[7];
		
		}
		for (int r=0; r<T; r++) {
			System.out.println(answer[r]);
		}
	}

}
