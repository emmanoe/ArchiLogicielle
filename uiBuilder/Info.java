
public class Info {
	private String _customerName;
	private int  _daysRented;
	
	Info (Customer c, Rental r)
	{
		_customerName = c.getName();
		_daysRented = r.getDaysRented();		
	}

	public String get_customerName() {
		return _customerName;
	}

	public int get_daysRented() {
		return _daysRented;
	}
}
