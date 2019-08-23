interface in{
	public void sum(int a,int b);
}

public class Interf {
	
	public static void add(int a,int b) {
		System.out.println("sum:"+(a+b));
	}
	
	public static void main(String[] args) {
		
		in i = (a,b)->System.out.println("sum:"+(a+b));
		i.sum(10,20);
		
		in i1 = Interf::add;
		i1.sum(100,200);
		
	}

}
