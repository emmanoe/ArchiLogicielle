package model;

public class Main {
    public static void main(String[] args) 
    {
        Customer c = new Customer("Toto");
        Movie m = new Movie("Toto", 12);
        Rental r = new Rental(m, 15);
        c.addRental(r);
        System.out.println(c.statement());
    }
}