package edu.principles.lsp.correct;

import edu.principles.lsp.shared.PaymentFailedException;
import edu.principles.lsp.correct.cards.IPaymentInstrument;

public interface PaymentGateway {
    PaymentGatewayResponse sendToPaymentGateway(IPaymentInstrument paymentInstrument) throws PaymentFailedException;
}
