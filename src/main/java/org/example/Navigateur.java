package org.example;

public class Navigateur {
    FeeStrategy feeStrategy;

    public double calculateFee(final TicketType ticketType) {
        return feeStrategy.calculateFee(ticketType);
    }

    public FeeStrategy getFeeStrategy() {
        return this.feeStrategy;
    }

    public void setFeeStrategy(final FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }
}
