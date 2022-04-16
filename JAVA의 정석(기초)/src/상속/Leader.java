package 상속;
 
public class Leader extends Student {
	boolean president;
	public Leader(String name, int hakbun,boolean president) {
		super(name, hakbun);
		this.president = president;
	}
	
	void hello() {}
	
	void isLeader() {
		if(president == true) {
			System.out.println(name+"은 "+"학급회장이다");
		}else {
			System.out.println(name+"은 학급회장이 아니다.");
		}
	}
}
