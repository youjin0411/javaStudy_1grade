/*
 * 정적요소 : 이름, 생명, 무기
 * 동적요소  : 생성자, 적을 공격하다, 공격을 받다, 출력 
 */
public class player {
	String name;
	int life;
	int weapon;
	int count;
	
	public player(String name, int life, int weapon) {
		this.name = name;
		this.life = life;
		this.weapon = weapon;
	}
	
	public void attack(enemy item,int count) {
		if(((item.elife)-(count * weapon)) <= 0) {
			System.out.println("적이 사망했습니다.");
		}else {
			item.elife -= count * weapon;
			System.out.println(item.ename+"의 생명력이 "+item.elife+"남았습니다.");
		}
	}
}
