package com.SHIELD.core.network;

import com.SHIELD.core.coins.CoinType;
import com.SHIELD.stratumj.ServerAddress;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
final public class CoinAddress {
    final private CoinType type;
    final private List<ServerAddress> addresses;
    final private List<ServerAddress> addressesAnonymous;

    public CoinAddress(CoinType type, ServerAddress address, ServerAddress addressAnonymous) {
        this.type = type;
        this.addresses = ImmutableList.of(address);
        this.addressesAnonymous = ImmutableList.of(addressAnonymous);
    }

    public CoinAddress(CoinType type, ServerAddress... addresses) {
        this.type = type;
        this.addresses = ImmutableList.copyOf(addresses);
        this.addressesAnonymous = null;
    }

    public CoinAddress(CoinType type, ImmutableList<ServerAddress> addresses, ImmutableList<ServerAddress> addressesAnonymous) {
        this.type = type;
        this.addresses = addresses;
        this.addressesAnonymous = addressesAnonymous;
    }

    public CoinAddress(CoinType type, List<ServerAddress> addresses, List<ServerAddress> addressesAnonymous) {
        this.type = type;
        this.addresses = ImmutableList.copyOf(addresses);
        this.addressesAnonymous = ImmutableList.copyOf(addressesAnonymous);
    }

    public CoinType getType() {
        return type;
    }

    public List<ServerAddress> getAddresses() {
        return addresses;
    }

    public List<ServerAddress> getAddressesAnonymous(){
        return addressesAnonymous;
    }
}
