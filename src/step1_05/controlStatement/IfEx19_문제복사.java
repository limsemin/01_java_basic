package step1_05.controlStatement;

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_문제복사 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.print("이체할 계좌번호를 입력하세요 : ");
		int transmoney = scan.nextInt();
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
	
		System.out.print("이체할 금액을 입력하세요 : ");
		transmoney = scan.nextInt();

		if( transmoney <= myMoney) {
			myMoney= myMoney - transmoney;
			yourMoney = yourMoney + transmoney;
			System.out.println("이체되셨습니다.");
		}
		else if(transmoney > myMoney) {
			System.out.println("잔액이 부족합니다");
		}
	
			scan.close();
	
	}//연습

}
