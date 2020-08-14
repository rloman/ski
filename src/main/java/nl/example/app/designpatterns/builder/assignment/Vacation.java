package nl.example.app.designpatterns.builder.assignment;

public class Vacation {

    private String destination;
    private double price;
    private int numberOfPeople;
    private Ticket ticket;

    public double getPrice() {
        return price;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getDestination() {
        return destination;
    }
}
