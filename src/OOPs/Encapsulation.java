package OOPs;

public class Encapsulation {

	private String name;
	private String Name;
	
	
	public String getName() {
		return name;
		}
	public void setName(String Name, String name) {
		
	this.name=name;
	this.Name=Name;
	}
/*	 public String getname() {
		 return Name;
	 }
	 public void setname(String Name) {
		 this.Name=Name;
	 }
*/	
	public static void main(String args[]) {
		Encapsulation E = new Encapsulation();          //Creating object of super class
		
		E.setName("Rohit","Rohan"); 
		E.setName("Rohan", "Rohit");
		System.out.println(E.getName());
		
//		System.out.println(E.getname());
		
	}
}
