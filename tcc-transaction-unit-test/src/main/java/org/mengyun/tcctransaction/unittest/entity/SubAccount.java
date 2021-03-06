package org.mengyun.tcctransaction.unittest.entity;

/**
 * Created by changmingxie on 12/3/15.
 */
public class SubAccount {

    private long id;

    private volatile int balanceAmount;

    private volatile int status = AccountStatus.NORMAL.getId();

    public SubAccount() {

    }

    public SubAccount(long id, int balanceAmount) {
        this.id = id;
        this.balanceAmount = balanceAmount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(int balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
