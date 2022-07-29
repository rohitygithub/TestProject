package Core_Java_Basic_Concept;

public class Interface_body implements Interface {

	public static void main(String[] args) {
		
		Interface_body obj=new Interface_body();
		obj.Employee_Name();
		obj.ID_No();
		AB OBJ =new AB();     //or EG OBJ=new EG();
		OBJ.F1();
		OBJ.F3();
		
	}

	public String Employee_Name() {
		System.out.println("Rohit");
		return null;
	}

	@Override
	public int ID_No() {
		System.out.println("Id No: 10");
		return 0;
	}

	

}


