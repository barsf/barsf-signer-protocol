package org.barsf.iota.signer.protocol.address;

import org.barsf.iota.signer.protocol.BaseReq;

public class AddressReq extends BaseReq {

    public static final String COMMAND = "address";

    private Integer seedIndex;
    private Integer fromIndex;
    private Integer toIndex;
    private Integer security;

    public Integer getSeedIndex() {
        return seedIndex;
    }

    public void setSeedIndex(Integer seedIndex) {
        this.seedIndex = seedIndex;
    }

    public Integer getFromIndex() {
        return fromIndex;
    }

    public void setFromIndex(Integer fromIndex) {
        this.fromIndex = fromIndex;
    }

    public Integer getToIndex() {
        return toIndex;
    }

    public void setToIndex(Integer toIndex) {
        this.toIndex = toIndex;
    }

    public Integer getSecurity() {
        return security;
    }

    public void setSecurity(Integer security) {
        this.security = security;
    }
}
