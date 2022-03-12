package 반복문;
//최대값 구하는 프로그램(0이 되면 종료)
/*import java.util.Scanner;
public class ForExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max=0;
		int input;
		do {
			System.out.print("숫자를 입력해주세요: ");
			input = scan.nextInt();
			if(input >= max) {
				max = input;
			}
		}while(input != 0);
		System.out.println("최대값은  "+max+" 입니다.");
	}

}
*/
import java.util.Scanner;
public class ForExam2{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int input; //입력받을 수 
		int max = 0; //최대값 
		
		do {
			System.out.print("숫자를 입력해주세요 > ");
			input = scan.nextInt();
			if(input >= max) {
				max = input;
			}
		}while(input != 0);
		System.out.println("최대값은  "+max+" 입니다.");
	}
}
