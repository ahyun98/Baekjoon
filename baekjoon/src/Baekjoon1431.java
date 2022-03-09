

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		ArrayList word = new ArrayList();

		// ArrayList에 각각의 단어 담기.
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}

//		// word의 length 비교후 정렬
		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (a[j].length() > a[i].length()) {
					String memory = a[j];
					a[j] = a[i];
					a[i] = memory;
				}
			}
			System.out.println(a[j]);
		}
		
		// word에 들어있는 숫자 확인해서 합 sum에 집어넣기
		int[] sum = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				if (a[i].charAt(j) >= '0' && a[i].charAt(j) <= '9') {
					sum[i] += (int) a[i].charAt(j)-'0';
				}
			}
			System.out.println(sum[i]);
		}
		
		
		


		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (sum[j] > sum[i]) {
					if (a[j].length() == a[i].length()) {
						String memory = a[j];
						a[j] = a[i];
						a[i] = memory;
						int memory2 = sum[j];
						sum[j] = sum[i];
						sum[i] = memory2;
					}

				}
			}
		}


		for (int j = 0; j < a.length - 1; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (sum[j] == sum[i] && a[j].length() == a[i].length()) {
					for (int t = 0; t < a[j].length(); t++) {
						if ((int) a[j].charAt(t) > (int) a[i].charAt(t)) {
							String memory = a[j];
							a[j] = a[i];
							a[i] = memory;
							int memory2 = sum[j];
							sum[j] = sum[i];
							sum[i] = memory2;
//							for (int k = 0; k < a.length; k++) {
//								System.out.println(a[k]);
//							}
//							System.out.println("------------------");
							break;

						} else if((int) a[j].charAt(t) < (int) a[i].charAt(t)){
							break;
						}

					}
				}
			}

		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
			}

	}
}
