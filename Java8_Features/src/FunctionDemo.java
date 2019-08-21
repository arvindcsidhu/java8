import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = f1->f1*f1;
		System.out.println(f.apply(4));
	}
}
