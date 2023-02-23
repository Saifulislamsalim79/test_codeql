package com.paypad.models.messaging.nibss;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class PurchaseResponse {
    public String field39;
    public Map<String, String> messages = new HashMap();

    public String getField39() {
        return this.field39;
    }

    public void returnMessage() {
        this.messages.put("00", "TRANSACTION SUCCESSFUL");
        this.messages.put("01", "REFER TO CARD ISSUER");
        this.messages.put("02", "REFER TO CARD ISSUER");
        this.messages.put("03", "INVALID MERCHANT");
        this.messages.put("04", "PICK-UP CARD");
        this.messages.put("05", "DO NOT HONOUR");
        this.messages.put("06", "ERROR");
        this.messages.put("07", "PICK-UP CARD");
        this.messages.put("08", "HONOUR WITH ID");
        this.messages.put("09", "REQUEST IN PROGRESS");
        this.messages.put("10", "APPROVED, PARTIAL");
        this.messages.put("11", "APPROVED, VIP");
        this.messages.put("12", "INVALID TRANSACTION");
        this.messages.put("13", "INVALID AMOUNT");
        this.messages.put("14", "INVALID CARD NUMBER");
        this.messages.put("15", "NO SUCH ISSUER");
        this.messages.put("16", "APPROVED UPDATE TRACK3");
        this.messages.put("17", "CUSTOMER CANCELLATION");
        this.messages.put("18", "CUSTOMER DISPUTE");
        this.messages.put("19", "RE-ENTER TRANSACTION");
        this.messages.put("20", "INVALID RESPONSE");
        this.messages.put("21", "NO ACTION TAKEN");
        this.messages.put("22", "SUSPECTED MALFUNCTION");
        this.messages.put("23", "UNACCEPTABLE FEE FOR TRANSACTION");
        this.messages.put("24", "FILE UPDATE NOT SUPPORTED");
        this.messages.put("25", "UNABLE TO LOCATE RECORD");
        this.messages.put("26", "DUPLICATE RECORD");
        this.messages.put("27", "FILE UPDATE; EDIT ERROR");
        this.messages.put("28", "FILE UPDATE; FILE LOCKED");
        this.messages.put("29", "FILE UPDATE FAILED");
        this.messages.put("30", "FORMAT ERROR");
        this.messages.put("31", "BANK NOT SUPPORTED");
        this.messages.put("32", "COMPLETED PARTIALLY");
        this.messages.put("33", "EXPIRED CARD; PICK-UP");
        this.messages.put("34", "SUSPECTED FRAUD; PICK-UP");
        this.messages.put("35", "CONTACT ACQUIRER; PICK-UP");
        this.messages.put("36", "RESTRICTED CARD; PICK-UP");
        this.messages.put("37", "CALL ACQUIRER SECURITY; PICK-UP");
        this.messages.put("38", "PIN TRIES EXCEEDED; PICK-UP");
        this.messages.put("39", "NO CREDIT ACCOUNT");
        this.messages.put("40", "FUNCTION NOT SUPPORTED");
        this.messages.put("41", "LOST CARD");
        this.messages.put("42", "NO UNIVERSAL ACCOUNT");
        this.messages.put("43", "STOLEN CARD");
        this.messages.put("44", "NO INVESTMENT ACCOUNT");
        this.messages.put("51", "INSUFFICIENT FUND");
        this.messages.put("52", "NO CURRENT ACCOUNT");
        this.messages.put("53", "NO SAVINGS ACCOUNT");
        this.messages.put("54", "CARD EXPIRED");
        this.messages.put("55", "INCORRECT PIN");
        this.messages.put("56", "NO CARD RECORD");
        this.messages.put("57", "TRANSACTION NOT PERMITTED");
        this.messages.put("58", "TRANSACTION NOT PERMITTED");
        this.messages.put("59", "SUSPECTED FRAUD");
        this.messages.put("60", "CONTACT ACQUIRER");
        this.messages.put("61", "EXCEEDS WITHDRAWAL LIMIT");
        this.messages.put("62", "RESTRICTED CARD");
        this.messages.put("63", "SECURITY VIOLATION");
        this.messages.put("64", "ORIGINAL AMOUNT INCORRECT");
        this.messages.put("65", "EXCEEDS WITHDRAWAL FREQ");
        this.messages.put("66", "CALL ACQUIRER SECURITY");
        this.messages.put("67", "HARD CAPTURE");
        this.messages.put("68", "RESPONSE RECEIVED TOO LATE");
        this.messages.put("75", "PIN TRY EXCEEDED");
        this.messages.put("77", "BANK INTERVENE");
        this.messages.put("78", "BANK INTERVENE");
        this.messages.put("90", "CUT-OFF IN PROGRESS");
        this.messages.put("91", "ISSUER OR SWITCH INOPERATIVE");
        this.messages.put("92", "ROUTING ERROR");
        this.messages.put("93", "LAW VIOLATION");
        this.messages.put("94", "DUPLICATE TRANSACTION");
        this.messages.put("95", "RECONCILE ERROR");
        this.messages.put("96", "  SYSTEM MALFUNCTION");
        this.messages.put("98", "EXCEEDS CASH LIMIT");
    }

    public void setField39(String str) {
        this.field39 = str;
    }
}
