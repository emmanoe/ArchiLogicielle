
public abstract class Decorator implements Soldat {
	
	protected Soldat _soldat;
	
	Decorator(Soldat soldat)
	{
		_soldat = soldat;
	}

	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return _soldat.isAlive();
	}

	@Override
	public void parry(float strikeForce) {
		// TODO Auto-generated method stub
		_soldat.parry(strikeForce);
	}

	@Override
	public float strike() {
		// TODO Auto-generated method stub
		return _soldat.strike();
	}

}
