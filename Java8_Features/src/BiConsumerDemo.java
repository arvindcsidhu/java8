import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConsumerDemo {
	
	public static void main(String[] args) {
		
	
		
		ArrayList<Employees> emList =  new ArrayList<Employees>();
		emList.add(new Employees("sidhu", 1000));
		emList.add(new Employees("RAJU", 2000));
		emList.add(new Employees("MAH", 3000));
		emList.add(new Employees("LOK", 4000));
		
		BiConsumer<Employees,Double> c= (e,d)->e.Salary = e.Salary+d;
		for(Employees e:emList) {
			c.accept(e, 5000.0);
		}
		
		for(Employees e:emList) {
			System.out.println("Employee Name is:"+e.name);
			System.out.println("Employee Salary is:"+e.Salary);
			System.out.println();
		}
	}

}

class Employees{
	
	String name;
	double Salary;
	public Employees(String name, double salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	
	
}
