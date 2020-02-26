
public class Main {

	public static void main(String[] args) {
		Soldat s1 = new Infantryman(100, 100, 10);
		Soldat s2 = new Horseman(100, 10, 10);
		
		Fight f = new Fight();
		f.fight(s1,s2);
	}
}
