
public class MethodReference {
	
	private static int m1() {
		
		for(int i =0 ;i< 10;i++) {
			System.out.println("child thread");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		Runnable r = MethodReference :: m1;
		Thread my = new Thread(r);
		my.start();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("main thread");
		}
		
		
	}

}
