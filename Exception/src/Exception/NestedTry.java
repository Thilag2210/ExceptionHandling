package Exception;

public class NestedTry {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Good Morning");
				int b=39/0;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				int a[]=new int[5];
				a[5]=4;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Good Afternoon");
		}
		catch(Exception e) {
			System.out.println("This is for outer try");
		}
		System.out.println("Good Evening");
	}

}
