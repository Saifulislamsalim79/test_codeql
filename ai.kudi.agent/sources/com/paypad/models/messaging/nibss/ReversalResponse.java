package com.paypad.models.messaging.nibss;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class ReversalResponse {
    public String field39;
    public Map<String, String> messages = new HashMap();

    public String getField39() {
        return this.field39;
    }

    public void returnMessage() {
        this.messages.put("00", "Transaction successful");
        this.messages.put("14", "Invalid card number");
        this.messages.put("30", "Format error");
        this.messages.put("51", "Insufficient fund");
        this.messages.put("52", "No current account");
        this.messages.put("53", "No savings account");
        this.messages.put("54", "Card expired");
        this.messages.put("55", "Incorrect pin");
        this.messages.put("57", "Transaction not permitted");
        this.messages.put("58", "Transaction not permitted");
        this.messages.put("63", "Security Violation");
        this.messages.put("91", "Issuer or switch inoperative");
        this.messages.put("92", "Routing Error");
        this.messages.put("94", "Duplicate transaction");
        this.messages.put("96", "System Malfunction");
    }

    public void setField39(String str) {
        this.field39 = str;
    }
}
