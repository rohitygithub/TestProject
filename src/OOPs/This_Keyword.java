package OOPs;

public class This_Keyword {
	
	int a;
	 This_Keyword(int a){
		this.a=a;
	}
	void show() {
		
		System.out.println(a);
		
	}
	public static void main (String args[]) {
		This_Keyword T = new This_Keyword(100);
		T.show();
		
	}
	

}
