package io.intercom.android.sdk.blocks;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class StyleType {
    private static final /* synthetic */ StyleType[] $VALUES;
    public static final StyleType ADMIN;
    public static final StyleType ARTICLE;
    public static final StyleType ATTRIBUTE_COLLECTOR;
    public static final StyleType CHAT_FULL;
    public static final StyleType CONTAINER_CARD;
    public static final StyleType NOTE;
    public static final StyleType POST;
    public static final StyleType PREVIEW;
    public static final StyleType QUICK_REPLY;
    public static final StyleType USER;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        StyleType $r1 = new StyleType("PREVIEW", 0);
        PREVIEW = $r1;
        StyleType $r12 = new StyleType("USER", 1);
        USER = $r12;
        StyleType $r13 = new StyleType("ADMIN", 2);
        ADMIN = $r13;
        StyleType $r14 = new StyleType("NOTE", 3);
        NOTE = $r14;
        StyleType $r15 = new StyleType("POST", 4);
        POST = $r15;
        StyleType $r16 = new StyleType("CONTAINER_CARD", 5);
        CONTAINER_CARD = $r16;
        StyleType $r17 = new StyleType("CHAT_FULL", 6);
        CHAT_FULL = $r17;
        StyleType $r18 = new StyleType("ARTICLE", 7);
        ARTICLE = $r18;
        StyleType $r19 = new StyleType("QUICK_REPLY", 8);
        QUICK_REPLY = $r19;
        StyleType $r110 = new StyleType("ATTRIBUTE_COLLECTOR", 9);
        ATTRIBUTE_COLLECTOR = $r110;
        StyleType $r0 = PREVIEW;
        StyleType $r02 = USER;
        StyleType $r03 = ADMIN;
        StyleType $r04 = NOTE;
        StyleType $r05 = POST;
        StyleType $r06 = CONTAINER_CARD;
        StyleType $r07 = CHAT_FULL;
        StyleType $r08 = ARTICLE;
        StyleType $r09 = QUICK_REPLY;
        StyleType[] $r2 = {$r0, $r02, $r03, $r04, $r05, $r06, $r07, $r08, $r09, $r110};
        $VALUES = $r2;
    }

    private StyleType(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static StyleType valueOf(String str) {
        Enum $r0 = Enum.valueOf(StyleType.class, str);
        StyleType $r2 = (StyleType) $r0;
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
    public static StyleType[] values() {
        StyleType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        StyleType[] $r12 = (StyleType[]) $r0;
        return $r12;
    }
}
