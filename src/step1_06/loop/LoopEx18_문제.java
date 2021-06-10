package step1_06.loop;


public class LoopEx18_문제 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		for (int i = 1; i <= 5; i++) {
			System.out.print( " " + i );
		}
		System.out.println();
		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		for (int num = 1; num <= 10; num++){
			if(5 <= num && 9>= num)
			System.out.print(" " + num);
		}
		System.out.println();
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for (int me = 10; me >= 1; me--) {
			if(6 >= me && 3 <= me)
			System.out.print(" " + me);
		}

		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for (int i = 1; i <= 10; i ++) {
			System.out.print(i);
		}
		//자습 변수명은 i, j, k , l , m , n 국룰
	}

}
