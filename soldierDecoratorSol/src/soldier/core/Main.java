
public class Main {

	public static void main(String[] args) {
		UnitSimple hm = new HorseMan();
		UnitSimple im = new InfantryMan();
		im.parry(hm.strike());
		try {
			im.addSword();
			hm.addShield();
			hm.parry(im.strike());
			im.addShield(); 
			im.addSword(); // Lève une exception car deux armes maximum
		}catch(ImpossibleExtensionException e) {}
	}
}
