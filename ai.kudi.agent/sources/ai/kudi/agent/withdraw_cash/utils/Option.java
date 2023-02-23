package ai.kudi.agent.withdraw_cash.utils;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.pos.data.PosTypeData;
import ai.kudi.agent.transactions.domain.dto.Method;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Option.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u000fj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, m10421d2 = {"Lai/kudi/agent/withdraw_cash/utils/Option;", "", "iconId", "", "label", "", KudiPin.KUDI_PIN_DESC, "remoteConfigKey", "isEnabled", "", "isNewlyAdded", "posTypeData", "Lai/kudi/agent/pos/data/PosTypeData;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLai/kudi/agent/pos/data/PosTypeData;)V", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "getIconId", "()I", "()Z", "setEnabled", "(Z)V", "setNewlyAdded", "getLabel", "getPosTypeData", "()Lai/kudi/agent/pos/data/PosTypeData;", "setPosTypeData", "(Lai/kudi/agent/pos/data/PosTypeData;)V", "getRemoteConfigKey", "CARD_WITHDRAWAL", "USSD_WITHDRAWAL", "MPOS", "KUDI_VOUCHER", "BUY_POS", "LEASE_POS", "OUTLET_NEW_AGENT", "OUTLET_EXISTING_AGENT", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class Option {
    private static final /* synthetic */ Option[] $VALUES;
    public static final Option BUY_POS;
    public static final Option CARD_WITHDRAWAL;
    public static final Option KUDI_VOUCHER;
    public static final Option LEASE_POS;
    public static final Option MPOS;
    public static final Option OUTLET_EXISTING_AGENT;
    public static final Option OUTLET_NEW_AGENT;
    public static final Option USSD_WITHDRAWAL;
    private String desc;
    private final int iconId;
    private boolean isEnabled;
    private boolean isNewlyAdded;
    private final String label;
    private PosTypeData posTypeData;
    private final String remoteConfigKey;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ Option[] $values() {
        Option $r1 = CARD_WITHDRAWAL;
        Option $r12 = USSD_WITHDRAWAL;
        Option $r13 = MPOS;
        Option $r14 = KUDI_VOUCHER;
        Option $r15 = BUY_POS;
        Option $r16 = LEASE_POS;
        Option $r17 = OUTLET_NEW_AGENT;
        Option $r18 = OUTLET_EXISTING_AGENT;
        Option[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18};
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
        Option $r1 = new Option("CARD_WITHDRAWAL", 0, C0001R.C0002drawable.ic_card_withdrawal, "Card Withdrawal", "Make withdrawals for customers seamlessly from their debit card.", Method.TOKEN_CARD, false, false, null, 96, null);
        CARD_WITHDRAWAL = $r1;
        Option $r12 = new Option("USSD_WITHDRAWAL", 1, C0001R.C0002drawable.ic_ussd_withdrawal, "USSD Withdrawal", "Generate withdrawal voucher using customers’ bank USSD.", BanksWithMethods.METHOD_USSD, false, false, null, 112, null);
        USSD_WITHDRAWAL = $r12;
        Option $r13 = new Option("MPOS", 2, C0001R.C0002drawable.ic_mpos, "Withdraw with mPOS", "Make withdrawal using Kudi Pay Pad.", "mpos", false, false, null, 112, null);
        MPOS = $r13;
        Option $r14 = new Option("KUDI_VOUCHER", 3, C0001R.C0002drawable.ic_kudi_voucher, "KudiVoucherTM", "Users can initiate withdrawals using their bank USSD.", "kudi_voucher", false, false, null, 112, null);
        KUDI_VOUCHER = $r14;
        Option $r15 = new Option("BUY_POS", 4, C0001R.C0002drawable.options_buy_pos, "Buy POS", "Make an outright payment of N20,000 and own a POS terminal", "buy_pos", false, false, null, 112, null);
        BUY_POS = $r15;
        Option $r16 = new Option("LEASE_POS", 5, C0001R.C0002drawable.ic_lease_pos, "Lease POS", "Lease a POS for just N20,000. Terms & Conditions apply.", "lease_pos", false, false, null, 112, null);
        LEASE_POS = $r16;
        Option $r17 = new Option("OUTLET_NEW_AGENT", 6, C0001R.C0002drawable.ic_new_agent_outlet_mgt, "New Business", "Would you like to create a new nomba account? Click here", "new_agent_outlet", false, false, null, 112, null);
        OUTLET_NEW_AGENT = $r17;
        Option $r18 = new Option("OUTLET_EXISTING_AGENT", 7, C0001R.C0002drawable.existing_agent_layer, "Existing Business", "If the business you want to link has an account with nomba. Click here.", "existing_agent_outlet", false, false, null, 112, null);
        OUTLET_EXISTING_AGENT = $r18;
        Option[] $r0 = $values();
        $VALUES = $r0;
    }

    private Option(String str, int i, int i2, String str2, String str3, String str4, boolean z, boolean z2, PosTypeData posTypeData) {
        this.iconId = i2;
        this.label = str2;
        this.desc = str3;
        this.remoteConfigKey = str4;
        this.isEnabled = z;
        this.isNewlyAdded = z2;
        this.posTypeData = posTypeData;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    /* synthetic */ Option(java.lang.String r2, int r3, int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9, ai.kudi.agent.pos.data.PosTypeData r10, int r11, kotlin.p483e0.p485d.DBUtils$1 r12) {
        /*
            r1 = this;
            r0 = r11 & 16
            if (r0 == 0) goto L6
            r8 = 1
            goto L6
        L6:
            r0 = r11 & 32
            if (r0 == 0) goto Lc
            r9 = 0
            goto Lc
        Lc:
            r11 = r11 & 64
            if (r11 == 0) goto L12
            r10 = 0
            goto L12
        L12:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.withdraw_cash.utils.Option.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, ai.kudi.agent.pos.data.PosTypeData, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Option valueOf(String str) {
        Enum $r0 = Enum.valueOf(Option.class, str);
        Option $r2 = (Option) $r0;
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
    public static Option[] values() {
        Option[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        Option[] $r12 = (Option[]) $r0;
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
    public final String getDesc() {
        String r1 = this.desc;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final int getIconId() {
        int i0 = this.iconId;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getLabel() {
        String r1 = this.label;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final PosTypeData getPosTypeData() {
        PosTypeData r1 = this.posTypeData;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getRemoteConfigKey() {
        String r1 = this.remoteConfigKey;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isEnabled() {
        boolean z0 = this.isEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isNewlyAdded() {
        boolean z0 = this.isNewlyAdded;
        return z0;
    }

    public final void setDesc(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.desc = str;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setNewlyAdded(boolean z) {
        this.isNewlyAdded = z;
    }

    public final void setPosTypeData(PosTypeData posTypeData) {
        this.posTypeData = posTypeData;
    }
}
