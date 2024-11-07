package edu.principles.lsp.wrong;

import edu.principles.lsp.shared.PaymentFailedException;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;
import edu.principles.lsp.shared.FraudDetectedException;

import java.util.Date;

public abstract class PaymentInstrument {

    String name;
    String cardNumber;
    String verificationCode;
    Date expiryDate;
    String fingerprint;

    void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (name == null || name.isEmpty()) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other validations
    }

    void runFraudChecks() throws FraudDetectedException {
        // run checks against a third-party system
    }

    void sendToPaymentGateway() throws PaymentFailedException {
        // send details to payment gateway (PG) and set fingerprint from
        // the payment gateway response
    }

    public String getFingerprint() {
        return fingerprint;
    }
}
