import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee{
	
	String name;
	int empNo;
	public Employee(String name, int empNo) {
		super();
		this.name = name;
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empNo=" + empNo + "]";
	}
	
	
	
}

public class EmployeeSortingAsc {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("sidhu", 344444));	
		empList.add(new Employee("pramod", 4444));
		empList.add(new Employee("raju", 18989));

		System.out.println(empList);
		
		Collections.sort(empList,(i1,i2)->i1.empNo<i2.empNo?-1:i1.empNo>i2.empNo?1:0);
		
		System.out.println(empList);
		
		Collections.sort(empList,(i1,i2)->i1.name.compareTo(i2.name));
		
		System.out.println(empList);
	}
}
