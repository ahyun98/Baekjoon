import java.util.Scanner;

public class Baekjoon2477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] direction = new int[6];
		int[] area = new int[6];
		int width = 0;
		int widid = 0;
		int heiid = 0;
		int height = 0;
		int smallwidth = 0;
		int smallheight = 0;
		for (int i = 0; i < area.length; i++) {
			direction[i] = sc.nextInt();
			area[i] = sc.nextInt();
		}
		for (int i = 0; i < area.length; i++) {
			if(direction[i]==1 || direction[i]==2) {
				if(width<area[i]) {
					width = area[i];
					widid=i;
				}
				
			}else {
				if(height<area[i]) {
					height = area[i];
					heiid=i;
				}
			}
		}

		
		smallwidth = Math.abs(area[(heiid+5)%6]-area[(heiid+1)%6]);
		smallheight = Math.abs(area[(widid+5)%6]-area[(widid+1)%6]);
		System.out.println((height*width - smallwidth*smallheight)*num);
	}
}
