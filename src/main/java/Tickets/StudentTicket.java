package Tickets;

public class StudentTicket extends Ticket {
    private String studentID;

    public StudentTicket(String studentID) {
        super();
        this.studentID = studentID;
    }

    public StudentTicket(String eventName, String holderName, double basePrice, String studentID) {
        super(eventName, holderName, basePrice);
        this.studentID = studentID;
    }  //Debug Task:
    //It is the original Ticket constructor that initializes the common fields through the studentTicket constructors super call. after the values
    //are initialized it then returns to the studentTicket super call to initialize the Student ID.

    public String getStudentID() {
        return studentID;
    }

    @Override
    public double calculatePrice(){
       return super.getBasePrice() - (super.getBasePrice() * 0.2);
    }
    @Override
    public String toString() {
        return "StudentTicket: -" + super.toString();
    }
}
