package OOPs;

public class polymorphism {

	void Drow() {
		System.out.println("Can't see shape type");
	}
}
class Circle extends polymorphism{
	
	@Override
	void Drow() {
		super.Drow();                                  
		System.out.println("see the shape is circle type");
	}
	public static void main (String args[]) {
		
		polymorphism P =new Circle();
		P.Drow();
		
	}
}

