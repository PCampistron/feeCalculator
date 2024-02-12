package org.example;

public class ChildFeeStrategy implements FeeStrategy{
    final double CHILD_PRICE_BASE = 100;

    @Override
    public double calculateFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.2;
        } else if (TicketType.FULL_DAY == ticketType) {
            return CHILD_PRICE_BASE * 0.5;
        }
        return 0.0;
    }
}