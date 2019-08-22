import java.util.function.BinaryOperator;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class IntFunction {
	
	public static void main(String[] args) {
		
		java.util.function.IntFunction<Integer> it = f->f*f;
		System.out.println(it.apply(4));
		
		UnaryOperator<Integer> un = un1->un1*un1;
		System.out.println(un.apply(4));
		
		IntUnaryOperator iun = un2->un2*un2;
		System.out.println(iun.applyAsInt(4));
		
		/*
		 * DoubleToIntFunction df = d-> (Integer) d*d;
		 * System.out.println(df.applyAsInt(10.0));
		 */
		
		BinaryOperator<Integer> bi = (bi1,bi2) -> bi1+bi2;
		System.out.println(bi.apply(10,20));

		IntBinaryOperator bi1 = (Ibi1,Ibi2) -> Ibi1*Ibi2;
		System.out.println(bi1.applyAsInt(10,20));
		

	}

}
