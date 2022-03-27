package 클래스;

public class Book {
	String tittle;
	String autor;
	
	public void show() {
		System.out.println(tittle + " "+autor);
	}
	
	public Book() {
		this("","");
		System.out.println("생성자 호출");
	}
	public Book(String tittle) {
		this(tittle,"작자미상");
	}
	
	public Book(String tittle,String autor) {
		this.tittle = tittle;
		this.autor = autor;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book empotyBook = new Book();
		
		loveStory.show();
		littlePrince.show();
		empotyBook.show();
	}

}
