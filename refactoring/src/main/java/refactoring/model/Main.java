package model;

public class Main {
    public static void main(String[] args) 
    {
        Customer c = new Customer("Toto");
        
        Children childrePriceAlgorithme = new Children();
        Movie RogueOne = new Movie("Rogue One", childrePriceAlgorithme);
        RogueOne.setPriceCode(MoviesCategories.Categories.valueOf("NEW_RELEASE").ordinal());
        Rental RogueOneRental = new Rental(RogueOne, 5);
        c.addRental(RogueOneRental);
        
        Movie ReineDesNeiges = new Movie("Reine des neiges", childrePriceAlgorithme);
        ReineDesNeiges.setPriceCode(MoviesCategories.Categories.valueOf("CHILDRENS").ordinal());
        Rental ReineDesNeigesRental = new Rental(ReineDesNeiges, 7);
        c.addRental(ReineDesNeigesRental);

        Movie StarWarsIII = new Movie("Star Wars III", childrePriceAlgorithme);
        StarWarsIII.setPriceCode(MoviesCategories.Categories.valueOf("REGULAR").ordinal());
        Rental StarWarsIIIRental = new Rental(StarWarsIII, 7);
        c.addRental(StarWarsIIIRental);

        System.out.println(c.statement());
    }
}