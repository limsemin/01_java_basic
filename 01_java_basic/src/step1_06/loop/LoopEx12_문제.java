package step1_06.loop;

/* 2021 03 25 //미숙
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_문제 {

	public static void main(String[] args) {
		
		int me = 1; //변수 me 는 1
		
		while(me <= 50) { //변수 me 는 50보다 작거나같다
			int location1 = me / 10; // 변수는 me/10이다 1
			int location2 = me % 10; // 변수는 me % 10 나머지 9
			
			int validateCnt = 0;
			
			if(location1 != 0 && location1 % 3 == 0 ) 
				validateCnt++;
			if(location2 != 0 && location2 % 3 == 0 )	
				validateCnt++;
		
			
			if(validateCnt == 1) 
				System.out.println("짝");
			else if(validateCnt == 2)
				System.out.println("짝짝");
			else
				System.out.println(me);
			me++;
		}

	}

}
