package org.example;

public class AdultFeeStrategy implements FeeStrategy {
    final double ADULT_PRICE_BASE = 100.0;

    @Override
    public double calculateFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return ADULT_PRICE_BASE * 0.6;
        } else if (TicketType.FULL_DAY == ticketType) {
            return ADULT_PRICE_BASE * 1.2;
        }
        throw new RuntimeException("Ticket type not supported.");
    }

    @Override
    public boolean accept(Visitor visitor) {
        if (visitor.getAge() > 14) {
            return true;
        }
        return false;
    }
}