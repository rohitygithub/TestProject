package Core_Java_Basic_Concept;

public class Switch_Statement {

	public static void main(String[] args) {
		// Example of Switch_Statement
		
	   String i="10.56 ";
		
		switch (i) {
		
		case "8":
			System.out.println("Yes it is Jan month");
			break;
			
		case "9":
			System.out.println("Yes it is Feb month");
			break;
		
		case "10.56":
			System.out.println("Yes it is March month");
			break;
			
		case "12":
			System.out.println("Yes it is April month");
			break;
			
		default:
			System.out.println("No more");
		
		}

	}

}
