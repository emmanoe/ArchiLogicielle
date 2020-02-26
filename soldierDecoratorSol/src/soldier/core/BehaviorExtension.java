package soldier.core;

public class BehaviorExtension implements BehaviorSoldier {
	
	BehaviorSoldier soldier;

	BehaviorExtension(BehaviorSoldier s) {
	    soldier = s;
	}
	
	BehaviorSoldier parent() {
		return soldier;
	}

	void reparent(BehaviorSoldier newParent) {
		soldier = newParent;
	}
	
	@Override
	public String getName() {
		return soldier.getName();
	}

	@Override
	public float getHealthPoints() {
		return soldier.getHealthPoints();
	}

	@Override
	public boolean alive() {
		return soldier.alive();
	}

	@Override
	public void heal() {
		soldier.heal();
	}

	@Override
	public float parry(float force) {
		return soldier.parry(force);
	}

	@Override
	public float strike() {
		return soldier.strike();
	}


}
