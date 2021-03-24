package step1_05.controlStatement;

import java.util.Random;

/*	2021-03-22
 * # 당첨복권[1단계] 
 * 
 * 30%의 확률로 화면에 '당첨'이라는 글자가 화면에 출력된다.
 * 당첨되지 않은 경우는 '꽝'이라는 글자가 화면에 출력된다.
 */


public class IfEx15_문제 {

	public static void main(String[] args) {
	Random ran = new Random();
		int lsm = ran.nextInt(101);
		System.out.println(lsm);
		
		if(lsm < 30) 
		System.out.println("당첨");
		
		if(lsm >= 30)
			System.out.println("꽝");
	
	
	
	}
	

}
