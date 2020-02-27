
public class HumanSoldier implements Soldat{
	
	private float _healthPoints = 100;
	private float s_default_attack = 5;
	private String _soldier_category;
	
	HumanSoldier(String soldier_category)
	{
		_soldier_category = soldier_category;
	}
	
	public String getCategory()
	{
		return _soldier_category;
	}
	
	public boolean isAlive()
	{
		return _healthPoints >= 0;
	}
	
	public void parry(float strikeForce)
	{
		_healthPoints -= strikeForce;
	}
	
	public float strike()
	{
		return s_default_attack;
	}
}
