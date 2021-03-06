package java.refactoring.oldmodel;

import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test public void mainNonRegressionTest() 
    {
        Customer c = new Customer("Toto");

        Movie RogueOne = new Movie("Rogue One", 29);
        RogueOne.setPriceCode(Movie.NEW_RELEASE);
        Rental RogueOneRental = new Rental(RogueOne, 5);
        c.addRental(RogueOneRental);
        
        Movie ReineDesNeiges = new Movie("Reine des neiges", 15);
        ReineDesNeiges.setPriceCode(Movie.CHILDRENS);
        Rental ReineDesNeigesRental = new Rental(ReineDesNeiges, 7);
        c.addRental(ReineDesNeigesRental);

        Movie StarWarsIII = new Movie("Star Wars III", 39);
        StarWarsIII.setPriceCode(Movie.REGULAR);
        Rental StarWarsIIIRental = new Rental(StarWarsIII, 7);
        c.addRental(StarWarsIIIRental);

        assertTrue(("Rental Record for Toto\n\tRogue One\t15.0 \n\tReine des neiges\t7.5 \n\tStar Wars III\t9.5 \nAmount owned is 32.0\nYou earned 4 frequent renter points").equals(c.statement()));
    }
}


