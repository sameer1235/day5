package day5;

interface a1{
	void dis();
}
interface a2{
	
default void dis1(){
		System.out.println("this a default method in a2 interface");
		
	}
	void dis3();
}
interface a3{
	void a();
	
}
public class InterfaceDemo implements a1,a2,a3 {
	public void dis(){
		System.out.println("this is a method in a1 interface implemnted in child class");

		
	}
    public void dis3(){
    	System.out.println("this is a method in a2 interface implemented in child class");

	}
    public void a() {
	System.out.println("this is a method in a3 interface implemented in child class");

	}


	public static void main(String[] args) {
		
		InterfaceDemo id = new InterfaceDemo();
		id.dis();
		id.dis1();
		id.dis3();
		id.a();
		
	}
	
}
