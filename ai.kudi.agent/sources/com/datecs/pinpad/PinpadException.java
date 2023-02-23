package com.datecs.pinpad;

import java.io.IOException;
/* loaded from: classes2.dex */
public class PinpadException extends IOException {

    /* renamed from: c */
    private int f6883c;

    public PinpadException(int i) {
        super(m33090b(i));
        this.f6883c = i;
    }

    /* renamed from: b */
    private static final String m33090b(int i) {
        switch (i) {
            case 0:
                return "No error";
            case 1:
                return "General error";
            case 2:
                return "Not valid command or sub command code";
            case 3:
                return "Invalid parameter";
            case 4:
                return "The address is outside limits";
            case 5:
                return "The value is outside limits";
            case 6:
                return "The length is outside limits";
            case 7:
                return "The action is not permit in current state";
            case 8:
                return "There is no data to be returned";
            case 9:
                return "Timeout occurs";
            case 10:
                return "Invalid key number";
            case 11:
                return "Invalid key attributes(usage)";
            case 12:
                return "Calling of non-existing device";
            case 13:
                return "(Not used in this FW version)";
            case 14:
                return "Pin entering limit exceed";
            case 15:
                return "General in flash commands";
            case 16:
                return "General hardware error";
            case 17:
                return "(Not used in this FW version)";
            case 18:
                return "The button \"CANCEL\" is pressed";
            case 19:
                return "Invalid signature";
            case 20:
                return "Invalid data in header";
            case 21:
                return "Incorrect password";
            case 22:
                return "Invalid key format";
            case 23:
                return "General error in smart card reader";
            case 24:
                return "Error code returned from HAL functions";
            case 25:
                return "Invalid key (may be no present)";
            case 26:
                return "The PIN length is <4 or >12";
            case 27:
                return "Issuer or ICC key invalid remainder length";
            case 28:
            case 29:
            case 30:
                return "(Not used in this FW version)";
            case 31:
                return "The action is not permitted";
            case 32:
                return "TMK is not loaded. The action cannot be executed";
            case 33:
                return "Wrong key format";
            case 34:
                return "Duplicated key";
            default:
                return "Unspecified error code";
        }
    }

    /* renamed from: a */
    public int m33091a() {
        return this.f6883c;
    }
}
