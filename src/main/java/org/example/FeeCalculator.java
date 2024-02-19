package org.example;

import java.util.List;

public class FeeCalculator {

    private static List<FeeStrategy> stategies = List.of (
        new AdultFeeStrategy(),
        new ChildFeeStrategy()
    );

    public static double calculateFee(Visitor visitor, TicketType ticketType) {
        Navigateur navigateur = new Navigateur();
        FeeStrategy feeStrategy;
        int i = 0;

        while (i < stategies.size()){
            feeStrategy = stategies.get(i);

            if (feeStrategy.accept(visitor)){
                navigateur.setFeeStrategy(feeStrategy);
                break;
            }
            i++;
        }

        return navigateur.calculateFee(ticketType);
    }
}
