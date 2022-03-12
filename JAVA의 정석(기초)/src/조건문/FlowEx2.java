package 조건문;
import java.util.Scanner;
public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요.> ");
		
		score = scan.nextInt();
		
		System.out.println("당신의 점수는 "+score+"입니다.");
		
		if(score >= 90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}else if(score<94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				grade ='+';
			}else if(score <= 84) {
				grade = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.println("당신의 학점은 "+grade+opt+"입니다.");
	}

}
