import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

	/*
	 * @Override public String toString() { return "Movie [name=" + name + "]"; }
	 */
	
	
	
}

public class Supplier {
	
	public static void main(String[] args) {
		
		Consumer<Movie> consumer1=m1->System.out.println(m1.name+" Read to Release");
		Consumer<Movie> consumer2=m2->System.out.println(m2.name+" flop");
		Consumer<Movie> consumer3=m3->System.out.println(m3.name+" Read to Release");
		Movie m = new Movie("sidhu");
		consumer1.andThen(consumer2).andThen(consumer3).accept(m);
		
	}
	
	
	
	

}
