package 조건문;
import java.util.Scanner;
public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		if(input !=0) {
			System.out.printf("입력하신 숫자는 0이 아닙니다%n");
			System.out.printf("입력하신 숫자는 %d입니다",input);
		}
	}

}
