package com.paypad.models.messaging.nibss;
/* loaded from: classes2.dex */
public class _0200Request {
    private String acquiringInstIdCode;
    private String additionalAmounts;
    private String cardAcceptorIdCode;
    private String cardAcceptorNameLocation;
    private String cardExpirationDate;
    private String cardSequenceNumber;
    private String currencyCode;
    private String hashValue;
    private String iccData;
    private String localTransactionDate;
    private String localTransactionTime;
    private String merchantType;
    private String messageReasonCode;
    private String originalDataElements;
    private String pan;
    private String paymentInformation;
    private String pinData;
    private String posConditionCode;
    private String posDataCode;
    private String posEntryMode;
    private String posPinCaptureCode;
    private String processingCode;
    private String retrievalReferenceNumber;
    private String secondaryHashValue;
    private String securityRelatedInformation;
    private String serviceRestrictionCode;
    private String stan;
    private String terminalId;
    private String track2Data;
    private String transactionAmount;
    private String transactionFee;
    private String transmissionDateTime;
    private String transportData;

    public String getAcquiringInstIdCode() {
        return this.acquiringInstIdCode;
    }

    public String getAdditionalAmounts() {
        return this.additionalAmounts;
    }

    public String getCardAcceptorIdCode() {
        return this.cardAcceptorIdCode;
    }

    public String getCardAcceptorNameLocation() {
        return this.cardAcceptorNameLocation;
    }

    public String getCardExpirationDate() {
        return this.cardExpirationDate;
    }

    public String getCardSequenceNumber() {
        return this.cardSequenceNumber;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getHashValue() {
        return this.hashValue;
    }

    public String getIccData() {
        return this.iccData.replace(" ", "");
    }

    public String getLocalTransactionDate() {
        return this.localTransactionDate;
    }

    public String getLocalTransactionTime() {
        return this.localTransactionTime;
    }

    public String getMerchantType() {
        return this.merchantType;
    }

    public String getMessageReasonCode() {
        return this.messageReasonCode;
    }

    public String getOriginalDataElements() {
        return this.originalDataElements;
    }

    public String getPan() {
        return this.pan;
    }

    public String getPaymentInformation() {
        return this.paymentInformation;
    }

    public String getPinData() {
        return this.pinData;
    }

    public String getPosConditionCode() {
        return this.posConditionCode;
    }

    public String getPosDataCode() {
        return this.posDataCode;
    }

    public String getPosEntryMode() {
        return this.posEntryMode;
    }

    public String getPosPinCaptureCode() {
        return this.posPinCaptureCode;
    }

    public String getProcessingCode() {
        return this.processingCode;
    }

    public String getRetrievalReferenceNumber() {
        return this.retrievalReferenceNumber;
    }

    public String getSecondaryHashValue() {
        return this.secondaryHashValue;
    }

    public String getSecurityRelatedInformation() {
        return this.securityRelatedInformation;
    }

    public String getServiceRestrictionCode() {
        return this.serviceRestrictionCode;
    }

    public String getStan() {
        return this.stan;
    }

    public String getTerminalId() {
        return this.terminalId;
    }

    public String getTrack2Data() {
        return this.track2Data.replace("?", "").replace(";", "").replace("=", "D");
    }

    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public String getTransactionFee() {
        return this.transactionFee;
    }

    public String getTransmissionDateTime() {
        return this.transmissionDateTime;
    }

    public String getTransportData() {
        return this.transportData;
    }

    public void setAcquiringInstIdCode(String str) {
        this.acquiringInstIdCode = str;
    }

    public void setAdditionalAmounts(String str) {
        this.additionalAmounts = str;
    }

    public void setCardAcceptorIdCode(String str) {
        this.cardAcceptorIdCode = str;
    }

    public void setCardAcceptorNameLocation(String str) {
        this.cardAcceptorNameLocation = str;
    }

    public void setCardExpirationDate(String str) {
        this.cardExpirationDate = str;
    }

    public void setCardSequenceNumber(String str) {
        this.cardSequenceNumber = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setHashValue(String str) {
        this.hashValue = str;
    }

    public void setIccData(String str) {
        this.iccData = str;
    }

    public void setLocalTransactionDate(String str) {
        this.localTransactionDate = str;
    }

    public void setLocalTransactionTime(String str) {
        this.localTransactionTime = str;
    }

    public void setMerchantType(String str) {
        this.merchantType = str;
    }

    public void setMessageReasonCode(String str) {
        this.messageReasonCode = str;
    }

    public void setOriginalDataElements(String str) {
        this.originalDataElements = str;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setPaymentInformation(String str) {
        this.paymentInformation = str;
    }

    public void setPinData(String str) {
        this.pinData = str;
    }

    public void setPosConditionCode(String str) {
        this.posConditionCode = str;
    }

    public void setPosDataCode(String str) {
        this.posDataCode = str;
    }

    public void setPosEntryMode(String str) {
        this.posEntryMode = str;
    }

    public void setPosPinCaptureCode(String str) {
        this.posPinCaptureCode = str;
    }

    public void setProcessingCode(String str) {
        this.processingCode = str;
    }

    public void setRetrievalReferenceNumber(String str) {
        this.retrievalReferenceNumber = str;
    }

    public void setSecondaryHashValue(String str) {
        this.secondaryHashValue = str;
    }

    public void setSecurityRelatedInformation(String str) {
        this.securityRelatedInformation = str;
    }

    public void setServiceRestrictionCode(String str) {
        this.serviceRestrictionCode = str;
    }

    public void setStan(String str) {
        this.stan = str;
    }

    public void setTerminalId(String str) {
        this.terminalId = str;
    }

    public void setTrack2Data(String str) {
        this.track2Data = str;
    }

    public void setTransactionAmount(String str) {
        this.transactionAmount = str;
    }

    public void setTransactionFee(String str) {
        this.transactionFee = str;
    }

    public void setTransmissionDateTime(String str) {
        this.transmissionDateTime = str;
    }

    public void setTransportData(String str) {
        this.transportData = str;
    }
}
