
public class StudentbyClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("±èÀ¯Áø", 'S', 100000);
		Student s2 = new Student("±èÀ²¾Æ",'L',100000);
		
		Clothes c1 = new Clothes("Æ¼¼ÅÃ÷",10000,50);
		Clothes c2 = new Clothes("¹ÙÁö",4000,20);
		Clothes c3 = new Clothes("¿øÇÇ½º",20000,10);
		
		s1.buyClothes(c1, 3);
		s1.printResult(c1);
		c1.printCresult();
		
		s2.buyClothes(c3, 2);
		s2.printResult(c3);
		c3.printCresult();
	}

}
