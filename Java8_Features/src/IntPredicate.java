
public class IntPredicate {
	
	public static void main(String[] args) {
		
		java.util.function.IntPredicate p = i->i%2==0;
		System.out.println(p.test(11));
		
		
	}

}
