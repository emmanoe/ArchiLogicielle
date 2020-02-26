package soldier.core;

public interface BehaviorSoldier {
	public String getName();
	public float getHealthPoints();
	public boolean alive();
	public void heal();
	public float parry(float force);  // Returns the force that the soldier did not absorb
	public float strike();
}
