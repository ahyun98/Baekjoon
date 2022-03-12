import java.util.Scanner;

public class Baekjoon1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 666;
		int[] arr = new int[10000];
		arr[0] = 666;
		int id = 1;
		int t = 0;
		int k = 0;
		for(int j=1; j<6; j++) {
			arr[id] = j*1000+num;
			id++;
			k++;
		}
		
		while (id < 9000) {
			if(id<9000) {
				for (int j = 0; j <= 9; j++) {
					arr[id] = t * 100 + num * 10 + j;
					id++;
				}			
			}
			for (int j = 10*t+7; j <(t+1)*10+6; j++) {
				arr[id++] = j*1000+num; 
			}
			t++;
		}

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}

	}
}
