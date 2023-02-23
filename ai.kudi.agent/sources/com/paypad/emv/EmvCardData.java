package com.paypad.emv;
/* loaded from: classes2.dex */
public class EmvCardData {
    private String aid;
    private String appLabel;
    private String cardExpiryDate;
    private String cardHolderName;
    private String cardSequenceNo;
    private String iin;
    private String pan;
    private String track1;
    private String track2;

    public String getAid() {
        return this.aid;
    }

    public String getAppLabel() {
        return this.appLabel;
    }

    public String getCardExpiryDate() {
        return this.cardExpiryDate;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardSequenceNo() {
        return this.cardSequenceNo;
    }

    public String getIin() {
        return this.iin;
    }

    public String getPan() {
        return this.pan;
    }

    public String getTrack1() {
        return this.track1;
    }

    public String getTrack2() {
        return this.track2;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppLabel(String str) {
        this.appLabel = str;
    }

    public void setCardExpiryDate(String str) {
        this.cardExpiryDate = str;
    }

    public void setCardHolderName(String str) {
        this.cardHolderName = str;
    }

    public void setCardSequenceNo(String str) {
        this.cardSequenceNo = str;
    }

    public void setIin(String str) {
        this.iin = str;
    }

    public void setPan(String str) {
        this.pan = str;
    }

    public void setTrack1(String str) {
        this.track1 = str;
    }

    public void setTrack2(String str) {
        this.track2 = str;
    }
}
