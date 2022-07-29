package OOPs;

public class Object {

	public static void main(String[] args) {
		
		Employee emp;
		emp=new Employee();
		
		emp.EmployeeName="Rohit";
		emp.EmployeeID=123;
		emp.EmployeePosition="Tester";
		
		emp.work();
		emp.FullDetails();
		
		Employee emp1;
		emp1=new Employee(12, "Rohit", "Tester" );
		
		emp1.EmployeeName="Rohan";
		emp1.EmployeeID=125;
		emp1.EmployeePosition="Developer";
		
		emp1.FullDetails();
		
		
		

	}
	
	
		
	}


