package edu.principles.lsp.correct.cards;

import edu.principles.lsp.correct.PaymentResponse;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

public interface IPaymentInstrument {
    void validate() throws PaymentInstrumentInvalidException;
    PaymentResponse collectPayment();
}
