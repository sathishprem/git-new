
public class Bank2 implements Bank,Bank1{

	@Override
	public void method1() {
		System.out.println("aaaa");
		
	}

	@Override
	public void method2() {
		System.out.println("bbbb");
		
	}

	public static void main(String[] args) {
		Bank2 b = new Bank2();
		b.method1();
		b.method2();
	}
}
