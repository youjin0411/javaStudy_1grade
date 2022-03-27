package 조건문;
import java.util.Scanner;
public class FlowEx4 {
/*
 * 		가위(1)  바위(2)	보(3)   => 컴퓨터
 * 가위    무승부0	컴승-1	사람승-2
 * 바위	사람 승1 	무승부0	컴승-1
 * 보	컴승2		사람승1	무승부0
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.");
		
		int user = scan.nextInt();
		int com = (int)(Math.random() *3)+1; //1,2,3 중 하나가 com에 저장
		
		System.out.println("당신은 "+user+"입니다.");
		System.out.println("컴은 "+ com + "입니다.");
		
		switch(user - com) {
		case -1: 
		case 2: 
			System.out.println("당신이 졌습니다.");break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");break;
		case 0:
			System.out.println("비겼습니다."); break;
	}

	}
}
