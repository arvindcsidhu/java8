import java.util.function.Predicate;

public class PredicateEven {
	
	public static void main(String[] args) {
		
		int x[] = {0,5,10,15,20,25,30,35};
		Predicate<Integer> even = e -> e%2==0;
		Predicate<Integer> greaterThan10 = g->g > 10;
		for(int i=0 ; i < x.length ; i++) {
			
			if(even.or(greaterThan10).test(x[i])) {
				System.out.println("even number and greater than 10:"+x[i]);
			}
		}
	}

}
