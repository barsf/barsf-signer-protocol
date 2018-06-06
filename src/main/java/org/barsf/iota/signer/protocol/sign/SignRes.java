package org.barsf.iota.signer.protocol.sign;

import com.google.api.client.util.Key;
import org.barsf.iota.signer.protocol.BaseRes;

public class SignRes extends BaseRes {

    @Key("signature")
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
