package 조건문;
import java.util.Scanner;

public class FlowEx3 {
	public static void main(String args[]) {
		System.out.print("현재 월을 입력하세요. > ");
		
		Scanner scan = new Scanner(System.in);
		int month;
		
		month = scan.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄 입니다.");break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름 입니다."); break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을 입니다.");break;
		case 12: 
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울 입니다."); break;
			
		}
	}
}
