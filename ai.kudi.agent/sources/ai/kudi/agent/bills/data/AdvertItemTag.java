package ai.kudi.agent.bills.data;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvertItemTag.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/bills/data/AdvertItemTag;", "", "(Ljava/lang/String;I)V", "SAVINGS", "KSHOCK_INELIGIBLE", "KSHOCK_ELIGIBLE", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AdvertItemTag {
    private static final /* synthetic */ AdvertItemTag[] $VALUES;
    public static final AdvertItemTag KSHOCK_ELIGIBLE;
    public static final AdvertItemTag KSHOCK_INELIGIBLE;
    public static final AdvertItemTag SAVINGS;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ AdvertItemTag[] $values() {
        AdvertItemTag $r1 = SAVINGS;
        AdvertItemTag $r12 = KSHOCK_INELIGIBLE;
        AdvertItemTag $r13 = KSHOCK_ELIGIBLE;
        AdvertItemTag[] $r0 = {$r1, $r12, $r13};
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
        AdvertItemTag $r1 = new AdvertItemTag("SAVINGS", 0);
        SAVINGS = $r1;
        AdvertItemTag $r12 = new AdvertItemTag("KSHOCK_INELIGIBLE", 1);
        KSHOCK_INELIGIBLE = $r12;
        AdvertItemTag $r13 = new AdvertItemTag("KSHOCK_ELIGIBLE", 2);
        KSHOCK_ELIGIBLE = $r13;
        AdvertItemTag[] $r0 = $values();
        $VALUES = $r0;
    }

    private AdvertItemTag(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static AdvertItemTag valueOf(String str) {
        Enum $r0 = Enum.valueOf(AdvertItemTag.class, str);
        AdvertItemTag $r2 = (AdvertItemTag) $r0;
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
    public static AdvertItemTag[] values() {
        AdvertItemTag[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        AdvertItemTag[] $r12 = (AdvertItemTag[]) $r0;
        return $r12;
    }
}
