package org.example;

public class FeeCalculator {

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        Navigateur navigateur = new Navigateur();

        // calculate price for adults
        if (visitor.getAge() > 14) {
            navigateur.setFeeStrategy(new AdultFeeStrategy());
        }
        // calculate price for children
        else {
            navigateur.setFeeStrategy(new ChildFeeStrategy());
        }

        return navigateur.calculateFee(ticketType);
    }
}
