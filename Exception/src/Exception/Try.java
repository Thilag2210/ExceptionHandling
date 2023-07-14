package Exception;

public class Try {

	public static void main(String[] args) {
		try {
			int data=25/0;
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("i am coming for You...");
		}
		finally {
			System.out.println("i am waiting");
		}

	}

}
