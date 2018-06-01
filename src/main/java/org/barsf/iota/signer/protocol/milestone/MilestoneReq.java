package org.barsf.iota.signer.protocol.milestone;

import org.barsf.iota.signer.protocol.BaseReq;

public class MilestoneReq extends BaseReq {

    public static final String COMMAND = "milestone";

    private String hash;
    private Integer nodeIndex;
    private Integer treeIndex;

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
