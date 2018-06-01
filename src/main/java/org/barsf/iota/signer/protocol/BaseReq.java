package org.barsf.iota.signer.protocol;


public class BaseReq {

    private String command;

    public BaseReq() {
    }

    public BaseReq(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

}
