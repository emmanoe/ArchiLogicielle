package model;

public class Children implements PriceAlgorithme
{
    private static final int MAX_DAYS_FOR_CHILDREN_RENTS = 3;
    private static final double CHILDREN_PRICE = 1.5;
    private static final double PENALTY = 1.5;

    public double getPrice(final int dayRented) {
		double computedPrice=0;
		computedPrice += CHILDREN_PRICE;
		if ( dayRented > MAX_DAYS_FOR_CHILDREN_RENTS )
			computedPrice += (dayRented - MAX_DAYS_FOR_CHILDREN_RENTS) * PENALTY;
		return computedPrice;
    }
    
    public int getFrequentRenterPoints(int daysRented)
    {
        return 0;
    }
}