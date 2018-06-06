package org.barsf.iota.signer.protocol.address;

import com.google.api.client.util.Key;
import org.barsf.iota.signer.protocol.BaseRes;

import java.util.List;

public class AddressRes extends BaseRes {

    @Key("addresses")
    private List<String> addresses;

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
}
