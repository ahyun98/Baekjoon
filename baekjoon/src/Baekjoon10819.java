import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10819 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int n;
	static int[] arr;
	static int[] arr2;
	static boolean[] visited;
	static int total;
	static int answer = Integer.MIN_VALUE;
	public static void main(String[] args) throws IOException{
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		// 순열 돌리고 싶은 숫자 넣기
		arr2 = new int[n];
		//순열 돌은 결과 배열
		visited = new boolean[n];
		// 그 숫자 넣었는지 안넣었는지 확인하는 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 받아온거 arr에 넣는 과정
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 함수 실행
		recur(0);
		// answer값이 바뀌므로 answer값 출력
		System.out.println(answer);
		
	}
	static void recur(int cur) {
		// 나가는 조건, n번째까지 숫자 다채우면 나갈거임
		if(cur == n) {
			total = 0;
			// 대신 나가기 전에 만들어진 순열 arr계산해서 값 확인
			for (int i = 1; i < arr.length; i++) {
				total += Math.abs(arr2[i]-arr2[i-1]);
			}
			// 이미 들어간 값이랑, 방금 만든 total비교해서 최대값 반환
			answer = Math.max(answer,total);
			return;
		}
		
		//재귀 구현
		// arr의 모든 숫자들 다 확인해볼거임
		for (int i = 0; i < arr.length; i++) {
			// 만약에 i번째 숫자가 이미 쓴 숫자면 넘어가
			if(visited[i]) continue;
			// 아직 안 쓴 숫자면 지금 위치에 숫자 집어넣어
			arr2[cur] = arr[i];
			// 이제 집어넣었으니까 쓴걸 알리기 위해 true로 바꿔줌
			visited[i] = true;
			// 집어넣었으니까 다음 위치에 뭐넣을지 정하기
			recur(cur+1);
			// 순열 다 계산해서 나갔으면 이제 다시 돌아와서 visited 다시 false로 돌려주기
			visited[i] = false;
			
		}
	}
}
