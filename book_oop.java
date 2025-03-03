package oops_prob;

public class book_oop {
	String title,Author;
	int year;
	book_oop(String title,String Author,int year){
		this.title=title;
		this.Author=Author;
		this.year=year;
	}
	public void display() {
		System.out.println(title+" "+Author+" "+year);
	}
	public static void main(String[] args) {
		book_oop book1=new book_oop("wings","keyfer",2019);
		book1.display();
		book_oop book2=new book_oop("Bravery","James",2004);
		book2.display();
	}

}
