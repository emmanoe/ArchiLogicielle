
public class ShieldDecorator extends Decorator
{
	private float _shield;
	
	ShieldDecorator(Soldat soldat, float shield)
	{
		super(soldat);
		_shield = shield;
	}
	
	public void parry(float strikeForce)
	{
		_soldat.parry(strikeForce - _shield);
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return _soldat.getCategory();
	}
}
