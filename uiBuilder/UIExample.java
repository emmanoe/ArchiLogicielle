import static org.junit.Assert.assertTrue;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 * @author auber
 *  Attention il faut rendre la "library" javafx accessible
 *  http://stackoverflow.com/a/32062263/1495627
 */

public class UIExample extends Application {

    @Override
    public void start(Stage primaryStage) {

    	Customer c = movieRent();
    	
        // Build the header gridPane
        GridPane grid0 = new GridPane();
        		
        grid0.addRow(0, new Text(c.statement()));
	        
        // Put the two grids in a column
        VBox col = new VBox();
        //col.setAlignment(Pos.CENTER);
        col.getChildren().add(grid0);
        
        // JavaFX uses Scenes for content
        Scene scene = new Scene(col, 800, 500);

        // Scenes are displayed by a Stage
        primaryStage.setTitle("Receipt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public Customer movieRent() 
    {
        Customer c = new Customer("Toto");

        Movie RogueOne = new Movie("Rogue One", Movie.NEW_RELEASE);
        RogueOne.setPriceCode(Movie.NEW_RELEASE);
        Rental RogueOneRental = new Rental(RogueOne, 5);
        c.addRental(RogueOneRental);
        
        Movie ReineDesNeiges = new Movie("Reine des neiges", Movie.CHILDRENS);
        ReineDesNeiges.setPriceCode(Movie.CHILDRENS);
        Rental ReineDesNeigesRental = new Rental(ReineDesNeiges, 7);
        c.addRental(ReineDesNeigesRental);
        
        Movie StarWarsIII = new Movie("Star Wars III", Movie.REGULAR);
        StarWarsIII.setPriceCode(Movie.REGULAR);
        Rental StarWarsIIIRental = new Rental(StarWarsIII, 7);
        c.addRental(StarWarsIIIRental);
        	
        //System.out.println(c.statement());
        //assertTrue(("Rentals Record for Toto\n\tRogue One\t15.0 \n\tReine des neiges\t7.5 \n\tStar Wars III\t9.5 \nAmount owned is 32.0\nYou earned 4 frequent renter points").equals(c.statement()));
        return c;
    }

    public static void main(String[] args) {
        launch(args);
    }
} 