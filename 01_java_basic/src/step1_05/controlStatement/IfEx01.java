package step1_05.controlStatement;

public class IfEx01 {

	public static void main(String[] args) {
		
		if(true)	{
		System.out.println("실행O");//if문 안의 명령어는 tab키로 들여쓰기 한다.
		}
		
		if(false)	{
		System.out.println("실행O");//if문 안의 명령어는 tab키로 들여쓰기 한다.
		}
		int number = 7;
		if(number % 2 == 0) {
			System.out.println("짝수");
		}
		
		if(number % 2 == 1) {
			System.out.println("홀수");
		}
		
		//if문 안의 명령어가 1줄이면 {}를 생략할 수 있다.
		if(number % 2 == 0)		System.out.println("짝수");
		
		if(number % 2 == 1)		System.out.println("홀수");
		
		
	}
		
}
		