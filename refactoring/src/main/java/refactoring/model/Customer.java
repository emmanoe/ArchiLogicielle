package model;
import java.util.*;

public class Customer
{
    private final String _name;
	private final Vector _rentals = new Vector();
	private static final int MAX_DAYS_FOR_REGULAR_RENTS = 2;
	private static final int MAX_DAYS_FOR_CHILDREN_RENTS = 3;
	private static final double REGULAR_PRICE = 2;
	private static final int NEW_RELEASE_PRICE = 3;
	private static final double CHILDREN_PRICE = 1.5;
	private static final double PENALTY = 1.5;

	public Customer(final String name) {
		_name = name;
	}

	public void addRental(final Rental rental) 
	{
		_rentals.addElement(rental);
	}

	public String getName() {
		return _name;
	}

	public double getPrice(final double price, final int rentLimit, final int dayRented, final double penalty ) {
		double computedPrice=0;
		computedPrice += price;
		if ( dayRented > rentLimit )
			computedPrice += (dayRented - rentLimit) * penalty;
		return computedPrice;
	}

	public void getTotalPrice(double totalAmount, double amount){
		totalAmount+=amount;
	}

	public int getFrequentRenterPoints(final int priceCode, final int dayRented ){
		int frequentRenterPoints = 0;
		frequentRenterPoints++;
		if( priceCode == 1 && dayRented>1)
			frequentRenterPoints++;
		return frequentRenterPoints;
	}

	public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		final Enumeration rentals = _rentals.elements();
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("Rental Record for " + getName() + "\n");
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			final Rental each = (Rental) rentals.nextElement();

			switch (MoviesCategories.Categories.values()[each.getMovie().getPriceCode()]) 
			{
				case REGULAR:
					//thisAmount = getPrice(REGULAR_PRICE, MAX_DAYS_FOR_REGULAR_RENTS, each.getDaysRented(), PENALTY);
					break;
				case NEW_RELEASE:
					//thisAmount += each.getDaysRented()*NEW_RELEASE_PRICE;
					break;
				case CHILDRENS:
					//each.getMovie().getPriceCode2().getPrice(each.getDaysRented()+1);
					break;
			}
			
			//frequentRenterPoints = getFrequentRenterPoints(each.getMovie().getPriceCode(), each.getDaysRented());

			sBuffer.append("\t" + each.getMovie().getTitle()+"\t"+ String.valueOf(thisAmount) +" \n");
			getTotalPrice(totalAmount, thisAmount);
	    }
		sBuffer.append("Amount owned is " + String.valueOf(totalAmount) +"\n"+
					"You earned " + String.valueOf(frequentRenterPoints) +
					" frequent renter points");
		return sBuffer.toString();
	}
}
 