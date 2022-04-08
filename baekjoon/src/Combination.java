import java.util.Arrays;

public class Combination {
	static int[] arr = {1,3,5,7,9};
	static int[] com = new int[3];
	static int n = 3; // 뽑을 숫자의 개수
	static int m = 5; // 전체 숫자의 개수
	static boolean[] visited = new boolean[5];
	public static void main(String[] args) {
//		combination1(0,0);
//		powerset(0);
		combination2(0, 0);
	}
	public static void combination1(int cur, int start) {
		if(cur == n) { //n개 다 뽑으면 출력
			for (int i : com) {
				System.out.print(i+" ");
			}
			System.out.println();
			return;
		}
		
		for (int i = start; i < m; i++) {
			com[cur] = arr[i];
			combination1(cur+1,i+1);
		}
	}
	
	public static void powerset(int idx) {
		if(idx == m) {
			for (int i = 0; i < arr.length; i++) {
				if(visited[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		
		visited[idx] = true;
		powerset(idx+1);
		visited[idx] = false;
		powerset(idx+1);

	}
	public static void combination2(int idx,int selCnt) {
		if(selCnt == n) {
			System.out.println(Arrays.toString(com));
			return;
		}
		
		if(idx == m) {
			return;
		}
		//selCnt 3개짜리 5C3 1번쨰거 뭐 고를래
		//고른거
		com[selCnt] = arr[idx];
		combination2(idx+1,selCnt+1);
		//안고른거
		combination2(idx+1,selCnt);
		
	}
}
