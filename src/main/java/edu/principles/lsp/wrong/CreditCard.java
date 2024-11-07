package edu.principles.lsp.wrong;

import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

public class CreditCard extends PaymentInstrument {

    @Override
    void validate() throws PaymentInstrumentInvalidException {
        super.validate();
        // additional validations for credit cards
    }
}
