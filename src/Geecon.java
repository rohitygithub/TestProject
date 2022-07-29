
 abstract class Geecon {
	
	 void Galaxy() {
		System.out.println("Samsung Galaxy Store");
	}
	 abstract void Shop();
	 Geecon(){
		 System.out.println("Geecon is a IT Company");
	 }
 }
	 class Store extends Geecon{
		 void Showroom() {
			 System.out.println("Computer");
		 }
		 void Shop() {
			 System.out.println("Mobail Shop");
		 }
	 }
	 class Abstraction1{
		 public static void main (String arg[]) {
			 Store G = new Store();
			 G.Galaxy();
			 G.Shop();
			 
			 
			 
			 
		 }
	
}

