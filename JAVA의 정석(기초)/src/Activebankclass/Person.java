package Activebankclass;

public class Person {
	int money;  //현재 가지고 있는 돈 
	String ebank; //은행 계좌이름
	int balance;	//계좌잔액
	
	public Person(int money,String ebank,int balance) {
		this.money = money;
		this.ebank = ebank;
		this.balance = balance;
	}
	
	public void money_input() {
		balance += money;
	}
	public void money_spend(int getmoney) {
		balance -= getmoney;
	}
	public void Print() {
		System.out.println("현재 "+ebank+"의 남은 잔액은 : "+balance+"입니다.");
	}
}

