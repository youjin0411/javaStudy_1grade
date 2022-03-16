//최대값 구하는 프로그램 (0을 입력 시 숫자 입력 중지) 
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int max = 0;
	
		do {
			System.out.print("숫자를 입력해주세요.> ");
			num = scan.nextInt();
			if(num >=  max) {
				max = num;
			}
		}while(num != 0);
		
		System.out.println("최대값은 "+max +" 입니다.");
	}

}
