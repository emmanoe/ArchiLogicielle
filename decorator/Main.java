
public class Main {

	public static void main(String[] args) {
		Soldat s1 = new ConcretDecorator(new ConcretDecorator(new HumanSoldier("infantryman"), 100),50);
		Soldat s2 = new ConcretDecorator(new ConcretDecorator(new HumanSoldier("horseman"), 100),1000);
		
		Fight f = new Fight();
		f.fight(s1,s2);
	}
}
