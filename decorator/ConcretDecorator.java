
public class ConcretDecorator extends Decorator
{
	private float _shield;
	private float _sword;
	
	ConcretDecorator(Soldat soldat, float shield)
	{
		super(soldat);
		_shield = shield;
	}
	
	@Override
	public void parry(float strikeForce)
	{
		_soldat.parry(strikeForce - _shield);
	}
	
	@Override
	public float strike()
	{
		return _soldat.strike() + _sword;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return _soldat.getCategory();
	}
}
