package Game;
/*
 * 정적요소 : 악당선택(빌런(도끼),독거미(독거미줄),스파이(총)), 생명력
 * 동적요소 : 생성자, 영웅을 공격하다,결과(이겼다, 졌다)
 */
import java.util.Scanner;
public class Villain {
	Scanner scan = new Scanner(System.in);
	int VillainCho;
	int life;
	int attack;
	int power;
	String name;
	
	public Villain(int VillainCho, int life,int power) {
		this.VillainCho = VillainCho;
		this.life = life;
		this.power = power;
	}
	
	public void attack_hero(hero item) {
		while(life != 0 && item.life != 0) {
		System.out.println("영웅을 몇 번 공격할 것인가요 >> ");
		attack = scan.nextInt();
		if(item.life > (attack * power)) {
			item.life -= (attack * power);
			System.out.println("히어로의 남은 생명력은 "+item.life+" 입니다.");
		}else {
			switch(VillainCho) {
			case 1: name="빌런(무기:도끼)"; break;
			case 2: name="독거미(무기:독거미줄)"; break;
			case 3: name="스파이(무기: 총)"; break;
			}
			System.out.println(item.name+ "이 죽었습니다." +this.name+" 의 승리입니다.");
			item.life=0;
		}
		}
	}
}
