package ai.kudi.agent.p036v2.utils;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MerchantTypes.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/v2/utils/MarketplaceProductTypes;", "", "(Ljava/lang/String;I)V", "SHORT_TEXT", "LONG_TEXT", "EMAIL", "NUMBER", "PHONE_NUMBER", "CUSTOMER_PHONE_NUMBER", "IMAGE", "DATE", "DOCUMENT", "DROPDOWN", "SINGLE_CHOICE", "MULTIPLE_CHOICE", "ASSOCIATED_FIELD", "LGA", "STATE", "MONEY", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.utils.MarketplaceProductTypes */
/* loaded from: classes.dex */
public final class MarketplaceProductTypes {
    private static final /* synthetic */ MarketplaceProductTypes[] $VALUES;
    public static final MarketplaceProductTypes ASSOCIATED_FIELD;
    public static final MarketplaceProductTypes CUSTOMER_PHONE_NUMBER;
    public static final MarketplaceProductTypes DATE;
    public static final MarketplaceProductTypes DOCUMENT;
    public static final MarketplaceProductTypes DROPDOWN;
    public static final MarketplaceProductTypes EMAIL;
    public static final MarketplaceProductTypes IMAGE;
    public static final MarketplaceProductTypes LONG_TEXT;
    public static final MarketplaceProductTypes MONEY;
    public static final MarketplaceProductTypes MULTIPLE_CHOICE;
    public static final MarketplaceProductTypes NUMBER;
    public static final MarketplaceProductTypes OVERRIDE;
    public static final MarketplaceProductTypes PHONE_NUMBER;
    public static final MarketplaceProductTypes SHORT_TEXT;
    public static final MarketplaceProductTypes SINGLE_CHOICE;
    public static final MarketplaceProductTypes STATE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ MarketplaceProductTypes[] $values() {
        MarketplaceProductTypes $r1 = SHORT_TEXT;
        MarketplaceProductTypes $r12 = LONG_TEXT;
        MarketplaceProductTypes $r13 = EMAIL;
        MarketplaceProductTypes $r14 = NUMBER;
        MarketplaceProductTypes $r15 = PHONE_NUMBER;
        MarketplaceProductTypes $r16 = CUSTOMER_PHONE_NUMBER;
        MarketplaceProductTypes $r17 = IMAGE;
        MarketplaceProductTypes $r18 = DATE;
        MarketplaceProductTypes $r19 = DOCUMENT;
        MarketplaceProductTypes $r110 = DROPDOWN;
        MarketplaceProductTypes $r111 = SINGLE_CHOICE;
        MarketplaceProductTypes $r112 = MULTIPLE_CHOICE;
        MarketplaceProductTypes $r113 = ASSOCIATED_FIELD;
        MarketplaceProductTypes $r114 = OVERRIDE;
        MarketplaceProductTypes $r115 = STATE;
        MarketplaceProductTypes $r116 = MONEY;
        MarketplaceProductTypes[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116};
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        MarketplaceProductTypes $r1 = new MarketplaceProductTypes("SHORT_TEXT", 0);
        SHORT_TEXT = $r1;
        MarketplaceProductTypes $r12 = new MarketplaceProductTypes("LONG_TEXT", 1);
        LONG_TEXT = $r12;
        MarketplaceProductTypes $r13 = new MarketplaceProductTypes("EMAIL", 2);
        EMAIL = $r13;
        MarketplaceProductTypes $r14 = new MarketplaceProductTypes("NUMBER", 3);
        NUMBER = $r14;
        MarketplaceProductTypes $r15 = new MarketplaceProductTypes("PHONE_NUMBER", 4);
        PHONE_NUMBER = $r15;
        MarketplaceProductTypes $r16 = new MarketplaceProductTypes("CUSTOMER_PHONE_NUMBER", 5);
        CUSTOMER_PHONE_NUMBER = $r16;
        MarketplaceProductTypes $r17 = new MarketplaceProductTypes("IMAGE", 6);
        IMAGE = $r17;
        MarketplaceProductTypes $r18 = new MarketplaceProductTypes("DATE", 7);
        DATE = $r18;
        MarketplaceProductTypes $r19 = new MarketplaceProductTypes("DOCUMENT", 8);
        DOCUMENT = $r19;
        MarketplaceProductTypes $r110 = new MarketplaceProductTypes("DROPDOWN", 9);
        DROPDOWN = $r110;
        MarketplaceProductTypes $r111 = new MarketplaceProductTypes("SINGLE_CHOICE", 10);
        SINGLE_CHOICE = $r111;
        MarketplaceProductTypes $r112 = new MarketplaceProductTypes("MULTIPLE_CHOICE", 11);
        MULTIPLE_CHOICE = $r112;
        MarketplaceProductTypes $r113 = new MarketplaceProductTypes("ASSOCIATED_FIELD", 12);
        ASSOCIATED_FIELD = $r113;
        MarketplaceProductTypes $r114 = new MarketplaceProductTypes("LGA", 13);
        OVERRIDE = $r114;
        MarketplaceProductTypes $r115 = new MarketplaceProductTypes("STATE", 14);
        STATE = $r115;
        MarketplaceProductTypes $r116 = new MarketplaceProductTypes("MONEY", 15);
        MONEY = $r116;
        MarketplaceProductTypes[] $r0 = $values();
        $VALUES = $r0;
    }

    private MarketplaceProductTypes(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static MarketplaceProductTypes valueOf(String str) {
        Enum $r0 = Enum.valueOf(MarketplaceProductTypes.class, str);
        MarketplaceProductTypes $r2 = (MarketplaceProductTypes) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static MarketplaceProductTypes[] values() {
        MarketplaceProductTypes[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        MarketplaceProductTypes[] $r12 = (MarketplaceProductTypes[]) $r0;
        return $r12;
    }
}
