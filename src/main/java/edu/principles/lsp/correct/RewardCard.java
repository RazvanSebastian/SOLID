package edu.principles.lsp.correct;

import edu.principles.lsp.correct.cards.IPaymentInstrument;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

public class RewardCard implements IPaymentInstrument {
    String name;
    String cardNumber;

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // some validation regarding reward card
    }

    @Override
    public PaymentResponse collectPayment() {
        PaymentResponse paymentResponse = new PaymentResponse();
        paymentResponse.identifier = cardNumber;
        return paymentResponse;
    }
}
