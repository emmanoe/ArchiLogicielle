package model;

public interface PriceAlgorithme extends Cloneable
{
    public double getPrice(int daysRented);
    public int getFrequentRenterPoints(int daysRented);
    public PriceAlgorithme clone();
}