package step1_03.operator;

//2021-03-17 16 : 40 ~ 17 : 28
public class OpEx02_문제 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		System.out.println(1000 - 200);
		System.out.println("잔돈 = " + (1000 - 200) + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		System.out.println();
		System.out.println("연봉: " + 100 * 12 + "원");
		System.out.println("세금: " + 1200/10 + "원");
		System.out.println("세후연봉: " + ( 1200 - 120) + "원");
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		System.out.println();
		System.out.print("총합계: ");
		System.out.println(30 + 50 + 4 + "점");
		System.out.print("평균: ");
		System.out.println(84 / 3 + "점");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		System.out.println();
		System.out.print("넓이: ");
		System.out.println(3 * 6 / 2);
		//문제4) 100초를 1분 40초로 출력
		System.out.println();
		System.out.println(100 / 60);
		System.out.println(100 % 60);
		System.out.println(100 / 60 + "분" + 100 % 60 + "초" );
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수 출력
		//정답5) 500원(1개), 100원(3개)
		System.out.println();
		System.out.println(800 / 500 );
		System.out.println(800 % 500 / 100);
		System.out.print("500원: ");
		System.out.print(800 / 500 + "개");
		System.out.println();
		System.out.print("100원: ");
		System.out.print(800 % 500 / 100 + "개");
		
		
		
	}

}
