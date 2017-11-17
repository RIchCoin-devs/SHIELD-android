package com.SHIELD.core.coins;

import com.SHIELD.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class SHIELDMain extends PeerFamily {
    private SHIELDMain() {
        id = "SHIELD.main";

        addressHeader = 63;
        p2shHeader = 33;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 240;
        dumpedPrivateKeyHeader = 191;

        name = "SHIELD";
        symbol = "XSH";
        uriScheme = "shield";
        bip44Index = 77;
        unitExponent = 6;
        feeValue = value(50000);
        minNonDust = value(100000);
        softDustLimit = value(100000);
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static SHIELDMain instance = new SHIELDMain();
    public static synchronized SHIELDMain get() {
        return instance;
    }
}
