package ch08;

public class BookUse {
	public static void main(String[] args) {
		Book b = new Book("Java", "유재준", "모름", 2021, 45000, 10);
	b.print();
	
	Book b2 = new Book();
	b2.print();
	}
}
