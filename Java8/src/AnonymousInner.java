
public class AnonymousInner {

	public static void main(String[] args) {
		
		Thread t = new Thread() {
			
			public void run() {
				// TODO Auto-generated method stub
					System.out.println("test");
			}
		};
		t.start();

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runnable");
				
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
	}
	
	
	
}
