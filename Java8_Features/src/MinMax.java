import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MinMax {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(1);
		l.add(20);
		l.add(4);
		l.stream().forEach(System.out::println);
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min:"+min);
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max:"+max);
		
		Consumer<Integer> consumer = con->System.out.println("sqaure of i :"+con+" is :"+con*con);
		l.stream().forEach(consumer);
		
		Integer[] array = l.stream().toArray(Integer[]::new);
		for(Integer i1:array) {
		System.out.println(i1);
		}
		Stream.of(array).forEach(System.out::println);
		
		Stream s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
	}

}
