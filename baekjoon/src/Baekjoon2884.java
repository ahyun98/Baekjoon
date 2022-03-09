import java.util.Scanner;

public class Baekjoon2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int newH;
		int newM;
		if(M<45) {
			if(H<1) {
				newH = 23;
			}else {				
				newH = H-1;
			}
			newM = 60+M-45;
		}else {
			newH = H;
			newM = M-45;
		}
		System.out.println(newH+" "+newM);
	}
}
