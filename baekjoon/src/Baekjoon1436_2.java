import java.util.Scanner;

public class Baekjoon1436_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력
		 
		int num = 666;
		int count = 1;
		 
		while(count != N) {
			num++;
		    
			// int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
			if(String.valueOf(num).contains("666")) { 
				count++;
			}
		}
		System.out.println(num);
	}
}
