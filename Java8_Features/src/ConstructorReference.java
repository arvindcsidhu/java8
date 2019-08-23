class Sample{
	public Sample(String s) {
		System.out.println("Sample class constructor is called:"+s);
	}
}

interface inter{
	public Sample get(String s);
}

public class ConstructorReference {

	public static void main(String[] args) {
		
		inter i = Sample::new;
		i.get("sidhu");
		i.get("raju");
		
	}
}
