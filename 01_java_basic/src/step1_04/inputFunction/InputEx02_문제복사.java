package step1_04.inputFunction;

import java.util.Scanner;

public class InputEx02_문제복사 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.print(1);
		int getNum1 = scan.nextInt();
		System.out.print(2);
		int getNum2 = scan.nextInt();
		System.out.println("두 수의 합은 : " +getNum1 + getNum2 + "입니다.");
		
		// 문제2) 숫자 1개를 입력받아서 , 홀수이면 true 출력
		System.out.print(1);
		int getNum3 = scan.nextInt();
		System.out.println(getNum3 == 1);
		
		// 문제3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println();
		
		scan.close();
	}
	
}
