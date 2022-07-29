package Core_Java_Basic_Concept;

public class EXPT {

	public static void main(String[] args) {
		try {

			int result=divide(4,2);
			System.out.println(result);
			
//			int a=0/2;
//			try {
//			System.out.println(result);
//			}catch(Exception ex) {
//			throw ex;
//		}
		}catch(Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}finally {
			System.out.println("finally block");
		}

	}
	
	
	public static int divide(int a , int b) throws Exception {
		try {
			int c=a/b;
			return c;
		}catch(Exception ex) {
			throw ex;
		}
		
	}

}
