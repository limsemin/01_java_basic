package step1_06.loop;


/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답예시 {

	public static void main(String[] args) {
		
		int i = 1;	//i =1 
		
		while (i <= 50) { // i는 50보다 작거나 같다
			
			int location10 = i / 10; //변수는 i =1 / 10
			int location1 = i % 10; // 변수는 10의 나머지는 i
			
			int validateCnt = 0; 
			
			if (location10 != 0 && location10 % 3 == 0) validateCnt++;
			if (location1 != 0  && location1 % 3 == 0)  validateCnt++;
			
			
			if		(validateCnt == 2) System.out.println("짝짝");
			else if (validateCnt == 1) System.out.println("짝");
			else 					   System.out.println(i);
			
			i++;
			
		}

	}

}
