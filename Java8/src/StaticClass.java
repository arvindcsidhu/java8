interface staticblock{
	
	public static void m1() {
		System.out.println("static");
	}
}

interface mainmethod{
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
}

public class StaticClass implements staticblock{

	public static void main(String[] args) {
		
		staticblock.m1();
		mainmethod.main(args);
	    
		
	}
}
