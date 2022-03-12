package 반복문;
import java.util.Scanner;
public class ForExam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("*을 출력할 라인의 수를 입력하세요. > ");
		Scanner scan = new Scanner(System.in);
		int starL = scan.nextInt();
		
		for(int i=1;i<=starL;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
