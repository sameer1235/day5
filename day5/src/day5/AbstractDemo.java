package day5;

abstract class ab{
	void dis(){
		System.out.println("This is non abstract method in abstract class");
	}
	abstract void get();
}

public class AbstractDemo extends ab {
	void get(){
		System.out.println("This is a implemented method of abstract class in sub class");
		
	}

	public static void main(String[] args) {
		//ab o = new ab();
		
		
		AbstractDemo abs = new AbstractDemo();
		abs.dis();
		abs.get();
		
		



	}

}
