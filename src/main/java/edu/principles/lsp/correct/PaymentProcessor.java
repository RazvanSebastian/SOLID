package edu.principles.lsp.correct;

import edu.principles.lsp.correct.cards.IPaymentInstrument;
import edu.principles.lsp.shared.OrderDetails;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

public class PaymentProcessor {

    void process(OrderDetails orderDetails, IPaymentInstrument paymentInstrument) {
        try {
            paymentInstrument.validate();
            PaymentResponse response = paymentInstrument.collectPayment();
            saveToDatabase(orderDetails, response.identifier);
        } catch (PaymentInstrumentInvalidException e) {
            // handling exception
        }
    }

    void saveToDatabase(
            OrderDetails orderDetails,
            String fingerPrint) {
        // save fingerprint and order details in DB
    }
}
