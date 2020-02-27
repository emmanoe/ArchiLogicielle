
public class SwordDecorator extends Decorator 
{
	private float _sword;
	
	SwordDecorator(Soldat soldat, float sword)
	{
		super(soldat);
		_sword = sword;
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
