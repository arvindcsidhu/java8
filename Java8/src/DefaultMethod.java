interface A{
	
	default void m1() {
		System.out.println("default");
	}
	void m2();
	void m3();
}

public class DefaultMethod implements A{

	@Override
	public void m2() {
		System.out.println("test");
	}

	@Override
	public void m3() {
		System.out.println("test1");
	}
	
	public static void main(String[] args) {
		
		DefaultMethod m = new DefaultMethod();
		m.m1();
		
	}

}
