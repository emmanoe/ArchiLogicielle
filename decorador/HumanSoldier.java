
public abstract class Soldat implements Unit{
	
	private int _lifePoint;
	private int _strikeForce;
	private int _defenseForce;
	
	public Soldat(int lifePoint, int strikeForce, int defenseForce)
	{
		_lifePoint = lifePoint;
		_strikeForce = strikeForce;
		_defenseForce = defenseForce;
	}
	
	public int getDefenseForce()
	{
		return this._defenseForce;
	}
	
	public boolean isAlive()
	{
		return _lifePoint <= 0;
	}
	
	public void parry(int strikeForce)
	{
		_lifePoint -= strikeForce;
	}
	
	public int strike()
	{
		return _strikeForce;
	}
}
