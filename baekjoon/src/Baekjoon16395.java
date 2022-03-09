

import java.util.Scanner;

public class Baekjoon16395 {
	public static int fact = 1;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	num1--;
	num2--;
	if (num2>num1/2) {
		num2 = num1-num2;
//		System.out.println(num2);
	}
	
//	System.out.println(factorial(num1,num2));
//	System.out.println(factorial(num2,num2));
	System.out.println(factorial(num1,num2)/factorial(num2,num2));
	}
	
	

	
	public static long factorial(int num, int end) {
		long fact = 1;
		for (int i=0; i<end; i++) {
			fact = fact*num;
			num--;
		}
		return fact;
		
	
	}
}

