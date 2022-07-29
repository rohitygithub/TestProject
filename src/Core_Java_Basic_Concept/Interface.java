package Core_Java_Basic_Concept;

interface Interface  {
	
	String Employee_Name="Rohit";
	int ID_No();
	
}
interface Second{
	void F1();
}

interface Third{
	void F2();
}
interface Four extends Second, Third{
	
}

class EG implements Four{

	@Override
	public void F1() {
		System.out.println("Press F1 key");
		
	}

	@Override
	public void F2() {
		System.out.println("Press F2 key");
		
	}
	public void F3() {
		System.out.println("Press F3 key");
	}
	
}

class AB extends EG implements Four{
	
	
	
	
}

 