package OOPs;

public class Method_Overloading {
	
	void add() {
		
		int a=10, b=20, c;
		c=a+b;
		System.out.println(c);
	}
	void add(int x, int y) {
		
		int c;
		c=x+y;
		System.out.println(c);
		
	}
	 void add(int x, int y, int z) {
		 int c;
		 c=x+y+z;
		 System.out.println(c);
	 }
	 
	 public static void main(String args[]) {
		 
		 Method_Overloading M =new Method_Overloading();
		 M.add(122,444);
		 
		 
	 }

}
