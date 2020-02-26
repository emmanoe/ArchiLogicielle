package soldier.core;
import java.lang.Math;

public class LogPowBehavior implements BehaviorSoldier {
	private float m_attack;
	private float m_defense;
    private float m_health;
    private String m_name;

    public LogPowBehavior(float attack, float defense, float hp, String name) {
    	this.m_attack = attack;
    	this.m_defense = defense;
        this.m_health = hp;
        this.m_name = name;
    }
    
	@Override
	public float parry(float force) {
		float strike = (float)Math.sqrt(force / m_defense + 1); 
		m_health -= strike;

		if(!alive())
			return (float)-m_health;
		return 0.f;
	}

	@Override
	public float strike() {
		return m_attack * (float)Math.log10(m_health + 1.);
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
		m_health = 10;
	}
}
