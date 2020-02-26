package model;

public class Movie {  
    private String _title;
    private int _priceCode;
    private PriceAlgorithme _priceAlgorithme;
  
    public Movie(String title, PriceAlgorithme priceAlgorithme)
    {
        _title=title;
        _priceAlgorithme=priceAlgorithme;
    }

    public int getPriceCode()
    {
	return _priceCode;
    }

    public PriceAlgorithme getPriceCode2()
    {
	    return _priceAlgorithme.clone();
    }

    public void setPriceCode(int priceCode)
    {
	_priceCode=priceCode;
    }

    public String getTitle()
    {
	    return _title;
    }

}
