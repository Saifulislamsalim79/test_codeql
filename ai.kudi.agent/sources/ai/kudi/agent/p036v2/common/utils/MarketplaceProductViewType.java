package ai.kudi.agent.p036v2.common.utils;

import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceProductViewType.kt */
@Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/v2/common/utils/MarketplaceProductViewType;", "", AttributeType.TEXT, "", "hasButton", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "PRODUCT_VIEW", "PRODUCT_BUSINESS_SECTOR", "BEST_COMMISSIONS", "TOP_PICKS", "feature-collections_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.common.utils.MarketplaceProductViewType */
/* loaded from: classes.dex */
public final class MarketplaceProductViewType {
    private static final /* synthetic */ MarketplaceProductViewType[] $VALUES;
    public static final MarketplaceProductViewType BEST_COMMISSIONS;
    public static final MarketplaceProductViewType PRODUCT_BUSINESS_SECTOR;
    public static final MarketplaceProductViewType PRODUCT_VIEW;
    public static final MarketplaceProductViewType TOP_PICKS;
    private String text;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ MarketplaceProductViewType[] $values() {
        MarketplaceProductViewType $r1 = PRODUCT_VIEW;
        MarketplaceProductViewType $r12 = PRODUCT_BUSINESS_SECTOR;
        MarketplaceProductViewType $r13 = BEST_COMMISSIONS;
        MarketplaceProductViewType $r14 = TOP_PICKS;
        MarketplaceProductViewType[] $r0 = {$r1, $r12, $r13, $r14};
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
        MarketplaceProductViewType $r1 = new MarketplaceProductViewType("PRODUCT_VIEW", 0, "", false);
        PRODUCT_VIEW = $r1;
        MarketplaceProductViewType $r12 = new MarketplaceProductViewType("PRODUCT_BUSINESS_SECTOR", 1, "", false);
        PRODUCT_BUSINESS_SECTOR = $r12;
        MarketplaceProductViewType $r13 = new MarketplaceProductViewType("BEST_COMMISSIONS", 2, "Best Commissions", true);
        BEST_COMMISSIONS = $r13;
        MarketplaceProductViewType $r14 = new MarketplaceProductViewType("TOP_PICKS", 3, "Top Picks", true);
        TOP_PICKS = $r14;
        MarketplaceProductViewType[] $r0 = $values();
        $VALUES = $r0;
    }

    private MarketplaceProductViewType(String str, int i, String str2, boolean z) {
        this.text = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static MarketplaceProductViewType valueOf(String str) {
        Enum $r0 = Enum.valueOf(MarketplaceProductViewType.class, str);
        MarketplaceProductViewType $r2 = (MarketplaceProductViewType) $r0;
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
    public static MarketplaceProductViewType[] values() {
        MarketplaceProductViewType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        MarketplaceProductViewType[] $r12 = (MarketplaceProductViewType[]) $r0;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getText() {
        String r1 = this.text;
        return r1;
    }

    public final void setText(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.text = str;
    }
}
