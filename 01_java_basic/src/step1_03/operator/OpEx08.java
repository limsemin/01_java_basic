package step1_03.operator;

/*
 * 
 * 삼항 연산자
 * 
 * [ 형식 ]
 * 
 * 조건식 ? 참일대의 결과값 : 거짓일때의 결과값
 * 
 * 
 * */

public class OpEx08 {

	public static void main(String[] args) {

	int	totalGrade = 60;
	
	System.out.println(totalGrade >= 60 ? "합격" : "불합격");
	System.out.println(totalGrade < 60 ? "합격" : "불합격");
	
	char result = totalGrade >= 60 ? 'P' : 'F';
	System.out.println(result);	
	}

}
