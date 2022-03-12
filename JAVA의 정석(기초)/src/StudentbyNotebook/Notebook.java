package StudentbyNotebook;
/*
 * 정적요소 : 수량, 가격, 매출액
 * 동적요소 : 생성자, 공책을 판매하다, 출력 
 */
public class Notebook {
	int Quantity; //수량
	int price;
	int take; //매출액
	
	public Notebook(int Quantity,int price) {
		this.Quantity=Quantity;
		this.price=price;
	}
	
	public void sale(int amount) {
		if(Quantity >= amount) {
			Quantity -=amount;
			take += (amount * price);
		}else {
			System.out.println("재고량 부족 !! 구매 불가 ");
		}
	}
	
	public void PrintNotebook() {
		System.out.println("=====공책의 판매량 =====");
		System.out.println("재고량  :"+this.Quantity);
		System.out.println("매출액 :" + this.take);
	}
}
