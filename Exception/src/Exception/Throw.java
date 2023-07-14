package Exception;

public class Throw {

	public static void main(String[] args) {
		int age=13;
		if(age<18) {
			throw new ArithmeticException("Person is not eligible to vote");  
		}else {
			
			  System.out.println("Person is eligible to vote!!"); 
		}

	}

}
