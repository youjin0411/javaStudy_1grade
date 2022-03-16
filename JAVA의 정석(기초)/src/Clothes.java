/*
 * 정적 요소: 옷 이름, 옷 가격, 매출액
 * 동적 요소: 생성자, 옷을 판매하다, 출력(어떤 옷들을 팔아, 매출액은 얼마이다)
 */
public class Clothes {
	String cname;
	int cprice;
	int quantity;
	int take;
	int ccount;
	
	public Clothes(String cname, int cprice, int quantity) {
		this.cname = cname;
		this.cprice = cprice;
		this.quantity =quantity;
	}
	
	public void sellClothes(int count) {
		if(quantity >= count) {
			quantity -= count;
			take += (count * cprice); 
			ccount = count;
		}
	}
	
	public void printCresult() {
		System.out.println(">>>> "+cname+" "+ccount+"개 판매하였습니다.");
		System.out.println("매출액은 "+this.take+"입니다.");
		System.out.println();
	}

}
