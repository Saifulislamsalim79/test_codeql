package ai.kudi.agent.transactionhistory.data.model;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.issues.viewmodels.model.WithdrawalTypes;
import ai.kudi.agent.settings.account.ConstantsKt;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionType.kt */
@Metadata(m10422d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, m10421d2 = {"Lai/kudi/agent/transactionhistory/data/model/TransactionType;", "", "labelRes", "", "iconRes", "colorHexString", "", "(Ljava/lang/String;IIILjava/lang/String;)V", "getColorHexString", "()Ljava/lang/String;", "getIconRes", "()I", "getLabelRes", WithdrawalTypes.CASH, "CARD_PAYMENT", ConstantsKt.ACCOUNT_TYPE_CASHOUT, "ELECTRICITY", "WALLET_TOPUP", "AIRTIME", "CHARGE_BACK", "FUNDS_TRANSFER", "CARD_TOPUP", "P2P", "INSURANCE", "WAEC", "POS", "USSD", "BET9JA", "DSTV", "GOTV", "STAR_TIMES", "REFUND", "REVERSAL", "COLLECTIONS", "DELAYED_CREDIT", "COMMISSION", "ONBOARDING_COMMISSION", "COMMISSION_PAYOUT", "DEBIT", "CREDIT", "UNKNOWN", "SAVINGS", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransactionType {
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType AIRTIME;
    public static final TransactionType BET9JA;
    public static final TransactionType CARD_PAYMENT;
    public static final TransactionType CARD_TOPUP;
    public static final TransactionType CASH_OUT;
    public static final TransactionType CASH_WITHDRAWAL;
    public static final TransactionType CHARGE_BACK;
    public static final TransactionType COLLECTIONS;
    public static final TransactionType COMMISSION;
    public static final TransactionType COMMISSION_PAYOUT;
    public static final TransactionType CREDIT;
    public static final TransactionType DEBIT;
    public static final TransactionType DELAYED_CREDIT;
    public static final TransactionType DSTV;
    public static final TransactionType Direct;
    public static final TransactionType ELECTRICITY;
    public static final TransactionType FUNDS_TRANSFER;
    public static final TransactionType GOTV;
    public static final TransactionType INSURANCE;
    public static final TransactionType INTERNET;
    public static final TransactionType ONBOARDING_COMMISSION;
    public static final TransactionType REFUND;
    public static final TransactionType REVERSAL;
    public static final TransactionType SAVINGS;
    public static final TransactionType STAR_TIMES;
    public static final TransactionType UNKNOWN;
    public static final TransactionType USSD;
    public static final TransactionType WAEC;
    public static final TransactionType WALLET_TOPUP;
    private final String colorHexString;
    private final int iconRes;
    private final int labelRes;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private static final /* synthetic */ TransactionType[] $values() {
        TransactionType $r1 = CASH_WITHDRAWAL;
        TransactionType $r12 = CARD_PAYMENT;
        TransactionType $r13 = CASH_OUT;
        TransactionType $r14 = ELECTRICITY;
        TransactionType $r15 = WALLET_TOPUP;
        TransactionType $r16 = AIRTIME;
        TransactionType $r17 = CHARGE_BACK;
        TransactionType $r18 = FUNDS_TRANSFER;
        TransactionType $r19 = CARD_TOPUP;
        TransactionType $r110 = Direct;
        TransactionType $r111 = INSURANCE;
        TransactionType $r112 = WAEC;
        TransactionType $r113 = INTERNET;
        TransactionType $r114 = USSD;
        TransactionType $r115 = BET9JA;
        TransactionType $r116 = DSTV;
        TransactionType $r117 = GOTV;
        TransactionType $r118 = STAR_TIMES;
        TransactionType $r119 = REFUND;
        TransactionType $r120 = REVERSAL;
        TransactionType $r121 = COLLECTIONS;
        TransactionType $r122 = DELAYED_CREDIT;
        TransactionType $r123 = COMMISSION;
        TransactionType $r124 = ONBOARDING_COMMISSION;
        TransactionType $r125 = COMMISSION_PAYOUT;
        TransactionType $r126 = DEBIT;
        TransactionType $r127 = CREDIT;
        TransactionType $r128 = UNKNOWN;
        TransactionType $r129 = SAVINGS;
        TransactionType[] $r0 = {$r1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r110, $r111, $r112, $r113, $r114, $r115, $r116, $r117, $r118, $r119, $r120, $r121, $r122, $r123, $r124, $r125, $r126, $r127, $r128, $r129};
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
        TransactionType $r1 = new TransactionType(WithdrawalTypes.CASH, 0, C0001R.string.cash_withdrawal, C0001R.C0002drawable.ic_transaction_cash_withdrawal, "#16ffb13d");
        CASH_WITHDRAWAL = $r1;
        TransactionType $r12 = new TransactionType("CARD_PAYMENT", 1, C0001R.string.card_payment_merchant, C0001R.C0002drawable.ic_transaction_cash_withdrawal, "#16ffb13d");
        CARD_PAYMENT = $r12;
        TransactionType $r13 = new TransactionType(ConstantsKt.ACCOUNT_TYPE_CASHOUT, 2, C0001R.string.cash_out, C0001R.C0002drawable.ic_transaction_cash_withdrawal, "#16ffb13d");
        CASH_OUT = $r13;
        TransactionType $r14 = new TransactionType("ELECTRICITY", 3, C0001R.string.electricity, C0001R.C0002drawable.ic_transaction_electricity, "#1640AFFF");
        ELECTRICITY = $r14;
        TransactionType $r15 = new TransactionType("WALLET_TOPUP", 4, C0001R.string.wallet_top_up, C0001R.C0002drawable.ic_transaction_wallet_topup, "#16748CAD");
        WALLET_TOPUP = $r15;
        TransactionType $r16 = new TransactionType("AIRTIME", 5, C0001R.string.airtime, C0001R.C0002drawable.ic_transaction_airtime, "#16FF5C00");
        AIRTIME = $r16;
        TransactionType $r17 = new TransactionType("CHARGE_BACK", 6, C0001R.string.charge_back, C0001R.C0002drawable.ic_transaction_chargeback, "#16009255");
        CHARGE_BACK = $r17;
        TransactionType $r18 = new TransactionType("FUNDS_TRANSFER", 7, C0001R.string.funds_transfer, C0001R.C0002drawable.ic_transaction_funds_transfer, "#1600E59E");
        FUNDS_TRANSFER = $r18;
        TransactionType $r19 = new TransactionType("CARD_TOPUP", 8, C0001R.string.card_top_up, C0001R.C0002drawable.ic_transaction_card_topup, "#16748CAD");
        CARD_TOPUP = $r19;
        TransactionType $r110 = new TransactionType("P2P", 9, C0001R.string.voice_input, C0001R.C0002drawable.ic_transaction_p2p, "#16EFEBFF");
        Direct = $r110;
        TransactionType $r111 = new TransactionType("INSURANCE", 10, C0001R.string.insurance, C0001R.C0002drawable.ic_transaction_insurance, "#320F8CFF");
        INSURANCE = $r111;
        TransactionType $r112 = new TransactionType("WAEC", 11, C0001R.string.waec, C0001R.C0002drawable.ic_transaction_waec, "#80D2DDEB");
        WAEC = $r112;
        TransactionType $r113 = new TransactionType("POS", 12, C0001R.string.pos_purchase_lease, C0001R.C0002drawable.ic_transaction_pos, "#24AD5BFF");
        INTERNET = $r113;
        TransactionType $r114 = new TransactionType("USSD", 13, C0001R.string.pos_purchase_lease, C0001R.C0002drawable.ic_transaction_ussd, "#16FF5C00");
        USSD = $r114;
        TransactionType $r115 = new TransactionType("BET9JA", 14, C0001R.string.betting, C0001R.C0002drawable.ic_transaction_bet9ja, "#EFEBFF");
        BET9JA = $r115;
        TransactionType $r116 = new TransactionType("DSTV", 15, C0001R.string.dstv, C0001R.C0002drawable.ic_transaction_dstv, "#16D2DDEB");
        DSTV = $r116;
        TransactionType $r117 = new TransactionType("GOTV", 16, C0001R.string.gotv, C0001R.C0002drawable.ic_transaction_dstv, "#16D2DDEB");
        GOTV = $r117;
        TransactionType $r118 = new TransactionType("STAR_TIMES", 17, C0001R.string.star_times, C0001R.C0002drawable.ic_transaction_dstv, "#16D2DDEB");
        STAR_TIMES = $r118;
        TransactionType $r119 = new TransactionType("REFUND", 18, C0001R.string.refund, C0001R.C0002drawable.ic_transaction_refund, "#160F8CFF");
        REFUND = $r119;
        TransactionType $r120 = new TransactionType("REVERSAL", 19, C0001R.string.reversal, C0001R.C0002drawable.ic_transaction_reversal, "#16009255");
        REVERSAL = $r120;
        TransactionType $r121 = new TransactionType("COLLECTIONS", 20, C0001R.string.merchant_collections, C0001R.C0002drawable.ic_transaction_collection, "#1600E59E");
        COLLECTIONS = $r121;
        TransactionType $r122 = new TransactionType("DELAYED_CREDIT", 21, C0001R.string.delayed_credit, C0001R.C0002drawable.ic_transaction_delayed_credit, "#1600E59E");
        DELAYED_CREDIT = $r122;
        TransactionType $r123 = new TransactionType("COMMISSION", 22, C0001R.string.commission, C0001R.C0002drawable.ic_transaction_commisson, "#16FF5C00");
        COMMISSION = $r123;
        TransactionType $r124 = new TransactionType("ONBOARDING_COMMISSION", 23, C0001R.string.onboarding_commission, C0001R.C0002drawable.ic_transaction_commisson, "#16FF5C00");
        ONBOARDING_COMMISSION = $r124;
        TransactionType $r125 = new TransactionType("COMMISSION_PAYOUT", 24, C0001R.string.commission_payout, C0001R.C0002drawable.ic_transaction_commissions_cashout, "#16FF5C00");
        COMMISSION_PAYOUT = $r125;
        TransactionType $r126 = new TransactionType("DEBIT", 25, C0001R.string.debit, C0001R.C0002drawable.ic_transaction_debit, "#16FF5C00");
        DEBIT = $r126;
        TransactionType $r127 = new TransactionType("CREDIT", 26, C0001R.string.credit, C0001R.C0002drawable.ic_transaction_credit, "#160F8CFF");
        CREDIT = $r127;
        TransactionType $r128 = new TransactionType("UNKNOWN", 27, C0001R.string.not_available, C0001R.C0002drawable.ic_transaction_credit, "#160F8CFF");
        UNKNOWN = $r128;
        TransactionType $r129 = new TransactionType("SAVINGS", 28, C0001R.string.savings, C0001R.C0002drawable.ic_transaction_savings, "#1600E59E");
        SAVINGS = $r129;
        TransactionType[] $r0 = $values();
        $VALUES = $r0;
    }

    private TransactionType(String str, int i, int i2, int i3, String str2) {
        this.labelRes = i2;
        this.iconRes = i3;
        this.colorHexString = str2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static TransactionType valueOf(String str) {
        Enum $r0 = Enum.valueOf(TransactionType.class, str);
        TransactionType $r2 = (TransactionType) $r0;
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
    public static TransactionType[] values() {
        TransactionType[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        TransactionType[] $r12 = (TransactionType[]) $r0;
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
    public final String getColorHexString() {
        String r1 = this.colorHexString;
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
    public final int getIconRes() {
        int i0 = this.iconRes;
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
    public final int getLabelRes() {
        int i0 = this.labelRes;
        return i0;
    }
}
