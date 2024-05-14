package com.akeshala.cw2.sync;

public interface DistributedTxListener {
    void onGlobalCommit();
    void onGlobalAbort();
}
