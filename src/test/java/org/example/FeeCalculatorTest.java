package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.jupiter.api.Assertions.*;

class FeeCalculatorTest {

    @Test
    void calculateFeeAdultHalfDay() {
        Visitor visitor = new Visitor(18);

        double fee = FeeCalculator.calculateFee(visitor, TicketType.HALF_DAY);

        assertEquals(60.0, fee);
    }

    @Test
    void calculateFeeAdultFullDay() {
        Visitor visitor = new Visitor(18);

        double fee = FeeCalculator.calculateFee(visitor, TicketType.FULL_DAY);

        assertEquals(120.0, fee);
    }

    @Test
    void calculateFeeChildrenHalfDay() {
        Visitor visitor = new Visitor(14);

        double fee = FeeCalculator.calculateFee(visitor, TicketType.HALF_DAY);

        assertEquals(20.0, fee);
    }

    @Test
    void calculateFeeChildrenFullDay() {
        Visitor visitor = new Visitor(14);

        double fee = FeeCalculator.calculateFee(visitor, TicketType.FULL_DAY);

        assertEquals(50.0, fee);
    }

    @Test
    void calucalateFeeAdultInvalidTicketThrowsException(){
        Visitor visitor = new Visitor(18);

        Throwable thrown = catchThrowable(() -> FeeCalculator.calculateFee(visitor, TicketType.WEEK));

        assertThat(thrown).isInstanceOf(RuntimeException.class).hasMessage("Ticket type not supported.");
    }

    @Test
    void calucalateFeeChildrenInvalidTicketThrowsException(){
        Visitor visitor = new Visitor(14);

        Throwable thrown = catchThrowable(() -> FeeCalculator.calculateFee(visitor, TicketType.WEEK));

        assertThat(thrown).isInstanceOf(RuntimeException.class).hasMessage("Ticket type not supported.");
    }
}