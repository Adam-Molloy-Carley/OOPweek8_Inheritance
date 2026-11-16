package Tickets;

public class Main {
    public static void main(String[] args) {

        Ticket first = new Ticket("Summer Concert", "Alice", 80);
        StudentTicket second = new StudentTicket("Summer Concert", "Bob", 80, "S12345");
        VIPTicket third = new VIPTicket("Summer Concert","Steven",80);

        System.out.println("Event: " + first.getEventName()+ "\nStandard Ticket: -" + first + "\n" + second + third);
        System.out.println("Student ID:" + second.getStudentID());
        System.out.println("Benefits" + third.getBenefits());



    }
}