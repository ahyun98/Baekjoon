

import java.util.Scanner;

public class Baekjoon2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int blackjack = sc.nextInt();
		int[] array = new int[count];
		

		// array에 값 넣기
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int sum = 0;
		
		//브루트포스 알고리즘 (그냥 다 일일히 하나씩 해보기)
		for (int j = 0; j < array.length; j++) {
			for (int k = 1; k < array.length; k++) {
				for (int t = 2; t < array.length; t++) {
					if (j != k && k != t && j!= t) {
						if (array[j] + array[k] + array[t] == blackjack) {
							sum = array[j] + array[k] + array[t];
							break;
							
							// blackjack에서 세 숫자의 합을 더한것이 더 작으면 갱신
						}else if (array[j] + array[k] + array[t] < blackjack) {
							if (blackjack - (array[j] + array[k] + array[t]) < Math.abs(blackjack - sum)) {
								sum = array[j] + array[k] + array[t];
							}
						}
							
					}

				}

			}
		}
		System.out.println(sum);
	}
		
}
	
