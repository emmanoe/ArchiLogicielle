package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test public void mainNonRegressionTest() {
        Customer c = new Customer("Toto");

        Movie RogueOne = new Movie("Rogue One", 29);
        RogueOne.setPriceCode(MoviesCategories.Categories.valueOf("NEW_RELEASE").ordinal());
        Rental RogueOneRental = new Rental(RogueOne, 5);
        c.addRental(RogueOneRental);
        
        Movie ReineDesNeiges = new Movie("Reine des neiges", 15);
        ReineDesNeiges.setPriceCode(MoviesCategories.Categories.valueOf("CHILDRENS").ordinal());
        Rental ReineDesNeigesRental = new Rental(ReineDesNeiges, 7);
        c.addRental(ReineDesNeigesRental);

        Movie StarWarsIII = new Movie("Star Wars III", 39);
        StarWarsIII.setPriceCode(MoviesCategories.Categories.valueOf("REGULAR").ordinal());
        Rental StarWarsIIIRental = new Rental(StarWarsIII, 7);
        c.addRental(StarWarsIIIRental);

        assertEquals("Rental Record for Toto\n\tRogue One\t15.0 \n\tReine des neiges\t7.5 \n\tStar Wars III\t9.5 \nAmount owned is 32.0\nYou earned 4 frequent renter points" , c.statement());
    }
}


