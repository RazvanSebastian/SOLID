package edu.principles.lsp.correct;

import edu.principles.lsp.correct.cards.IPaymentInstrument;
import edu.principles.lsp.shared.FraudDetectedException;

public interface FraudChecker {
    void runFraudChecks(IPaymentInstrument paymentInstrument) throws FraudDetectedException;
}
