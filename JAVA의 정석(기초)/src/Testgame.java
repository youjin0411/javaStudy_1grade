
public class Testgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player p = new player("±èÀ¯Áø",100,10);
		enemy e = new enemy("µå·¡°ï",90,10);
		
		p.attack(e, 5);
		p.attack(e,4);
	}

}
