package soldier.core;

public class ConstBehavior implements BehaviorSoldier {
	private float m_attack;
	private float m_defense;
    private float m_health;
    private String m_name;

    public ConstBehavior(float attack, float defense, float hp, String name) {
    	m_attack = attack;
    	m_defense = defense;
        m_health = hp;
        m_name = name;
    }
    
	@Override
	public float parry(float force) {
		float strike = Math.min(0, force - m_defense);
		m_health -= strike;
		
		if(!alive())
			return (float)-m_health;
		return 0.f;
	}

	@Override
	public float strike() {
		return m_attack;
	}

    @Override
    public String getName() {
        return this.m_name;
    }

    public void setName(String name) {
        this.m_name = name;
    }

	@Override
	public float getHealthPoints() {
		return m_health;
	}

	@Override
	public boolean alive() {
        return m_health > 0;
	}

	@Override
	public void heal() {
		m_health = 4;
	}

}
