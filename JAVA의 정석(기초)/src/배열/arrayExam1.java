package 배열;
//배열에 50,60,70,80을 각각 넣는 프로그램 
public class arrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[4];
		for(int i=0;i<num.length;i++) {
			num[i] = (50 + (i * 10));
			System.out.println(num[i]);
		}
		/*for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	
	}
	*/
	}
}
