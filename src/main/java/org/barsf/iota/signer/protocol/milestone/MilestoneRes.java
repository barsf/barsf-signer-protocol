package org.barsf.iota.signer.protocol.milestone;

import org.barsf.iota.signer.protocol.BaseRes;

public class MilestoneRes extends BaseRes {

    private String signature;
    private String path;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
