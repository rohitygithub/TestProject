package Method_Overriding;

public class Parent {
	//Overriding method 
	public void method1() {
		
		System.out.println("Method1 of parent class");
	}

}

class Child extends Parent {
	//Overriding method
	public void method1() {
		
		System.out.println("Method2 of child class");
	}
}
