package Core_Java_Basic_Concept;

public class Type_Casting {

	public static void main(String[] args) {
		// 1. Automatically By JVM (Implicit Type Casting)
		// 2. Forcefully By Programmer (Explicit Type Casting)
		
		//1.
		
		int i = 50;
		double d = i;
		
		System.out.println(i);
		System.out.println(d);
		
		//2.
		
		double myval=10.26;
		int myint=(int) myval;
		
		System.out.println(myval);
		System.out.println(myint);

	}

}
