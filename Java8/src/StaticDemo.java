
public class StaticDemo {

	 public static void m1() {
		 
		 System.out.println("sidhu");
	 }
	 
 public static void m2() {
		 
		 System.out.println("chandrappa");
	 }
 
 public static void main(String[] args) {
	
	  m1();
	  m2();
	  StaticDemo.m1();
	  StaticDemo.m2();
	  StaticDemo d= new StaticDemo();
	  d.m1();
	  d.m2();
}
}
