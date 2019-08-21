import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer> i = (a,b)->a*b;
		System.out.println(i.apply(2, 4));
		
		BiFunction<Integer,String,Employee> em = (a,b)->new Employee(a, b);
		System.out.println(em.apply(1,"sidhu"));
		
	}
}

class Employee{
	
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
