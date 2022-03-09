

import java.util.Scanner;

public class Baekjoon11586 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		char[][] original = new char[num][num];
		char[] test = new char[3];
		String word;

		
	
		
		// 배열에 값 넣기
		for (int i = 0; i < num; i++) {
			word = sc.next();
			for (int j = 0; j < num; j++) {
				original[i][j] = word.charAt(j);
			}
		}
		
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				System.out.print(original[i][j] + " ");
//
//			}
//			System.out.println();
//		}
		
		int mirror = sc.nextInt();
		if(mirror == 1) {
			originalprint(original);
		}else if (mirror == 2) {
			leftrightprint(original);
		}else if (mirror == 3) {
			updownprint(original);
		}else {
			System.out.println("error");
		}
		
	}
	
	static void originalprint(char[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	//좌우반대 프린트
	static void leftrightprint(char[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][arr[i].length-j-1]+" ");
				
			}
			System.out.println();
		}
	}
	
	//위아래 반대 프린트
	static void updownprint(char[][] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[arr.length-i-1][j]);
				
			}
			System.out.println();
		}
	}
	
	
	
	
}
