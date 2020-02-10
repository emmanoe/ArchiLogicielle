package model;

public class Rental 
{
    private Movie _movie;
    private int _daysRented;
	private static final int MAX_DAYS_FOR_REGULAR_RENTS = 2;
	private static final int MAX_DAYS_FOR_CHILDREN_RENTS = 3;
	private static final double REGULAR_PRICE = 2;
	private static final int NEW_RELEASE_PRICE = 3;
	private static final double CHILDREN_PRICE = 1.5;
	private static final double PENALTY = 1.5;    
    
    public Rental(Movie movie, int daysRented)
    {
        _movie=movie;
        _daysRented=daysRented;
    }

    public int getDaysRented()
    {
	    return _daysRented; 
    }

    public Movie getMovie()
    {
	    return _movie;
    }
    
    public double getPrice(final double price, final int rentLimit, final int dayRented, final double penalty ) {
		double computedPrice=0;
		computedPrice += price;
		if ( dayRented > rentLimit )
			computedPrice += (dayRented - rentLimit) * penalty;
		return computedPrice;
	}
}
