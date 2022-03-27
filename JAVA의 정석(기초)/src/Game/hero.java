package Game;

import java.util.Scanner;

/*
 * 정적요소 : 영웅선택(아이언맨(슈트),스파이더맨(거미줄),블랙위도우(총)), 생명력
 * 동적요소 : 생성자, 악당을 공격하다,결과(이겼다, 졌다)
 */
public class hero {
	Scanner scan = new Scanner(System.in);
	int heroCho;
	int life;
	int attack;
	int power;
	String name;
	
	public hero(int heroCho,int life,int power) {
		this.heroCho = heroCho;
		this.life = life;
		this.power = power;
	}
	public void attack_villain(Villain item) {  //악당을 공격하다
		while(life != 0 && item.life != 0) {
		System.out.println("악당을 몇 번 공격할 것인가요 >> ");
		attack = scan.nextInt();
		if(item.life > (attack * power)) {
			item.life -= (attack * power);
			System.out.println("히어로의 남은 생명력은 "+item.life+" 입니다.");
		}else {
			switch(heroCho) {
			case 1: name="아이언맨(무기: 슈트)"; break;
			case 2: name="스파이더맨(무기:거미줄)"; break;
			case 3: name="블랙위도우(무기: 총)"; break;
			}
			System.out.println(item.name+ "이 죽었습니다." +this.name+" 의 승리입니다.");
			item.life=0;
		}
	}
}
}
