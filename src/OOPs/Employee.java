package OOPs;

public class Employee {
	
	int EmployeeID;
	String EmployeeName;
	String EmployeePosition;
	
	//Creating Constructor 
	public Employee() {
		System.out.println("CONSTRUCTOR");
		
	}
	//Constructor overloading e.g
	public Employee(int a, String n, String p) {
		
		EmployeeID=a;
		EmployeeName=n;
		EmployeePosition=p;
		System.out.println("Roooooo");
	}
	
	
	
	public void work() {
		
		System.out.println("Employee ID is" + EmployeeID);
	}
	
	public void FullDetails() {
		
		System.out.println("My name is" + EmployeeName);
		System.out.println("My ID is" + EmployeeID);
		System.out.println("My Poition is" + EmployeePosition);
	}

}
