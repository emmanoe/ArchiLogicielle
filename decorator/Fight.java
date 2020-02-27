public class Fight {
	public void fight(Soldat s1, Soldat s2) {
		Soldat attack = s1;
		Soldat defend = s2;
		while(s1.isAlive() && s2.isAlive()) {
		    defend.parry(attack.strike());
		    Soldat tmpSwap = attack;
		    attack = defend;
		    defend = tmpSwap;
		}
		if (s1.isAlive()) 
		    System.out.println("Soldier of category " +s1.getCategory() +" Won");
		else
		    System.out.println("Soldier of category " +s2.getCategory() +" Won");
		}
}