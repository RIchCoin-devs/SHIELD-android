package com.SHIELD.core.wallet.families.bitcoin;

import com.SHIELD.core.network.AddressStatus;
import com.SHIELD.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
