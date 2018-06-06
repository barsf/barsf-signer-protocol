package org.barsf.iota.signer.protocol;

import com.google.api.client.util.Key;

public class BaseRes {

    @Key("duration")
    private Long duration;

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

}
