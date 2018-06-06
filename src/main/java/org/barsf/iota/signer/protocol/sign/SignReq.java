package org.barsf.iota.signer.protocol.sign;

import com.google.api.client.util.Key;
import org.barsf.iota.signer.protocol.BaseReq;

public class SignReq extends BaseReq {

    public static final String COMMAND = "sign";

    @Key("seedIndex")
    private int seedIndex;
    @Key("addressIndex")
    private int addressIndex;
    @Key("security")
    private int security;
    @Key("hash")
    private String hash;

    public SignReq() {
        super(COMMAND);
    }

    public int getSeedIndex() {
        return seedIndex;
    }

    public void setSeedIndex(int seedIndex) {
        this.seedIndex = seedIndex;
    }

    public int getAddressIndex() {
        return addressIndex;
    }

    public void setAddressIndex(int addressIndex) {
        this.addressIndex = addressIndex;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

}
