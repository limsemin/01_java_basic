package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_문제 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
	int answer = 0;
	int score = 0;
	int i = 1;
	
	while(i <= 5) {
		
		int x = ran.nextInt(8) + 2; // 2 ~ 9
		int y = ran.nextInt(9) + 1; // 1 ~ 9
		int ansr = x * y;
		
		System.out.print(x + "x" +  y + "=");
		int anser = scan.nextInt(); 
		
		if(ansr == anser) {
			answer++;
		}
		i++;
	}
	score = answer * 20;
	System.out.println("점수 : " + score +"점");
	scan.close();
		
	}

}
