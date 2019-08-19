
public class Predicate {
public static void main(String[] args) {
	
	java.util.function.Predicate<Integer> b = i->i%2==0; 
	System.out.println(b.test(10));
	
	java.util.function.Predicate<String> c = d->d.length() > 5;
	System.out.println(c.test("sidhu"));
}
}
