import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class GenerateGrade {
	
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("sidhu", 50));
		st.add(new Student("r", 80));
		st.add(new Student("s", 30));
		st.add(new Student("d", 40));
		
		Function<Student,String> g1 = g-> {
			String grade = "";
			if(g.getMarks() >= 80) grade="A";
			else if(g.getMarks() >= 50) grade="B";
			else if(g.getMarks() >= 35) grade="C";
			else if(g.getMarks() < 35) grade="D";
			return grade;
		};
		
		Consumer<Student> stu = st1->{
			System.out.println(st1.getName()+":"+st1.getMarks());
		};
		
		
		
		for(Student s : st) {
			System.out.println(g1.apply(s));
			stu.accept(s);
		}
		
	}

}
class Student{
	
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}
