package 정렬;

public class rangExam1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {5,4,9,7};
		int temp;
		/*for(int i=0;i<a.length;i++) {  //4번 반복 
			for(int j=0;j<a.length-1;j++) { 
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		*/
		for(int i=0;i<a.length;i++) {  // 배열 [4]의 숫자를 
			for(int j =0;j<a.length-1;j++) {  //(1회전) 5 > 4 | 5 > 9 | 5> 7 
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j] <= a[j+1]) {
					temp = a[j+1];
					a[j+1]=a[j];
					a[j] = temp;
				}
			}
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}
}
