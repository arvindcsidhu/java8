import java.util.function.BiPredicate;

public class BiPredicateDemo {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bi = (a,b)->(a+b)%2==0;
		System.out.println(bi.test(10,2));
		System.out.println(bi.test(11,2));
	}

}
