
public class array {
	//이거 그냥 함수 부르는거임
	public static void main(String[] args) {
		//이거도 그런거라고 생각하면 됨
		int cnt = 0; //cnt 0으로 초기화 시켜주기
		
		do {
			//일단 조건 확인 안하고 무지성으로 이 부분 돌려
			cnt++;
			//cnt=cnt+1이랑 똑같음
		} while(cnt<0); //이거는 한번 돌리고 나서부터 확인하겠다는 얘기야
		//조건은 0보다 작을 때까지만 돌라고 한거지?
		// 그래서 이 do while문은 일단 do에서 시킨거 한번 해
		// 그럼 cnt가 1이 되지
		// 그다음에 이제부터 반복문을 돌리려면 조건에 맞아야되는데?
		//조건은 cnt가 0보다 작을때니까 반복 안돌고 끝나겠지
		// 그럼 cnt는 지금 1이야
		
		if(cnt==1){
			//cnt가 1이면 
			cnt++;
			//cnt=cnt+1이니까 지금 cnt가 2 됨
		}else {
			cnt = cnt+3;
			//이건 안돌지 cnt가 1이니까
		}
		System.out.printf("%d",cnt);
		//이건 그냥 출력문
	}
}
