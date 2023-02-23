package com.paypad.emv;
/* loaded from: classes2.dex */
public class EmvResponse {
    private String aip;
    private String amountAuthorized;
    private String amountOther;
    private long amountOtherLong;
    private String appVersionName;
    private String atc;
    private EmvCardData cardData;
    private String cryptogram;
    private String cryptogramInformationData;
    private String cvmResult;
    private String dedicatedFileName;
    private String iad;
    private String ksn;
    private String pan;
    private String panSequenceNo;
    private String pinData;
    private TransResult result;
    private String terminalCapabilities;
    private String terminalCountryCode;
    private long terminalCountryCodeLong;
    private String terminalType;
    private String transDate;
    private String transactionCategoryCode;
    private String transactionCurrencyCode;
    private long transactionCurrencyCodeLong;
    private String transactionType;
    private String tsi;
    private String tvr;
    private String unpredictableNo;
    private String verboseFailureDescription;
    private CardHolderVerifyMethod verifyMethod;
    private boolean wasFallBack;
    private boolean wasPinBypassed;

    public String getAip() {
        return this.aip;
    }

    public String getAmountAuthorized() {
        return this.amountAuthorized;
    }

    public String getAmountOther() {
        return this.amountOther;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public String getAtc() {
        return this.atc;
    }

    public EmvCardData getCardData() {
        return this.cardData;
    }

    public String getCryptogram() {
        return this.cryptogram;
    }

    public String getCryptogramInformationData() {
        return this.cryptogramInformationData;
    }

    public String getCvmResult() {
        return this.cvmResult;
    }

    public String getDedicatedFileName() {
        return this.dedicatedFileName;
    }

    public String getIad() {
        return this.iad;
    }

    public String getKsn() {
        return this.ksn;
    }

    public String getPan() {
        return this.pan;
    }

    public String getPanSequenceNo() {
        return this.panSequenceNo;
    }

    public String getPinData() {
        return this.pinData;
    }

    public TransResult getResult() {
        return this.result;
    }

    public String getTerminalCapabilities() {
        return this.terminalCapabilities;
    }

    public String getTerminalCountryCode() {
        return this.terminalCountryCode;
    }

    public long getTerminalCountryCodeLong() {
        return this.terminalCountryCodeLong;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public String getTransDate() {
        return this.transDate;
    }

    public String getTransactionCategoryCode() {
        return this.transactionCategoryCode;
    }

    public String getTransactionCurrencyCode() {
        return this.transactionCurrencyCode;
    }

    public long getTransactionCurrencyCodeLong() {
        return this.transactionCurrencyCodeLong;
    }

    public String getTransactionType() {
        return this.transactionType;
    }

    public String getTsi() {
        return this.tsi;
    }

    public String getTvr() {
        return this.tvr;
    }

    public String getUnpredictableNo() {
        return this.unpredictableNo;
    }

    public String getVerboseFailureDescription() {
        return this.verboseFailureDescription;
    }

    public CardHolderVerifyMethod getVerifyMethod() {
        return this.verifyMethod;
    }

    public boolean isWasFallBack() {
        return this.wasFallBack;
    }

    public boolean isWasPinBypassed() {
        return this.wasPinBypassed;
    }

    public void setAip(String str) {
        this.aip = str;
    }

    public void setAmountAuthorized(String str) {
        this.amountAuthorized = str;
    }

    public void setAmountOther(String str) {
        this.amountOther = str;
    }

    public void setAppVersionName(String str) {
        this.appVersionName = str;
    }

    public void setAtc(String str) {
        this.atc = str;
    }

    public void setCardData(EmvCardData emvCardData) {
        this.cardData = emvCardData;
    }

    public void setCryptogram(String str) {
        this.cryptogram = str;
    }

    public void setCryptogramInformationData(String str) {
        this.cryptogramInformationData = str;
    }

    public void setCvmResult(String str) {
        this.cvmResult = str;
    }

    public void setDedicatedFileName(String str) {
        this.dedicatedFileName = str;
    }

    public void setIad(String str) {
        this.iad = str;
    }

    public void setKsn(String str) {
        this.ksn = str;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setPanSequenceNo(String str) {
        this.panSequenceNo = str;
    }

    public void setPinData(String str) {
        this.pinData = str;
    }

    public void setResult(TransResult transResult) {
        this.result = transResult;
    }

    public void setTerminalCapabilities(String str) {
        this.terminalCapabilities = str;
    }

    public void setTerminalCountryCode(String str) {
        this.terminalCountryCode = str;
        this.terminalCountryCodeLong = Long.parseLong(str);
    }

    public void setTerminalType(String str) {
        this.terminalType = str;
    }

    public void setTransDate(String str) {
        this.transDate = str;
    }

    public void setTransactionCategoryCode(String str) {
        this.transactionCategoryCode = str;
    }

    public void setTransactionCurrencyCode(String str) {
        this.transactionCurrencyCode = str;
        this.transactionCurrencyCodeLong = Long.parseLong(str);
    }

    public void setTransactionType(String str) {
        this.transactionType = str;
    }

    public void setTsi(String str) {
        this.tsi = str;
    }

    public void setTvr(String str) {
        this.tvr = str;
    }

    public void setUnpredictableNo(String str) {
        this.unpredictableNo = str;
    }

    public void setVerboseFailureDescription(String str) {
        this.verboseFailureDescription = str;
    }

    public void setVerifyMethod(CardHolderVerifyMethod cardHolderVerifyMethod) {
        this.verifyMethod = cardHolderVerifyMethod;
    }

    public void setWasFallBack(boolean z) {
        this.wasFallBack = z;
    }

    public void setWasPinBypassed(boolean z) {
        this.wasPinBypassed = z;
    }
}
