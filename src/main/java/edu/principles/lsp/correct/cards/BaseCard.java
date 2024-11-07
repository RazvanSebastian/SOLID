package edu.principles.lsp.correct.cards;

import edu.principles.lsp.correct.FraudChecker;
import edu.principles.lsp.correct.PaymentGateway;
import edu.principles.lsp.correct.PaymentGatewayResponse;
import edu.principles.lsp.correct.PaymentResponse;
import edu.principles.ocp.lsp.correct.*;
import edu.principles.lsp.shared.FraudDetectedException;
import edu.principles.lsp.shared.PaymentFailedException;
import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

import java.util.Date;

public abstract class BaseCard implements IPaymentInstrument {
    String name;
    String cardNumber;
    String verificationCode;
    Date expiryDate;

    FraudChecker fraudChecker;
    PaymentGateway paymentGateway;

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        // basic validation on name, expiryDate etc.
        if (name == null || name.isEmpty()) {
            throw new PaymentInstrumentInvalidException("Name is invalid");
        }
        // other validations
    }

    @Override
    public PaymentResponse collectPayment() {
        PaymentResponse paymentResponse = new PaymentResponse();
        try {
            fraudChecker.runFraudChecks(this);
            PaymentGatewayResponse response = paymentGateway.sendToPaymentGateway(this);
            paymentResponse.identifier = response.fingerprint;
        } catch (PaymentFailedException | FraudDetectedException e) {
            // exception handling
        }
        return paymentResponse;
    }
}
