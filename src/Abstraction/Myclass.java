package Abstraction;

abstract public class Myclass {    //abstract class
	
	public void abs() {
		
		System.out.println("Complete method");
	}
	

	

}

class com extends Myclass{         //inherit the class
	
}

class Run{
	
	public static void main (String args[]) {
		
		Myclass MC=new com();                   //create reference variable of abstract class

		MC.abs();
	}
}
