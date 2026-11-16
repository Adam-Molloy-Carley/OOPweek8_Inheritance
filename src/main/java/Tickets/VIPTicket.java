package Tickets;

public class VIPTicket extends Ticket{

    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    public String getBenefits(){
        return "Priority entry and reserved seating.";
    }

    @Override
    public double calculatePrice(){
        return (super.getBasePrice() + 20);
    }

    @Override
    public String toString() {
        return "VIPTicket: -" + super.toString();
    }
}
