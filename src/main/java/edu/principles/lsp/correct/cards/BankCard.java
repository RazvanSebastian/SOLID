package edu.principles.lsp.correct.cards;

import edu.principles.lsp.shared.PaymentInstrumentInvalidException;

public class BankCard  extends BaseCard {

    @Override
    public void validate() throws PaymentInstrumentInvalidException {
        super.validate();
        // extra validation
    }

}
