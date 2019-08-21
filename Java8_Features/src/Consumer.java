
public class Consumer {

	public static void main(String[] args) {
		
		java.util.function.Consumer<String> con = c -> System.out.println(c);
		con.accept("sidhu");
	}
}
