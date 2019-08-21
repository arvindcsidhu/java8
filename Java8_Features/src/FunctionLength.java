import java.util.function.Function;

public class FunctionLength {

	public static void main(String[] args) {
		
		Function<String,Integer> fun = f->f.length();
		System.out.println(fun.apply("sidhu"));
	}
}
