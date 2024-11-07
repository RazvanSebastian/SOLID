package edu.principles.lsp.wrong;

import edu.principles.lsp.shared.FraudDetectedException;
import edu.principles.lsp.shared.OrderDetails;
import edu.principles.lsp.shared.PaymentFailedException;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

/**
 * The LSP states that in an object-oriented programming, if we substitute a superclass object reference with an object of its subclasses,
 * the program should not break.
 * <p>
 * How can a method in a subclass can break a superclass method's contract?
 * Changing the semantics or introducing side effects that are not part of the superclass contract
 * - Every time we add or modify a subclass, we would have to comb through the codebase and change multiple places.
 * <p>
 * Solutions:
 * 1. Program to interface, not implementation
 * 2. Encapsulate what varies
 * 3. Prefer composition to inheritance
 */
public class PaymentProcessor {

    /*
    * Violations of LSP: if we want to add a new payment instrument types like
    * - Reward card: here is no runFraudChecks or sendToPaymentGateway required
    * - Somehow we have to save to DB the order details along with the fingerPrint which for RewardCard is card number
    * */
    void process(OrderDetails orderDetails, PaymentInstrument paymentInstrument) {
        try {
            paymentInstrument.validate();
            paymentInstrument.runFraudChecks();
            paymentInstrument.sendToPaymentGateway();
            saveToDatabase(orderDetails, paymentInstrument);
        } catch (PaymentInstrumentInvalidException | FraudDetectedException | PaymentFailedException e) {
            // Order processing failed
        }
    }

    void saveToDatabase(
            OrderDetails orderDetails,
            PaymentInstrument paymentInstrument) {
        String fingerprint = paymentInstrument.getFingerprint();
        // save fingerprint and order details in DB
    }
}
