package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int i = 1;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		while(i <=5 ) {
			System.out.print("메뉴선택 : ");
		int choice = scan.nextInt();
			
		if(choice == 1)  count++;
		else if(choice == 2) count1++;
		else if(choice == 3) count2++;
			
			i++;	
		}
		int totprice = price1 * count + price2*count1 + price3*count2;
			System.out.println("총 금액 : "+totprice + "원");
			System.out.print("지불 금액 : ");
			int money = scan.nextInt();
			
			int receipt = money - totprice;
			
		if(receipt >= 0 ){
				
			System.out.println("=====롯데리아 영수증=====");
			System.out.println("불고기 버거 "+ count + "개");
			System.out.println("새우    버거 "+ count1 + "개");
			System.out.println("콜          라 "+ count2 + "개");
			System.out.println("총 지불금액 "+totprice + "원");
			System.out.println("잔          액 "+receipt + "원");
		}
		
		else{
			System.out.println("현금이 부족합니다.");
			
		}
			
		scan.close();
		
			
	}

}
