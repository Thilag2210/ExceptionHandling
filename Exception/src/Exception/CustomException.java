package Exception;

class VoterIdException extends Exception{
	VoterIdException(int age){
		System.out.println("your age is:"+age);
	}

public static void verifyage(int age) {
	
		try {
			if(age<18) {
			throw new VoterIdException(age);
			}
			System.out.println("You are eliible to vote");
			
		}
		
		catch(VoterIdException e) {
			System.out.println("please check your age");
			System.out.println(e);
		}
	}
}

public class CustomException {

	public static void main(String[] args) {
		
VoterIdException.verifyage(17);
	}

}
