

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon14888 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int test = sc.nextInt();
		int[] numarray = new int[test];
		int[] arr = new int [4];
		ArrayList<String> operatorarr = new ArrayList<String>();
		int[] per = new int[test-1];
		
		
		// 연산할 숫자들을 배열에 담기
		for (int i = 0; i < numarray.length; i++) {
			numarray[i] = sc.nextInt();
		}
		
		// 연산자들의 개수를 배열에 담기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 개수에 맞춰서 연산자들을 담기
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] > 0) {
				operatorarr.add(operator(arr, i));
				arr[i]--;
			}
		}
		
		for (int i=0; i<per.length; i++) {
			per[i] = i;
		}
		
		permutation(per,0,per.length,per.length);
		
		//정렬되어있는대로 계산
		for (int i=0; i<numarray.length-1; i++) {
			numarray[i+1] = func(operatorarr.get(i),numarray[i],numarray[i+1]);
		}
		System.out.println(numarray[test-1]);
		

	}
	
	// 배열의 인덱스에 맞춰서 연산자를 return하는 함수
	static String operator(int[] arr,int num) {
		if(num==0) {
			return "+";
		}else if(num==1) {
			return "-";
		}else if(num==2) {
			return "*";
		}else {
			return "/";
		}
	}
	
	//연산함수
	static int func(String operator,int num1, int num2) {
		if (operator=="+") {
			return num1+num2;
		}else if (operator == "-"){
			return num1-num2;
		}else if(operator =="*") {
			return num1 * num2;
		}else {
			if (num1<0 && num2>0) {
				return -(Math.abs(num1)/num2);
			}else {
				return num1/num2;
			}
		}
	}
	
	static void permutation(int[] arr, int depth, int n, int r) {
	    if (depth == r) {
	        for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			};
			System.out.println();
	        return;
	    }
	 
	    for (int i=depth; i<n; i++) {
	        swap(arr, depth, i);
	        permutation(arr, depth + 1, n, r);
	        swap(arr, depth, i);
	        
	    }
	}
	 
	static void swap(int[] arr, int depth, int i) {
	    int temp = arr[depth];
	    arr[depth] = arr[i];
	    arr[i] = temp;
	}
	
	
	
}
	

