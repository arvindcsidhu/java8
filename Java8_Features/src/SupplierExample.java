import java.util.Date;
import java.util.function.Supplier;

public class SupplierExample {
	
	public static void main(String[] args) {
		
		Supplier<Date> date = ()-> new Date();
		System.out.println(date.get());
		
		Supplier<String> r = ()-> {
			
			
		String otp="";
		for(int i =0; i < 6;i++) {
			
			otp=otp+(int)(Math.random()*10);
		}
		return otp;
		};
		
		System.out.println(r.get());
	}

}
