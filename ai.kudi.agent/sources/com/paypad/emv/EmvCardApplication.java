package com.paypad.emv;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class EmvCardApplication {
    private String aid;
    private String appName;
    private List<EmvCardKey> cardKeys = new ArrayList();
    private boolean partialMatch;
    private String version;

    public String getAid() {
        return this.aid;
    }

    public String getAppName() {
        return this.appName;
    }

    public List<EmvCardKey> getCardKeys() {
        return this.cardKeys;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isPartialMatch() {
        return this.partialMatch;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCardKeys(List<EmvCardKey> list) {
        this.cardKeys = list;
    }

    public void setPartialMatch(boolean z) {
        this.partialMatch = z;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
