package com.paypad.emv;

import java.util.Date;
/* loaded from: classes2.dex */
public class EmvRequest {
    private AccountType accountType;
    private String currencyCode;
    private long minorAmount;
    private Long otherAmount;
    private OnlinePinMode pinMode;
    private EmvTerminalDecision terminalDecision;
    private EmvTransactionType transType;
    private String transactionCategoryCode;
    private String transactionCurrencyCode;
    private Date transactionDate;

    public AccountType getAccountType() {
        return this.accountType;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public long getMinorAmount() {
        return this.minorAmount;
    }

    public Long getOtherAmount() {
        return this.otherAmount;
    }

    public OnlinePinMode getPinMode() {
        return this.pinMode;
    }

    public EmvTerminalDecision getTerminalDecision() {
        return this.terminalDecision;
    }

    public EmvTransactionType getTransType() {
        return this.transType;
    }

    public String getTransactionCategoryCode() {
        return this.transactionCategoryCode;
    }

    public String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public Date getTransactionDate() {
        return this.transactionDate;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setMinorAmount(long j) {
        this.minorAmount = j;
    }

    public void setOtherAmount(Long l) {
        this.otherAmount = l;
    }

    public void setPinMode(OnlinePinMode onlinePinMode) {
        this.pinMode = onlinePinMode;
    }

    public void setTerminalDecision(EmvTerminalDecision emvTerminalDecision) {
        this.terminalDecision = emvTerminalDecision;
    }

    public void setTransType(EmvTransactionType emvTransactionType) {
        this.transType = emvTransactionType;
    }

    public void setTransactionCategoryCode(String str) {
        this.transactionCategoryCode = str;
    }

    public void setTransactionCurrencyCode(String str) {
        this.transactionCurrencyCode = str;
    }

    public void setTransactionDate(Date date) {
        this.transactionDate = date;
    }
}
