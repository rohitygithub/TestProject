package OOPs;

 interface Bank {
	
	String B_ID = "AQ201";
	void C_No();

}

 interface School{
	 
	 void S_No();
	
}
 
 interface Collage extends School, Bank {
	 void T_No();
 }
 
 class Univercity implements Collage{
	 
	public void S_No() {
		
		System.out.println("1234567");
		 
	 }
	public void C_No() {
		
		System.out.println("097654");
	}
	
	public void T_No() {
		
		
	}
	public static void main (String args[]) {
		
		Univercity U =new Univercity();
		U.C_No();
		U.S_No();
		U.T_No();
	}
 }
