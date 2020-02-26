package soldier.core;

public class StdExtension extends BehaviorExtension {
	private float m_attack;
	private float m_defense;
	private static float wear_ratio = 2.5f;

	private float m_wear = 10;

	public StdExtension(float attack, float defense, BehaviorSoldier soldier) {
		super(soldier);
		m_attack = attack;
		m_defense = defense;
	}

	@Override
	public float strike() {
		float force = soldier.strike() + m_attack;
		m_wear -= wear_ratio * Math.min(m_wear, force) / m_wear;
		return force;
	}

	@Override
	public float parry(float force) {
		float taken_force;
		if(m_defense >= 0)
			taken_force = force / (1 + m_defense);
		else
			taken_force = force;

		m_wear -= wear_ratio * Math.min(m_wear, taken_force) / m_wear;
		return soldier.parry(taken_force);
	}
}
