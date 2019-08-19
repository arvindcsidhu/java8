interface m1
{
	public void m2();
}

abstract class lambda implements m1{
	
	public static void main(String args[]) {
	m1 i = ()-> {System.out.println("test sidhu");};
	i.m2();
	}
}