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

public class UIExample2 extends Application {
	
	private Vector _rentals = new Vector();
	private int i;
		
    @Override
    public void start(Stage primaryStage) {

    	Customer c = movieRent();
    	Enumeration rentals=_rentals.elements();
    	
        // Build the header gridPane
        GridPane grid0 = new GridPane();
        //grid0.setGridLinesVisible(true); // Useful for debug
        // Create and add the header text to the gridPane
        Text header = new Text("Movie Location Receipt for "+ c.getName());
        header.setStyle("-fx-font: 24 arial;");
        grid0.add(header, 0, 0);
        grid0.setAlignment(Pos.TOP_CENTER);
        
        // Build the location Information gridPane
        GridPane grid1 = new GridPane();
        //grid1.setGridLinesVisible(true); // Useful for debug
        grid1.addColumn(0, new Text("Movie Location Information"));

        // Build the location Details gridPane
        GridPane grid2 = new GridPane();
        //grid2.setGridLinesVisible(true);
        
        // Simpler API only for rows
        
        while (rentals.hasMoreElements())
        {
        	Rental each=(Rental) rentals.nextElement();
	        grid2.addRow(i++, new Text("Movie: " + each.getMovie().getTitle() + "\t\t" +String.valueOf(each.getAmount()) + " $"));
	        
        }
	        
        // Put the two grids in a column
        VBox col = new VBox();
        //col.setAlignment(Pos.CENTER);
        col.getChildren().add(grid0);
        col.getChildren().add(grid1);
        col.getChildren().add(grid2);

        // Also add a text which will be centered
        col.getChildren().add(new Text("Amount owned is : " + c.getTotalAmount()));
        col.getChildren().add(new Text("You earned " + c.getRenterPoints() +" frequent renter points"));

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
        _rentals.addElement(RogueOneRental);
        
        Movie ReineDesNeiges = new Movie("Reine des neiges", Movie.CHILDRENS);
        ReineDesNeiges.setPriceCode(Movie.CHILDRENS);
        Rental ReineDesNeigesRental = new Rental(ReineDesNeiges, 7);
        c.addRental(ReineDesNeigesRental);
        _rentals.addElement(ReineDesNeigesRental);
        
        Movie StarWarsIII = new Movie("Star Wars III", Movie.REGULAR);
        StarWarsIII.setPriceCode(Movie.REGULAR);
        Rental StarWarsIIIRental = new Rental(StarWarsIII, 7);
        c.addRental(StarWarsIIIRental);
        _rentals.addElement(StarWarsIIIRental);
        	
        //System.out.println(c.statement());
        //assertTrue(("Rentals Record for Toto\n\tRogue One\t15.0 \n\tReine des neiges\t7.5 \n\tStar Wars III\t9.5 \nAmount owned is 32.0\nYou earned 4 frequent renter points").equals(c.statement()));
        return c;
    }

    public static void main(String[] args) {
        launch(args);
    }
} 