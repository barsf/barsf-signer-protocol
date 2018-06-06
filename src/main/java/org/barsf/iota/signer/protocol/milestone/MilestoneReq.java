package org.barsf.iota.signer.protocol.milestone;

import com.google.api.client.util.Key;
import org.barsf.iota.signer.protocol.BaseReq;

public class MilestoneReq extends BaseReq {

    public static final String COMMAND = "milestone";

    @Key("hash")
    private String hash;
    @Key("nodeIndex")
    private Integer nodeIndex;
    @Key("treeIndex")
    private Integer treeIndex;

    public MilestoneReq() {
        super(COMMAND);
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getNodeIndex() {
        return nodeIndex;
    }

    public void setNodeIndex(Integer nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public Integer getTreeIndex() {
        return treeIndex;
    }

    public void setTreeIndex(Integer treeIndex) {
        this.treeIndex = treeIndex;
    }
}
