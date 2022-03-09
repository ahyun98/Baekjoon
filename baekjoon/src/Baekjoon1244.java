

import java.util.Scanner;

public class Baekjoon1244 {
	static Scanner sc = new Scanner(System.in);
	static int num = sc.nextInt();
	static int[] switcharr = new int[num + 1];
	static int student;
	static int stswitch;

	public static void main(String[] args) {
		for (int i = 1; i < num + 1; i++) {
			switcharr[i] = sc.nextInt();
		}

		int stnum = sc.nextInt();
		for (int i = 0; i < stnum; i++) {
			student = sc.nextInt();
			stswitch = sc.nextInt();
			if (student == 1) {
				Man(switcharr, stswitch);
			} else {
				Woman(switcharr, stswitch);
			}
		}
		
		for (int i = 1; i < switcharr.length; i++) {
			
			System.out.print(switcharr[i] + " ");
			if(i%20==0) System.out.println();
		}

	}

	static void Woman(int[] arr, int num) {
		int check = 0;
		while (arr[num - check] == arr[num + check]) {
			arr[num - check] = (arr[num - check] == 1) ? 0 : 1;
			arr[num + check] = arr[num - check];
			if (num - check - 1 > 0 && num + check + 1 < arr.length) {
				check++;
			} else {
				break;
			}
		}
	}

	static void Man(int[] arr, int num) {
		for (int i = num; i < arr.length; i++) {
			if (i % num == 0) {
				arr[i] = (arr[i] == 1) ? 0 : 1;
			}
		}
	}
}
