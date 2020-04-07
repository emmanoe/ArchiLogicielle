
public class Main {

	public static void main(String[] args) {
		Soldat s1 = new ShieldDecorator(new SwordDecorator(new HumanSoldier("infantryman"), 5000000),50);
		Soldat s2 = new ShieldDecorator(new SwordDecorator(new HumanSoldier("horseman"), 100),10000);
		
		Fight f = new Fight();
		f.fight(s1,s2);
	}
}
