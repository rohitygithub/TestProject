package Selenium_Java_Points;

public class ArraysWithLoopsAndConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st way of define array list
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
	
//	   System.out.println("Print array[2] value" + '\n' +arr[2]);
	
	   //2nd way of define array list
	   int[] arr2 = {1,2,3,4,5,6,7,10};
	   
	   //Define String in array list
	   String[] name = {"Rohit", "Rahul", "Shr", "Poonam"};
	   
//	   System.out.println("Print" + '\n'+ arr2[4]);
	   
	   //For loop to iterate over array
	   for(int i=0; i<name.length; i++) {
		   System.out.println("Print name's---->" + name[i]);
	   }
	
	}

}
