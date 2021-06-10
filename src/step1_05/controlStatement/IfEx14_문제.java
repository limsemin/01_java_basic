package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/* 2021-03-22
 * # 코인 게임
 * 
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */

public class IfEx14_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int coin = ran.nextInt(2);
		
		//if(0 == coin) {
			//System.out.println("앞면");
		//}
		//if(1 == coin) {
			//System.out.println("뒷면");
		//}
		
		System.out.println("동전의 앞면 (0), 뒷면(1)");
		
		int lsm = scan.nextInt();
		if( coin == lsm) {
			System.out.println("정답입니다.");
		}
		int lsm2 = scan.nextInt();
		if( coin != lsm) {
			System.out.println("틀렸습니다.");
		}
		scan.close();




	}

}
