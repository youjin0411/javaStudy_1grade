/*
 * 정적요소 : 적이름, 생명력, 무기
 * 동적요소 : 생성자, 공격을 하다, 공격을 받아, 출력
 */
public class enemy {
	 String ename;
	 int elife;
	 int eweapon;
	 
	 public enemy(String name, int elife, int eweapon) {
		 this.ename = name;
		 this.elife = elife;
		 this.eweapon= eweapon;
	 }
	 
	 public void eattack(player item,int acount) {
		 if((item.life)-(acount * eweapon)==0) {
			 System.out.println(item.name+"이 죽었습니다.");
		 }else {
			 item.life -= (acount * eweapon);
			 System.out.println(item.name+"생명력이 "+item.life+"남았습니다.");
		 }
	 }
}
