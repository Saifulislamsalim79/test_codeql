package com.paypad.emv;
/* loaded from: classes2.dex */
public class PinEntry {
    private int stars;
    private PinEntryState state;

    /* loaded from: classes2.dex */
    public enum PinEntryState {
        SessionBegin,
        Entry,
        CloseSession,
        WrongPin,
        CorrectPin,
        LastPinTry
    }

    public int getStars() {
        return this.stars;
    }

    public PinEntryState getState() {
        return this.state;
    }

    public void setStars(int i) {
        this.stars = i;
    }

    public void setState(PinEntryState pinEntryState) {
        this.state = pinEntryState;
    }
}
