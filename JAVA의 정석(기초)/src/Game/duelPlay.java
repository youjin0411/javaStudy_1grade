package Game;

public class duelPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hero h1 = new hero(1,100,30);
		Villain v1 = new Villain(1,100,20);
		
		h1.attack_villain(v1);
		v1.attack_hero(h1);
		
	}

}
