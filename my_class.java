package oops_prob;

public class my_class {
	static int count=0;
	final double pi=3.1415;
	my_class(){
		count++;
	}
	public void display() {
		System.out.println(count+" "+pi);
	}
	public static void main(String[] args) {
		my_class obj1=new my_class();
		obj1.display();
		my_class obj2=new my_class();
		obj2.display();	
	}
}
