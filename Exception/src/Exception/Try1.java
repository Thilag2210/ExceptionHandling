package Exception;

public class Try1 {

	public static void main(String[] args) {
		try {
				int arr[]= {1,2,3};
				System.out.println(arr[10]);
		}
		catch(Exception b) {
			System.out.println(b);
			System.out.println("I am back");
			
		}
	}

}
