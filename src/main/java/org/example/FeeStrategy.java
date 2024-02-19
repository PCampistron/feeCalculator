package org.example;

public interface FeeStrategy {
    double calculateFee(TicketType ticketType);

    public boolean accept(Visitor visitor);
}
