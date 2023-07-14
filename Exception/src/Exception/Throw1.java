package Exception;
class A{
	void cbe(int age) {
		if(age>18) {
			throw new ArithmeticException ("Eligible");
		}else {
			System.out.println("not eligible");
		}
	}
}
public class Throw1 {

	public static void main(String[] args) {
		A a=new A();
		a.cbe(21);
		
	}

}
