

import java.util.Scanner;

public class Baekjoon1463 {
	public static int min = Integer.MAX_VALUE;
	public static int[] iter;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		iter = new int[num + 1];
		System.out.println(func(num));
		iter[0] = iter[1] = 0;

	}

	public static int func(int num) {
		if(num==1) return 0;
		
//		if(iter[num] > 0) return iter[num];
		
		if (num % 6 == 0) {
			iter[num] = Math.min(func(num / 2), Math.min(func(num / 3), func(num - 1))) + 1;
		} else if (num % 3 == 0) {
			iter[num] = Math.min(func(num / 3), func(num - 1)) + 1;
		} else if (num % 2 == 0) {
			iter[num] = Math.min(func(num / 2), func(num - 1)) + 1;
		} else {
			iter[num] = func(num - 1) + 1;
		}
		return iter[num];
	}

}
