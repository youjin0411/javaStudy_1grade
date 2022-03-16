/*
 * 정적요소: 이름, 사이즈, 잔액
 * 동적요소: 생성자, 학생이 옷을 사다, 출력(어떤 옷을 샀는가? 잔액은 얼마인가); 
 */
public class Student {
	String name;
	char size;
	int balance;
	int scount;
	
	public Student(String name,char size,int balance) {
		this.name= name;
		this.size = size;
		this.balance = balance;
	}
	
	
	public void buyClothes(Clothes item,int count) {  //학생이 옷을 사다
		if(item.quantity >= count) {
			item.sellClothes(count);
			balance -=(count * item.cprice);
			scount = count;
		}
	}
	
	public void printResult(Clothes item) {
		System.out.println(">>>> "+name+"의 옷 쇼핑 현황  <<<<");
		System.out.println(item.cname+"("+item.cprice+")"+"을 "+scount +"개 구매하였습니다.");
		System.out.println("잔액은 "+this.balance+"입니다");

	}
}
