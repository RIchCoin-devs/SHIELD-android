package com.SHIELD.core.wallet.families.bitcoin;

import com.SHIELD.core.network.AddressStatus;
import com.SHIELD.core.network.ServerClient.UnspentTx;
import com.SHIELD.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
