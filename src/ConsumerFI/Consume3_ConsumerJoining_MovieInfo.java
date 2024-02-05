package ConsumerFI;
import java.util.function.Consumer;

class Movie 
{
	String name;
	Movie(String name)
	{
		this.name=name;
	}
}

public class Consume3_ConsumerJoining_MovieInfo 
{
	public static void main(String[] args) {
		
		Consumer<Movie> c1=m-> System.out.println(m.name+" ready to release");
		Consumer<Movie> c2=m-> System.out.println(m.name+" released but bigger failure");
		Consumer<Movie> c3=m-> System.out.println(m.name+" storing information in database");
		Consumer<Movie> cj=c1.andThen(c2).andThen(c3);
		
		//c1.accept(new Movie("spider"));
		cj.accept(new Movie("spider"));
	}

}
