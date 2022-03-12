package 배열;
//3명의 이름을 배열에 넣은 후  출력하는 프로그램 
import java.util.Scanner;
public class StringArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name[] = new String[3];
		System.out.println("이름을 입력하시오.");
		for(int i=0;i<name.length;i++) {
			name[i] = scan.nextLine();
		}
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j]);
		}
	}

}
