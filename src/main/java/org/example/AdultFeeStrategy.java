package org.example;

public class AdultFeeStrategy implements FeeStrategy {
    final double ADULT_PRICE_BASE = 100;

    @Override
    public double calculateFee(TicketType ticketType) {
        if (TicketType.HALF_DAY == ticketType) {
            return ADULT_PRICE_BASE * 0.6;
        } else if (TicketType.FULL_DAY == ticketType) {
            return ADULT_PRICE_BASE * 1.2;
        }
        return 0.0;
    }
}